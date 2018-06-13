package com.xclink.ch13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Random;


/*********************************************
 * 
 * 1.server = new ServerSocket(9998); 打开服务器端口
 * 2.服务器等待客户端连接:server.accept();
 * 
 * 3.获取服务端与客户端的连接:socket[]  打开输入或输出流
 *   tcp 全双工  半双工（对讲机）----协议
 *   send tree.jp 49M
 *   	NIO(拆包-粘包)------
 *   
 * 4.关闭流 关闭socket finally
 * 
 * 协议:
 *   send tree.jp 49M
 *   图片文件流
 * 
 *****************************************/
public class TcpServer {
	
	public static void main(String[] args) {
		ServerSocket server= null;
		FileOutputStream fos = null;
		Socket socket = null;
		String server_store_dir = "e:\\datas";
		
		try {
			//192.168.1.78 9998
			server = new ServerSocket(9998);  //1."开门"--打开一个端口
			socket = server.accept(); //2."迎客" --等待客户端的连接 （阻塞）
			
			System.out.println("有客户端已经连接");
			
			//socket:---[源端IP 源端IP 192.168.1.70:63328 服务端:192.168.1.78 端口: 9998 ]
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getPort());
			System.out.println(socket.getRemoteSocketAddress());
			
			//3.开始流处理: ----字节流
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//send tree.jp 49M
			String fileName = "";
			String fileSize = null;
			byte[] bytes = new byte[40];
			int ret = is.read(bytes);
			System.out.println(new String(bytes));
			String cmd = new String(bytes);
			String[] cmdItem = cmd.split(" ");
			if(cmdItem!=null){
				if(cmdItem.length>=3){
					fileName = cmdItem[1];
					fileSize = cmdItem[2];
					if(fileSize.contains("K") || fileSize.contains("M")){
						
					}else{
						//给客户端提示 上传文件太大 TODO
						//os.write("您上传的文件太大:");
					}
				}else{
					//打印并关闭客户端 TODO
					
				}
			}
			
			//生成服务端文件名及其存储路径
			/*Random rand = new Random();
			String fileName = "img_"+rand.nextInt(100)+".jpeg"; //生成文件名
*/			String  filePath = server_store_dir+File.separatorChar+fileName;
			System.out.println(filePath);
			
			//打开文件输出流
			int totalBytes = 0;
			fos = new FileOutputStream(new File(filePath));
			//从客户端读取数据 并写入本地文件
			String info = "";
			
			//从socket输入流读入数据 并写入文件的输出流
			bytes = new byte[1024];
			int len = 0;
			while((len=is.read(bytes))!=-1){
				fos.write(bytes,0,len);
				totalBytes = totalBytes+len;
				info = "当前接收到了字节数为:"+totalBytes;
				os.write(info.getBytes());
				fos.flush();
			}
			
			System.out.println("共接受文件大小:"+totalBytes);
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				fos.close();
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
