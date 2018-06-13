package com.xclink.ch13;
import java.net.InetAddress;

public class InetAddressTest {
	
	public static void main(String[] args) {
		
		try {
			InetAddress it = InetAddress.getByName("www.baidu.com");
			
			System.out.println(it.getHostAddress()); //IP
			System.out.println(it.getHostName());  //
			//System.out.println(new String(it.getAddress()));
			System.out.println(it.getLocalHost());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
