package com.xclink.ch13;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/****************************************
 * 1.先封装一包数据DatagramPacket
 * 2.DatagramSocket 发送
 *   
 *************************************/
public class UCPClient {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		InetSocketAddress address = new InetSocketAddress("192.168.1.78",8899);
		
		DatagramPacket pakcet = null;
		try {
			pakcet = new DatagramPacket(str.getBytes(),str.getBytes().length);
			//pakcet = new DatagramPacket(str.getBytes(),str.getBytes().length,address);
			pakcet.setSocketAddress(address);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		DatagramSocket sendSocket = null;
		try {
			sendSocket = new DatagramSocket();//sendSocket = new DatagramSocket(address);
			sendSocket.send(pakcet);
			
			System.out.println("消息已发送");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		byte[] recvbytes = new byte[1024];
		DatagramPacket recvpakcet = new DatagramPacket(recvbytes, recvbytes.length);
		try {
			//sendSocket = new DatagramSocket();//sendSocket = new DatagramSocket(address);
			sendSocket.receive(recvpakcet);
			System.out.println("已收到服务端数据");
			
			byte[] recvs = recvpakcet.getData();
			String content = new String(recvs,0,recvpakcet.getLength());
			System.out.println(content);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
}
