package com.hiideals.form

import com.springapp.Images

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.pdmodel.PDPage
import org.apache.pdfbox.pdmodel.PDPageContentStream
import org.apache.pdfbox.pdmodel.font.PDType1Font
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.multipart.MultipartHttpServletRequest
import java.nio.file.Files
import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

@Transactional(readOnly = true)
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class InternationalCertificateController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	
    def create() {
        respond new InternationalCertificate(params)
    }

    @Transactional
    def save(InternationalCertificate internationalCertificateInstance) {
        if (internationalCertificateInstance == null) {
            notFound()
            return
        }

        if (internationalCertificateInstance.hasErrors()) {
            respond internationalCertificateInstance.errors, view: 'create'
            return
        }

        // Generate registration number
        internationalCertificateInstance.regNo = generateRegistrationNumber()
		
		/*def stPath = grailsApplication.config.juserPhotos
		userService.createImagePath(stPath)

		def file = request.getFile('profilePic')
		if(file.getOriginalFilename()){
			println("stPathstPath"+stPath)
			String s = stPath + file.getOriginalFilename()
			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Images image = new Images(name:file.getOriginalFilename(),imgpath:s).save(flush:true)
			internationalCertificateInstance.setProfilePic(image)
			//admin.setProfilePic(image)
		}*/
		
		/*if (!(request instanceof MultipartHttpServletRequest)) {
			log.error(" Request is not a multipart request")
			render "Request is not a multipart request"
			return
		}
	
		def profilePic1 = request.getFile("profilePic")
	
		if (profilePic1 && !profilePic1.empty) {
			String filePath = "${grailsApplication.config.jimagesFolder}${internationalCertificateInstance.regNo}_ProfilePic_" + profilePic1.originalFilename
	
			try {
				profilePic1.transferTo(new File(filePath))
				Images image = new Images(name: profilePic1.originalFilename, imgpath: filePath).save(flush: true)
				internationalCertificateInstance.setProfilePic(image)
				println " Image saved successfully at: ${filePath}"
			} catch (Exception e) {
				log.error("Error saving profile picture", e)
			}
		} else {
			log.warn(" Profile picture file is empty")
		}
	*/
        if (!internationalCertificateInstance.save(flush: true)) {
            respond internationalCertificateInstance.errors, view: 'create'
            return
        }
		
        try {
            // Generate and save the PDF
            def pdfFileName = generateAndSavePdf(internationalCertificateInstance)

            if (pdfFileName) {
                // Store the PDF link (filename) and data in the database
                def uploadFolder = grailsApplication.config.uploadFolder ?: 'E:/bestwish/BestWishes/uploadcertificate'
                def pdfFilePath = new File(uploadFolder, pdfFileName)

                if (pdfFilePath.exists()) {
                    internationalCertificateInstance.pdfLink = pdfFileName
                    internationalCertificateInstance.pdfData = Files.readAllBytes(pdfFilePath.toPath())

                    if (!internationalCertificateInstance.save(flush: true)) {
                        throw new IOException("Failed to save certificate data to the database")
                    }

                    flash.message = "Certificate generated successfully!"
                    redirect action: "show", id: internationalCertificateInstance.id
                } else {
                    throw new IOException("PDF file was not found after generation")
                }
            } else {
                throw new IOException("PDF generation failed")
            }
        } catch (Exception e) {
            log.error("Error generating or saving certificate: ${e.message}", e)
            flash.message = "Failed to generate certificate."
            render(view: "create", model: [internationalCertificateInstance: internationalCertificateInstance])
        }
    }

    def downloadPdf(Long id) {
        def internationalCertificateInstance = InternationalCertificate.findById(id)
        if (internationalCertificateInstance && internationalCertificateInstance.pdfData) {
            response.contentType = 'application/pdf'
            response.setHeader('Content-disposition', "attachment; filename=${internationalCertificateInstance.pdfLink}")
            response.outputStream << internationalCertificateInstance.pdfData
            response.outputStream.flush()
        } else {
            flash.message = "Certificate PDF not found."
            redirect(action: "index")
        }
    }

   private def generateAndSavePdf(InternationalCertificate internationalCertificateInstance) {
    try {
        def imgPath = "E:/bestwish/BestWishes/web-app/images/pragati.png"
        File imgFile = new File(imgPath)
        if (!imgFile.exists()) {
            throw new FileNotFoundException("Image file not found at path: ${imgPath}")
        }

        PDDocument doc = new PDDocument()
        PDPage page = new PDPage()
        doc.addPage(page)

        PDImageXObject pdImage = PDImageXObject.createFromFile(imgFile.absolutePath, doc)
        PDPageContentStream contentStream = new PDPageContentStream(doc, page)

        // Draw the image to cover the entire page
        contentStream.drawImage(pdImage, 0, 0, page.mediaBox.width, page.mediaBox.height)

        // Add text on top of the background image
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12)
        contentStream.beginText()
        contentStream.newLineAtOffset(100, 700)
        contentStream.showText("Sample Text for ${internationalCertificateInstance.firstName}")
        contentStream.endText()
        contentStream.close()

        def pdfFileName = "${internationalCertificateInstance.firstName}.pdf"
        def uploadFolder = grailsApplication.config.uploadFolder ?: 'E:/bestwish/BestWishes/uploadcertificate'
        File pdfFile = new File(uploadFolder, pdfFileName)
        doc.save(pdfFile)
        doc.close()

        println "PDF generated and saved successfully with background image."
        return pdfFileName
    } catch (Exception e) {
        log.error("Error generating or saving PDF: ${e.message}", e)
        return null
    }
}

    private String generateRegistrationNumber() {
        def fixedDatePart = "25082025"
        def prefix = "PRAG"
        def certificates = InternationalCertificate.findAllByRegNoLike("${prefix}${fixedDatePart}%")

        def nextNumber = 1

        if (!certificates.isEmpty()) {
            def latestCert = certificates.sort { a, b -> b.regNo <=> a.regNo }.first()
            def lastNumberPart = latestCert.regNo.replaceAll("${prefix}${fixedDatePart}", "")
            if (lastNumberPart.isInteger()) {
                nextNumber = lastNumberPart.toInteger() + 1
            }
        }

        return "${prefix}${fixedDatePart}${String.format('%03d', nextNumber)}"
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'InternationalCertificate.label', default: 'InternationalCertificate'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: HttpStatus.NOT_FOUND }
        }
    }
}
