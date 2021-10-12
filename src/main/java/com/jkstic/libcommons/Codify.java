package com.jkstic.libcommons;

import java.util.Base64;

public class Codify {
	
	public static String encodeBase64(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}

	public static String decodeBase64(String input) {
		byte[] decodedBytes = Base64.getDecoder().decode(input);
		return new String(decodedBytes);
	}
	
	public static String encodeUrlBase64(String url) {
		return Base64.getUrlEncoder().encodeToString(url.getBytes());
	}
	
	public static String decodeUrlBase64(String url) {
		return new String(Base64.getUrlDecoder().decode(url));
	}
}
