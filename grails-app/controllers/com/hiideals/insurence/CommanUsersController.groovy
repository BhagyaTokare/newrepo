package com.hiideals.insurence

import grails.plugin.springsecurity.SpringSecurityUtils

import grails.plugin.springsecurity.annotation.Secured
import randomno.RandomNoGenerator

import com.hiideals.SendSMS;
import com.hiideals.jobFrom.Usercreation
import com.instamojo.wrapper.api.Instamojo
import com.instamojo.wrapper.api.InstamojoImpl
import com.instamojo.wrapper.exception.ConnectionException
import com.instamojo.wrapper.exception.InvalidPaymentOrderException
import com.instamojo.wrapper.model.PaymentOrder
import com.instamojo.wrapper.response.CreatePaymentOrderResponse
import com.springapp.Address
import com.springapp.CommanUsers
import com.springapp.Images
import com.springapp.SecRole
import com.springapp.SecUser
import com.springapp.SecUserSecRole
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class CommanUsersController {
	def emailService
	def springSecurityService
	def userService
	def indexx() {
	}

	def index() {



		def  usersInstanceList = CommanUsers.list()
		[usersInstanceList:usersInstanceList]
	}


	

	def createadmin(){
		render(template:'adminFORM')
	}

	def makePayment(){
		def user = SecUser.findByUsername(userService.getUsername())
		def amount=0
		def Rno=RandomNoGenerator.numberGenerator();
		def paymentURL=null

		PaymentOrder order = new PaymentOrder();
		/*order.setName(params.username);
		 order.setEmail(params.email);
		 order.setPhone(params.phoneno);
		 order.setCurrency("INR");
		 order.setAmount(params?.amount);*/
		order.setName("RAJ");
		order.setEmail("rahulnaubad11@gamil.com");
		order.setPhone("81238377779");
		order.setCurrency("INR");
		order.setAmount("10");


		order.setDescription("You are paying to Shoppingmummy.com.");
		order.setRedirectUrl("http://localhost:8090/Sample_test/invoice");//"http://staging.Shoppingmummy.com/invoice");
		//order.setRedirectUrl("http://www.Shoppingmummy.com/invoice");//"http://staging.Shoppingmummy.com/invoice");
		order.setTransactionId(Rno.toString());

		Instamojo api = null;

		try {
			// gets the reference to the instamojo api

			//Production
			api = InstamojoImpl.getApi("d6b796f0c9e45a40b8c9a110f608692d",
					"e93949306ef5951963adff1d4aca743d",
					"https://www.instamojo.com/api/1.1/",
					"https://api.instamojo.com/oauth2/token/");

			//Test
			/*api = InstamojoImpl.getApi("wvDJOYuJZkAqDIcrcaX87QLLbipAEbnCn9hOXWlt",
			 "Phnga6eJ2ncOxTwje53jKOlq5xqoWzVZFo9ogZ9BizhGIloevdiZpYWRpqKH5aDT5sDnKOyGaLW9lShJSL40F4TDewYO6AqOvSMEuOTTSpziTSBRmif1lh6fedNLQ8SQ",
			 "https://test.instamojo.com/v2/",
			 "https://test.instamojo.com/oauth2/token/");*/


		} catch (ConnectionException e) {
			println "inside"
			//	Logger.log(Level.SEVERE, e.toString(), e);
		}

		boolean isOrderValid = order.validate();

		if (isOrderValid) {
			try {
				CreatePaymentOrderResponse createPaymentOrderResponse = api.createNewPaymentOrder(order);
				// print the status of the payment order.

				paymentURL=createPaymentOrderResponse.paymentOptions.paymentUrl

				println(createPaymentOrderResponse.getPaymentOrder().getStatus());



			} catch (InvalidPaymentOrderException e) {
				println(e.printStackTrace())

				if (order.isTransactionIdInvalid()) {
					println("Transaction id is invalid. This is mostly due to duplicate  transaction id.");
				}
				if (order.isCurrencyInvalid()) {
					println("Currency is invalid.");
				}
			} catch (ConnectionException e) {
				//Logger.log(Level.SEVERE, e.toString(), e);
			}
		} else {
			// inform validation errors to the user.
			if (order.isTransactionIdInvalid()) {
				println("Transaction id is invalid.");
			}
			if (order.isAmountInvalid()) {
				println("Amount can not be less than 9.00.");
			}
			if (order.isCurrencyInvalid()) {
				println("Please provide the currency.");
			}
			if (order.isDescriptionInvalid()) {
				println("Description can not be greater than 255 characters.");
			}
			if (order.isEmailInvalid()) {
				println("Please provide valid Email Address.");
			}
			if (order.isNameInvalid()) {
				println("Name can not be greater than 100 characters.");
			}
			if (order.isPhoneInvalid()) {
				println("Phone is invalid.");
			}
			if (order.isRedirectUrlInvalid()) {
				println("Please provide valid Redirect url.");
			}
		}

		[paymentURL:paymentURL]




	}
	def currenuuserProfile (){
		def userimageIstance = CommanUsers.findAll(userService.getCurrentCommanUsers())
		println("userimageIstance"+userimageIstance)
		model:[userimageIstance:userimageIstance]
	}
	def viewPimg(){
		def documentInstance
		if(SpringSecurityUtils.ifAllGranted("ROLE_COMMANUSERS")){
			documentInstance = CommanUsers.findAll(userService.getCurrentCommanUsers())
		}
		if(SpringSecurityUtils.ifAllGranted("ROLE_USER")){
			println("userService.getCurrentUser()  = "+userService.getCurrentusr())
			documentInstance = Usercreation.findAll(userService.getCurrentUser())
			println(documentInstance)
		}
		def imgid = documentInstance.profilePic.id


		Images images = Images.get(imgid.getAt(0));

		if ( images == null) {
			flash.message = "image not found."
			redirect (action:'index')
		} else {
			def file = new File(images?.imgpath)
			def fileInputStream = new FileInputStream(file)
			def outputStream = response.getOutputStream()
			byte[] buffer = new byte[4096];
			int len;
			while ((len = fileInputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.flush()
			outputStream.close()
			fileInputStream.close()
		}
	}

	def viewimg(){

		CommanUsers documentInstance = CommanUsers.get(params.int('id'));
		if ( documentInstance == null) {
			flash.message = "image not found."
			redirect (action:'index')
		} else {
			def file = new File(documentInstance.profilePic.imgpath)
			def fileInputStream = new FileInputStream(file)
			def outputStream = response.getOutputStream()
			byte[] buffer = new byte[4096];
			int len;
			while ((len = fileInputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.flush()
			outputStream.close()
			fileInputStream.close()
		}
	}

	def SaveCommanUsers(){
		def userexist=SecUser.findByUsername(params?.username)
		if(userexist){
			flash.message="This username Already Exist Please use different username"
			redirect(controller:'login',action:'auth')
		}else{

			def userInstance= new SecUser()
			def adminRole = SecRole.findByAuthority('ROLE_COMMANUSERS')
			userInstance.properties=params
			def admin=new CommanUsers(params)

			println("hiiiiii")
			def stPath = grailsApplication.config.juserPhotos
			userService.createImagePath(stPath)

			def file = request.getFile('file_1')
			if(file.getOriginalFilename()){

				println("stPathstPath"+stPath)
				String s = stPath + file.getOriginalFilename()
				try{
					file.transferTo(new File(s))
				}catch(Exception e){}
				Images image = new Images(name:file.getOriginalFilename(),imgpath:s).save(flush:true)
				userInstance.setProfilePic(image)
				admin.setProfilePic(image)
			}

			admin.properties=params
			Address address=new Address(params)
			admin.setAddress(address.save(flush:true))



			userInstance.setCommanUsersId(admin.save(flush:true))
			userInstance.save(flush:true,failOnError:true)
			admin.setUserId(userInstance)
			if(!userInstance.authorities.contains(adminRole)){
				new SecUserSecRole(userInstance, adminRole).save(flush:true,failOnError:true)
			}
			flash.message=" Created Successfully."


			SendSMS.sendSMS(params.phoneNo,"Dear%20"+params.username+"%2C%20You%20have%20successfully%20registered%20to%20apply%20for%20the%20job%20of%20KVAFSU.%20Your%20username%20is%20"+params.username+"%20and%20Password%20is%20"+params.password+".%20Regards%2C%20Service%20of%20Hi%20Ideals")
			//String Emailverificationurl = generateLink('emailverify', [id: admin])

			//emailService.sendRegSuccessEmail(params.password,params.email, "Registration Success!",Emailverificationurl,"/testmail/registration_successs",params.username)

			redirect(controller:'login',action:'auth')
		}
	}

	protected String generateLink(String action, linkParams) {
		print request.scheme;
		createLink(base: "$request.scheme://$request.serverName$request.contextPath",
		controller: 'register', action: action,
		params: linkParams)
	}

	def emailverify(){
		def user=SecUser.findByUsername(params?.id)
		user.enabled=true
		println"Email Send Start"
		//new EmailService().sendSuccessEmailverifyEmail('support@e-trucktax.com', user.username, user.email, 'Success! Email verification')
		println"Email Send End"
		user.save(flush:true,failOnError:true)
		springSecurityService.reauthenticate(user.username);
		flash.Emailmsg="Your email is successfully verified please login."
		redirect(controller:'login',action:'auth')
	}


	def adminEdit(){
		def usersInstance=CommanUsers.findById(params?.userListid)
		render(template:'adminFORM',model:[usersInstance:usersInstance])
	}

	def updateCommanUsers(){
		def admin=CommanUsers.findById(params?.userListid)
		def userInstance=SecUser.findById(admin.userId?.id)
		println("userInstance ="+userInstance)




		admin.properties=params
		def address=Address.findById(admin.address?.id)
		address.properties=params
		def stPath = grailsApplication.config.userPhotos
		userService.createImagePath(stPath)

		def file = request.getFile('file_1')
		if(file.getOriginalFilename()){
			String s = stPath + file.getOriginalFilename()
			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Images image = new Images(name:file.getOriginalFilename(),imgpath:s).save(flush:true)
			//userInstance.setProfilePic(image)
			admin.setProfilePic(image)
		}



		address.save(flush:true)
		admin.save(flush:true)
		flash.message="CommanUsers Updated Successfully."
		redirect(controller:'login',action:'auth')
	}

	def createce(){}
}
