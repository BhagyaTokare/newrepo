package com.hiideals.ett.email;

import java.io.File

import org.codehaus.groovy.grails.web.util.WebUtils;

import grails.transaction.Transactional

@Transactional
class EmailService {


	def mailService
	def grailsApplication
	def groovyPageRenderer
	def env = (grails.util.Environment.current).toString()


	/**
	 * Successful Submission to Ett application
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param submissionid
	 * @param subcriptiondate
	 * @returns
	 */

		def sendEtaxSuccessfulFilingEmail(String recipientName, String recipientEmail, String subject1, String submId,Date subcriptiondate) {
		println"---------SUBMISSION 1 email ----------"
		
		def content = groovyPageRenderer.render(view:'/testmail/email_filing',model:[name: recipientName,submId:submId,subcriptiondate:new Date()])
		
		Sendmail {
			multipart true
			async true
			to recipientEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendEtaxSuccessfulFilingEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"Prod env sendEtaxSuccessfulFilingEmail"
				bcc "support@e-trucktax.com"
			}
			//html view: templatePath, model: [name: recipientName,submId:submId,subcriptiondate:new Date()]
			html(content)
		}
	}



	/**
	 * Successful received by Ett application
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param submissionid
	 * @param  subcriptiondate
	 * @returns
	 */

	def sendEttSubmissionEmail(String recipentName, String recipentEmail, String submId,String subject1,Date subcriptiondate) {
		println"---------SUBMISSION email ----------"
		
		def content = groovyPageRenderer.render(view:'/testmail/submission',model:[name: recipentName,submId:submId,subcriptiondate:new Date()])
		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendEttSubmissionEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"Prod env sendEttSubmissionEmail"
				bcc "support@e-trucktax.com"
			}
			//html view: templatePath, model: [name: recipentName,submId:submId,subcriptiondate:new Date()]
			html(content)
		}
	}

	/**
	 * Rejection by Irs
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param submissionid
	 * @returns
	 */


	
	def sendIrsRejectionEmail(String recipentName,String recipentEmail, String subId,String subject1) {
		println"---------IRS REJECTION email ----------"
		
		
		
		def content = groovyPageRenderer.render(view:'/testmail/rejection',model:[name: recipentName,subId:subId])
		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendIrsRejectionEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"Prod env sendIrsRejectionEmail"
				bcc "support@e-trucktax.com"
			}
			html(content)
			//html view: templatePath, model: [name: recipentName,subId:subId]
		}
	}


	/**
	 * Successful acceptance by Irs
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param submissionid
	 * @param filename
	 * @param file(schedule1 copy)
	 * @returns
	 */

	/*def sendIrsSuccessfulFilingEmail(String recipentName, String recipentEmail, String subpId,String attachmentFileName, File attachmentBytes,String subject1) {
	 println"---------IRS SUBMISSION WITH ATTACHMENT  email ----------"
	 println"---------attachmentBytes...//////----------"+attachmentBytes
	 def content = groovyPageRenderer.render(view:'/testmail/success',model:[name: recipentName,subpId:subpId,subcriptiondate:new Date()])
	 Sendmail {
	 multipart true
	 async true
	 to recipentEmail
	 from grailsApplication.config.grails.mail.username
	 subject subject1
	 bcc "test@e-trucktax.com"
	 //bcc "support@e-trucktax.com"
	 attach attachmentFileName,attachmentBytes
	 html(content)
	 //html view: templatePath, model: [name: recipentName,subpId:subpId,subcriptiondate:new Date(),attachmentBytes:attachmentBytes,attachmentFileName:attachmentFileName]
	 }
	 }*/



	def sendIrsSuccessfulFilingEmail(String recipentName, String recipentEmail, String subpId,String subject1,String downloadlink) {
		println"---------IRS SUBMISSION WITH schedule1 download link  email ----------"

		def content = groovyPageRenderer.render(view: '/testmail/success',model:[name: recipentName,subpId:subpId,subcriptiondate:new Date(),downloadlink:downloadlink])

		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env with download link"
				bcc "test@e-trucktax.com"
			}else{
			println"Prod env with download link"
				bcc "support@e-trucktax.com"
			}
			html(content)
		}
	}




	/**
	 * Successful set password
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @returns
	 */

	def sendPasswordSetSuccessEmail(String recipentName,String recipentEmail, String subject1,String templatePath) {
		println"--------- PASWWORD SET SUCCESSFULLY email ----------"
		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendPasswordSetSuccessEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"Prod env sendPasswordSetSuccessEmail"
				bcc "support@e-trucktax.com"
			}
			html view: templatePath, model: [name: recipentName]
		}
	}


	/**
	 * Successful Registration
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param resetlink
	 * @returns
	 */

	def sendRegSuccessEmail(String recipentName, String recipentEmail, String subject1,String resetlink,String templatePath,String password){
		println"---------REGISTER  email ----------"
		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1

			if((env=='DEVELOPMENT')){
				println"dev env sendRegSuccessEmail"
				bcc "hiidealstechnologies@gmail.com"
			}else{
			println"PRod env sendRegSuccessEmail"
				bcc "hiidealstechnologies@gmail.com"
			}
			html view: templatePath, model: [name: recipentName, password: password, resetlink:resetlink]
		}
	}


	/**
	 * Successful Registration of the preparer
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @returns
	 */
	def sendPreparerRegSuccessEmail(String recipentName, String recipentEmail, String subject1,String templatePath){

		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendPreparerRegSuccessEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"prod env sendPreparerRegSuccessEmail"
				bcc "support@e-trucktax.com"
			}
			html view: templatePath, model: [name: recipentName,email: recipentEmail ]
		}
	}


	/**
	 * Successful Payment
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param submissionid
	 * @param invoiceId
	 * @param price
	 * @param vehicle
	 * @returns
	 */
	def sendSuccessfulPaymentEmail(String recipientName, String recipientEmail, String subject1, String submId,
			String invoiceId, String amount, String price, String vehicle,String templatePath){

		println"---------PAYMENT email ----------"

		Sendmail {
			multipart true
			async true
			to recipientEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
				println"dev env sendSuccessfulPaymentEmail"
				bcc "test@e-trucktax.com"
			}else{
			println"prod env sendSuccessfulPaymentEmail"
				bcc "support@e-trucktax.com"
			}
			html view: templatePath, model: [name: recipientName,submId:submId,invoiceId:invoiceId,amount:amount,price:price,vehicle:vehicle]
		}
	}

	/**
	 * Forgot Password
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param resetlink
	 * @returns
	 */


	def sendForgotPasswordMessageEmail(String recipentName, String recipentEmail, String subject1, String resetlink){
		println"---------fORGOT PASWWORD email ----------"

		def content = groovyPageRenderer.render(view: '/testmail/forgot_password',model:[name:recipentName,resetlink:resetlink])

		Sendmail {
			multipart true
			async true
			to recipentEmail
			from grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
			println"dev env sendForgotPasswordMessageEmail"
			bcc "test@e-trucktax.com"
			}else{
			println"prod env sendForgotPasswordMessageEmail"
				bcc "support@e-trucktax.com"
			}
			html(content)
			//html view: template, model: [name:recipentName,resetlink:resetlink]
		}
	}


	/**
	 * Contact Us
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param contactTxt
	 * @returns
	 */

	def sendContactusMessage(String recipentEmail, String subject1, String contactTxt){
		println"---------contact email ----------"
		Sendmail {
			multipart true
			async true
			to grailsApplication.config.grails.mail.username
			from recipentEmail
			subject subject1
			html  contactTxt
			//html view: template, model: [recipentName:recipentName,contactTxt:contactTxt]
		}
	}





	/**
	 * Marketing
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param templatePath
	 * @param path
	 * @returns
	 */


	def sendmarketingEmail(String recipentName,String recipentEmail, String subject1,String path){
		println"---------Marketing email with path----------"

		def content = groovyPageRenderer.render(view: '/testmail/marketing',model:[name:recipentName,path:path])

		Sendmail {
			multipart true
			async true
			to recipentEmail
			from "sale@e-trucktax.com"//grailsApplication.config.grails.mail.username
			subject subject1
			if((env=='DEVELOPMENT')){
			println"dev env sendmarketingEmail"
			bcc "test@e-trucktax.com"
			}else{
			println"prod env sendmarketingEmail"
				bcc "sale@e-trucktax.com"
			}
			html(content)
			//html view: template, model: [name:recipentName,resetlink:resetlink]
		}
	}

	def sendmarketingEmailq(String recipentName,String recipentEmail, String subject1, String templatePath){
		println"---------Marketing email static----------"

		def content = groovyPageRenderer.render(view: templatePath,model:[name:recipentName])

		Sendmail {
			multipart true
			async true
			to recipentEmail
			from "sale@e-trucktax.com"
			subject subject1
			if((env=='DEVELOPMENT')){
			println"dev env sendmarketingEmailq"
			bcc "test@e-trucktax.com"
			}else{
			println"prod env sendmarketingEmailq"
				bcc "sale@e-trucktax.com"
			}
			html(content)
			//html view: templatePath, model: [name:recipentName]
		}
	}
	
	


	/**
	 * @param callable
	 * @return
	 */

	def Sendmail(Closure callable){
		mailService.sendMail(callable);
	}


	def serviceMethod() {
	}
}


