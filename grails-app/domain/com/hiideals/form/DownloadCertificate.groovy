package com.hiideals.form

class DownloadCertificate {
String phoneNo
Date downloadDate

InternationalCertificate internationalCertificate
    static constraints = {
	
		phoneNo nullable:true
		downloadDate nullable:true
		internationalCertificate nullable:true
		
    }
}
