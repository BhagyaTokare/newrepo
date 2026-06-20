package com.hiideals.jobFrom

class PaymentInfo {
	String paymentId
	String transactionId
	String paymentrequestId
	String userId
	Date createddate = new Date()
	String totalamount
	String paymethod
	String status
	String discription
	boolean terms
	String name
	String transactionDate
	String phoneNo
	String bankRefNo

	static constraints = {
		paymentId nullable:true
		transactionId  nullable:true
		paymentrequestId  nullable:true
		userId  nullable:true
		totalamount nullable:true
		paymethod nullable:true
		status nullable:true
		terms nullable:true
		discription nullable:true

		name nullable:true
		transactionDate nullable:true
		phoneNo nullable:true
		bankRefNo nullable:true
	}
	static mapping = { sort createddate :'desc' }
}
