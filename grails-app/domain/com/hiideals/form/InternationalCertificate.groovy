package com.hiideals.form

import com.springapp.Images

import groovy.transform.EqualsAndHashCode

import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class InternationalCertificate {
	String firstName
	String lastName
	String phoneNo
	String regNo
	String clubMembershipNo
	String districtCode
	String zone
	String club
	//Images profilePic
	byte[] pdfData // Add this field to store the PDF
	String pdfLink
	static constraints = {
		
		firstName nullable:true
		lastName nullable:true
        phoneNo unique: true, blank: false, maxSize: 10, message: "default.not.unique.message"
		regNo nullable:true
		clubMembershipNo nullable:true
		districtCode nullable:true
		zone nullable:true
		club nullable:true
		 pdfData nullable: true, maxSize: 1024 * 1024 * 10 // Set maximum size to 10MB
		
		pdfLink(nullable: true, blank: true)
		//profilePic nullable: true
	}
	static mapping = {
		pdfData sqlType: 'LONGBLOB'  // Set the SQL type for storing large binary data
		
		
		}
}