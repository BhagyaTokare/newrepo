package com.hiideals


import grails.transaction.Transactional

import com.hiideals.jobFrom.Usercreation
import com.springapp.Admin
import com.springapp.CommanUsers;
import com.springapp.SecUser

@Transactional
class UserService {
	
	def springSecurityService
	static createImagePath(String path){
				def storagePathDirectory = new File(path)//(gpath)
		
				if (!storagePathDirectory.exists()) {
					if (storagePathDirectory.mkdirs()) {
					} else {
					}
				}
			}
	
	static deleteImagePath(String path){
		def storagePathDirectory = new File(path).deleteDir()//(gpath)

		if (!storagePathDirectory.exists()) {
			if (storagePathDirectory.mkdirs()) {
			} else {
			}
		}
	}

    def serviceMethod() {

    }
	
	def Admin getCurrentAdmin(){
		def user = springSecurityService.currentUser
		return user.adminId
	}
	
	def getCurrentusr(){
		def user = springSecurityService.currentUser
		return user.adminId
		
	}
	def CommanUsers getCurrentCommanUsers(){
		def user = springSecurityService.currentUser
		println("user" + user.id)
		return user.commanUsersId
	}
	
	def Usercreation getCurrentUser(){
		def user = springSecurityService.currentUser
		return user.username
	}
	
	def String getUsername() {
		def user = springSecurityService.currentUser
		def userName = null;
		if(user!=null){
			userName = user.username;
		}
		return userName;
	}
	
	def String getPath(String path, String folderName){
		
		println("path ::"+path)
		println("folderName ::"+folderName)
		
		if(folderName.equalsIgnoreCase("")){
			folderName = ""
		}else{
			folderName = folderName+"/"
		} 
		 Admin admin = this.getCurrentAdmin()//user.adminID
		 
		 SecUser inst = SecUser.findByAdminId(admin)
		 String adminName = admin.username+"/"
		 if(!adminName.equalsIgnoreCase("admin")){
			 if(inst && inst.username)
				 path = path+admin.username+"/"+inst?.username+"/"+folderName
			 else{
				 path = path+admin.username+"/"+folderName
			 }
		 }else{
			 path = path+"/stag/img/"
		 }
		createImagePath(path)
		

		return path
	}
	
}

