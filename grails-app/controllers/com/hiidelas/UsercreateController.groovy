package com.hiidelas

import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.SendSMS;
import com.hiideals.jobFrom.Usercreation
import com.springapp.Address
import com.springapp.Images
import com.springapp.SecRole
import com.springapp.SecUser
import com.springapp.SecUserSecRole



@Secured(["ROLE_ADMIN","ROLE_SUPERADMIN","ROLE_USER","ROLE_COMMANUSERS"])

class UsercreateController {

	def userService

	def index() {
		def usersInstanceList = Usercreation.findAllByAdminId(userService.getCurrentAdmin());
		model:[usersInstanceList: usersInstanceList]
	}




	def createUser(){
		render(template:'userFORM')
	}


	def saveUser(){
		def userexist=SecUser.findByUsername(params?.username)
		if(userexist){
			flash.message="This username Already Exist Please use different username"
			redirect(action:'index')
		}else{

			def userInstance= new SecUser()
			def userRole = SecRole.findByAuthority('ROLE_USER')
			userInstance.properties=params
			def stPath = grailsApplication.config.userPhotos
			userService.createImagePath(stPath)
			def admin=new Usercreation(params)

			def file = request.getFile('file_1')
			if(file.getOriginalFilename()){
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
			admin.setAdminId(userService.getCurrentAdmin())
			userInstance.setAdminId(userService.getCurrentAdmin())
			userInstance.save(flush:true,failOnError:true)
			admin.setUserId(userInstance)
			admin.save(flush:true,failOnError:true)
			if(!userInstance.authorities.contains(userRole)){
				new SecUserSecRole(userInstance, userRole).save(flush:true,failOnError:true)
			}
			flash.message="User Created Successfully."
			redirect(action:'index')
		}
	}
	def userEdit(){
		def usersInstance=Usercreation.findById(params?.userListid)
		render(template:'userFORM',model:[usersInstance:usersInstance])
	}

	def viewimg(){

		Usercreation documentInstance = Usercreation.get(params.int('id'));
		if ( documentInstance == null) {
			flash.message = "image not found."
			redirect (action:'index')
		} else {
			def file = new File(documentInstance.userId.profilePic.imgpath)
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


	def updateUser(){
		def admin=Usercreation.findById(params?.userListid)
		admin.properties=params
		def address=Address.findById(admin.address?.id)
		address.properties=params
		address.save(flush:true)
		admin.save(flush:true)
		flash.message="User Updated Successfully."
		redirect(action:'index')
	}

	def createce(){}
}


