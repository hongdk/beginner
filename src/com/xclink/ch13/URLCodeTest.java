package com.xclink.ch13;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLCodeTest {
	
	public static void main(String[] args) {
		
		//http%3A%2Fwww.shop.com%2Fiphone%3Fa%3D%D0%A1%C3%D7%26price%3D1000
		String encode = URLEncoder.encode("http:/www.shop.com/iphone?a=小米&price=1000");
		System.out.println(encode);
		
		//http:/www.shop.com/iphone?a=小米&price=1000
		String decode = URLDecoder.decode("http%3A%2Fwww.shop.com%2Fiphone%3Fa%3D%D0%A1%C3%D7%26price%3D1000");
		System.out.println(decode);
		
		
	}
}
