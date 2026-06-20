package com.hiideals.jobFrom

import com.springapp.Address

import com.springapp.Admin
import com.springapp.Images
import com.springapp.SecUser

class Usercreation {

	String username
	String password
	String phoneNo
	Admin adminId
	Images profilePic
	SecUser userId
	Address address
	Date dateCreated
	Date lastUpdated

	static constraints = {

		password nullable:true
		username nullable:true
		profilePic	nullable:true
		phoneNo nullable:true
		userId nullable:true
		dateCreated nullable:true
		lastUpdated nullable:true
		address nullable:true
	}
}

