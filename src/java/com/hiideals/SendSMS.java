package com.hiideals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SendSMS {

	public static void sendSMS(String number, String message)
			throws IOException {

		// Prepare Url
		URLConnection myURLConnection = null;
		URL myURL = null;
		BufferedReader reader = null;

		// encoding message
		// String encoded_message=URLEncoder.encode(message);

		// Send SMS API
		String mainUrl = "http://www.smsalert.co.in/api/push.json?";

		String postData = null;
		String MobileNo = number;
		String Messagenew = message;
		String Username = "bidar";
		String Password = "123456";
		String SenderID = "HIITPL";
		String apikey = "618dd628ee0cb";
		String TRANS = "Trans";
		String DCS = "0";
		String flashsms = "0";
		String route = "0";
		System.out.println("hkxhkhschh");

		String url = "http://www.smsalert.co.in/api/push.json?apikey=" + apikey
				+ "&route=transactional" + "&sender=" + SenderID + "&mobileno="
				+ MobileNo + "&text=" + Messagenew;
		String newUrlString = url.replaceAll(" ", "%20");

		mainUrl = (newUrlString).toString();
		try {
			// prepare connection
			myURL = new URL(mainUrl);
			myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			reader = new BufferedReader(new InputStreamReader(
					myURLConnection.getInputStream()));
			// reading response
			String response;
			while ((response = reader.readLine()) != null)
				// print response
				System.out.println(response);

			// finally close connection
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}