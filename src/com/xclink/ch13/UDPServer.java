package com.xclink.ch13;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UTP

/*************************************
 * 
 * @author Administrator
 * 1.启动服务端口
 *   dscoket = new DatagramSocket(8899);
 * 2.接收包 （不需要等待accpet）
 *  
 ************************************/

public class UDPServer {
	
	public static void main(String[] args) {
		
		DatagramSocket dscoket;
		try {
			dscoket = new DatagramSocket(8899);
			byte[] bytes = new byte[1024];
			DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
			
			dscoket.receive(packet);
			System.out.println("获取到一包数据");
			byte[] recvs = packet.getData();
			
			System.out.println(recvs.length);
			System.out.println(packet.getOffset());
			String content = new String(recvs,0,packet.getLength());
			System.out.println(content);
			
			String result = content.toUpperCase();
			
			System.out.println("准备返回:"+result);
			DatagramPacket p = new DatagramPacket(result.getBytes(),result.getBytes().length);
			System.out.println("客户端地址IP:"+packet.getAddress()+",port:"+packet.getPort());
			p.setAddress(packet.getAddress());
			p.setPort(packet.getPort());
			dscoket.send(p);
			
			System.out.println("数据已发送完成:");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
