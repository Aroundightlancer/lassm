/**
 * 
 */
package com.te.util;

import java.security.MessageDigest;

/**
 * @author Administrator
 *
 */
public class Encryption {
	public static String encode(String str) {
		String result = null;
		
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(str.getBytes());
			byte byteBuffer[] = messageDigest.digest();    
	        // �? byte 轉換�? string  
	        StringBuffer strHexString = new StringBuffer();  
	        // 遍歷 byte buffer  
	        for (int i = 0; i < byteBuffer.length; i++)  
	        {  
	          String hex = Integer.toHexString(0xff & byteBuffer[i]);  
	          if (hex.length() == 1)  
	          {  
	            strHexString.append('0');  
	          }  
	          strHexString.append(hex);  
	        }  
	        // 得到返回結果  
	        result = strHexString.toString();  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static boolean equal(String str1, String str2) {
		String result = encode(str2);
		
		if(str1.equals(result)) {
			return true;
		}
		else {
			return false;
		}
	}
}
