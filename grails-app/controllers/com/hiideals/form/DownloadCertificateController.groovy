package com.hiideals.form



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class DownloadCertificateController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DownloadCertificate.list(params), model:[downloadCertificateInstanceCount: DownloadCertificate.count()]
    }

    def show(DownloadCertificate downloadCertificateInstance) {
        respond downloadCertificateInstance
    }

    def create() {
        respond new DownloadCertificate(params)
    }
	
	def thankyou() {
	
}
	
	def errorPage() {
	
}

    @Transactional
    def save(DownloadCertificate downloadCertificateInstance) {
        if (downloadCertificateInstance == null) {
            notFound()
            return
        }

        if (downloadCertificateInstance.hasErrors()) {
            respond downloadCertificateInstance.errors, view:'create'
            return
        }
		def phnNo= InternationalCertificate.findByPhoneNo(params?.phoneNo)
		if ( phnNo ) {
			
			downloadCertificateInstance.setInternationalCertificate(phnNo.save())
			
				downloadCertificateInstance.save flush:true
				redirect downloadCertificateInstance
				
				
				println("Phone numbers are equal")
			} else {
				redirect action:"errorPage"
			}
				
		
    }

    def edit(DownloadCertificate downloadCertificateInstance) {
        respond downloadCertificateInstance
    }

    @Transactional
    def update(DownloadCertificate downloadCertificateInstance) {
        if (downloadCertificateInstance == null) {
            notFound()
            return
        }

        if (downloadCertificateInstance.hasErrors()) {
            respond downloadCertificateInstance.errors, view:'edit'
            return
        }

        downloadCertificateInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DownloadCertificate.label', default: 'DownloadCertificate'), downloadCertificateInstance.id])
                redirect downloadCertificateInstance
            }
            '*'{ respond downloadCertificateInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DownloadCertificate downloadCertificateInstance) {

        if (downloadCertificateInstance == null) {
            notFound()
            return
        }

        downloadCertificateInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DownloadCertificate.label', default: 'DownloadCertificate'), downloadCertificateInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'downloadCertificate.label', default: 'DownloadCertificate'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
