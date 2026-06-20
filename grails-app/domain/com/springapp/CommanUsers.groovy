package com.springapp

import java.util.Date;

class CommanUsers {
	String username
	String password
	String phoneNo
	String smsSenderId
	String smsUsername
	Images profilePic
	String smsPassword
	SecUser userId
	Address address
	Date dateCreated
	Date lastUpdated
	String email
	static constraints = {
		password nullable:true
		username nullable:true
		phoneNo nullable:true
		userId nullable:true
		dateCreated nullable:true
		profilePic	nullable:true
		lastUpdated nullable:true
		smsSenderId  nullable:true
		smsUsername nullable:true
		address nullable:true
		smsPassword nullable:true
		email nullable:true
	}
}
