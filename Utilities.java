package com.Generic;

import java.util.Random;

public class Utilities {
	
	public static String getMobileNumber(int intLength) {

		String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		
		return strRandomDigit+randomString;
		
		
	}

}
