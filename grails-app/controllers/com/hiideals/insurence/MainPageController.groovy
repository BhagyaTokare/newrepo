package com.hiideals.insurence

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_SUPERADMIN","ROLE_USER","ROLE_COMMANUSERS"])
class MainPageController {
	def SpringSecurityService

	def index() {
		if(SpringSecurityUtils.ifAnyGranted("ROLE_ADMIN")){
			redirect(controller:'superadmin',action:'indexx')
		}

		else if(SpringSecurityUtils.ifAnyGranted("ROLE_SUPERADMIN")){
			redirect(controller:'superadmin',action:'index')
		}

		else if(SpringSecurityUtils.ifAnyGranted("ROLE_COMMANUSERS")){
			redirect(controller:'superadmin',action:'dashboard')
		}


		else{
			redirect(controller:'login',action:'auth')
		}
	}
}
