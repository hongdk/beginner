package com.xclink.ch13.xf;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverExam {
	public static void main(String[] args) {
		ServerSocket server =null;
		InputStream is =null;
		try {
			server = new ServerSocket(9998);
			Socket socket =server.accept();
			System.out.println("客户端连接成功");
			is =socket.getInputStream();
			byte [] bytes =new byte [40];
			is.read(bytes);
			System.out.println(new String(bytes));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
