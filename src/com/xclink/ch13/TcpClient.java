package com.xclink.ch13;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/****************
 * 
 * @author Administrator
 * 1.打开到服务端的连接
 *  socket = new Socket("192.168.1.78", 9998);
 *  
 * 2.流操作（业务操作）====核心
 * 
 * 3.关闭
 * 
 * 
 * 
 */
public class TcpClient {

	public static void main(String[] args) {
		Socket socket = null;
		FileInputStream filein = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			//1."找组织"-打开到服务端的连接
			socket = new Socket("192.168.1.78", 9998);
			
			//2.打开输入输出流
			os = socket.getOutputStream();
			is = socket.getInputStream();  //
			
			//3.读取文件输入流  写入 socket的输出流;
				//同时在socket的输入流数据流展示服务端已接收字节大小
			filein = new FileInputStream("e:\\send\\tree.jpg");
			byte[] bytes = new byte[1024];
			byte[] recvBytes = new byte[1024];
	
			int r = 0;
			while ((r = filein.read(bytes)) != -1) {
				os.write(bytes,0,r); //  读取文件输入流  写入 socket的输出流;
				int recvSize= is.read(recvBytes); //同时在socket的输入流数据流展示服务端已接收字节大小
				System.out.println(new String(recvBytes,0,recvSize));
				os.flush();
			}
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			//3.关闭
			try {
				os.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				is.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				filein.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
