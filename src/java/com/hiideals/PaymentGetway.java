package com.hiideals;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class PaymentGetway {

	public static String easebuzz_Generatehash512(String type, String str) {
		byte[] hashseq = str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try {
			MessageDigest algorithm = MessageDigest.getInstance(type);
			algorithm.reset();
			algorithm.update(hashseq);
			byte messageDigest[] = algorithm.digest();

			for (int i = 0; i < messageDigest.length; i++) {
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if (hex.length() == 1) {
					hexString.append("0");
				}
				hexString.append(hex);

			}

		} catch (NoSuchAlgorithmException nsae) {
			nsae.printStackTrace();
		}
		return hexString.toString();
	}

	public static String Payment(String txnid, String amount,
			String productinfo, String firstname, String phone, String email,
			String surl, String furl, String formid) throws IOException {

		// production
		String mainUrl = "https://pay.easebuzz.in/payment/initiateLink";
		String key = "3OTFHUJ9C6";
		String salt = "HFHES6EOHT";

		// testing
		/*
		 * String mainUrl="https://testpay.easebuzz.in/payment/initiateLink";
		 * String key = "2PBP7IABZ2"; String salt = "DAH88E3UWQ";
		 */

		String hashs = key + "|" + txnid + "|" + amount + "|" + productinfo
				+ "|" + firstname + "|" + email + "|" + formid + "||||||||||"
				+ salt;

		String hashedValue = PaymentGetway.easebuzz_Generatehash512("SHA-512",
				hashs);

		System.out.println("hashedValue hashedValue hashedValue hashedValue"
				+ hashedValue);

		System.out.println("hashs hashs hashs hashs" + hashs);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("key", key);
		map.add("txnid", txnid);
		map.add("amount", amount);
		map.add("productinfo", productinfo);
		map.add("firstname", firstname);
		map.add("phone", phone);
		map.add("email", email);
		map.add("surl", surl);
		map.add("furl", furl);
		map.add("hash", hashedValue);

		map.add("udf1", formid);
		map.add("udf2", "");
		map.add("udf3", "");
		map.add("udf4", "");
		map.add("udf5", "");
		map.add("udf6", "");
		map.add("udf7", "");
		map.add("udf8", "");
		map.add("udf9", "");
		map.add("udf10", "");

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.postForEntity(mainUrl,
				map, String.class);
		if (response.getStatusCode().is2xxSuccessful()) {

			String json = response.getBody();
			JsonObject convertedObject = new Gson().fromJson(json,
					JsonObject.class);

			System.out.println("response.getBody()" + response.getBody());
			System.out.println("payment Succesful"
					+ convertedObject.get("error_desc"));

			if (convertedObject.get("status").getAsInt() == 0) {

				return convertedObject.get("status")
						+ convertedObject.get("error_desc").getAsString();
			} else {
				return convertedObject.get("status")
						+ convertedObject.get("data").getAsString();
			}

		} else {

			System.out.println("something went wrong" + response.getBody());
			return null;
		}

	}
}
