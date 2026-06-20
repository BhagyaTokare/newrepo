package insurance


import java.text.DateFormat;
import java.text.SimpleDateFormat

import javax.websocket.Session;

import grails.transaction.Transactional

import com.hiideals.SendSMS


@Transactional(readOnly = false)
class MyJob {

	static triggers = {
		// simple repeatInterval: 5000l // execute job once in 5 seconds
		//cron name: 'myTrigger', cronExpression: "0 * * ? * *"
		//	cron name: 'myTrigger', cronExpression: "0 30 9 ? * MON-SUN"


	}
/*	def execute() {
		println"-----------Issuepolicy alert Job Execution-------"
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		def currentdate= sdf.format(date)

		def issuelist=[]
		Issuepolicy.list().each {policyholder->
			def alrtend=sdf.format(policyholder.policyenddate)
			def alertdate= sdf.format(policyholder.alertdate)
			def dayfifteen= sdf.format(policyholder.dayfifteen)
			def daymonth= sdf.format(policyholder.daymonth)
			def expireend= sdf.format(policyholder.policyenddate)
			if(((dayfifteen.equals(currentdate))  ||  (daymonth.equals(currentdate)) || (alertdate.equals(currentdate)) &&  policyholder.status=="New" ) || ((dayfifteen.equals(currentdate))  ||  (daymonth.equals(currentdate)) || (alertdate.equals(currentdate)) && policyholder.status=="Renew" )){
				issuelist.add(policyholder)
			}

			println"ggjgjgjgjgjgjgjgjj"+issuelist
			//	if(expireend.equals(currentdate)){
			//		policyholder.status="Expires"
			//	policyholder.save(flush:true)
			///	}
		}


		issuelist.each {
			//	Sending SMS Start
			def duedate= sdf.format(it?.policyenddate)
			String message= "Dear " +it?.policynames?.name+ " kindly renew  your policy within this date "+duedate+'.'
			//	 SendSMS.sendSMS(it?.policynames?.phoneNo,message)



		}
*/	}
