package com.xclink.ch13;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	//https://img.alicdn.com/bao/uploaded/i1/1906701209/TB2.gEQah6I8KJjSszfXXaZVXXa_!!1906701209.jpg_145x145.jpg
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String path = "https://img.alicdn.com/bao/uploaded/i1/1906701209/TB2.gEQah6I8KJjSszfXXaZVXXa_!!1906701209.jpg_145x145.jpg";
		//String path = "http://www.baidu.com";
		String path = "https://blog.csdn.net/qq_42203289/article/details/80454136";
		try {
			URL url = new URL(path);
			//System.out.println(url.getContent()); //HttpURLConnection$HttpInputStream  URLImageSource
			
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			
			//conn.getOutputStream();
			
			//InputStream is = url.openStream();
			byte[] bytes = new byte[1024];
			int ret = 0;
			while((ret=is.read(bytes))!=-1){
				System.out.println(new String(bytes,0,ret));
			}
			
			/*System.out.println(url.getDefaultPort());
			System.out.println(url.getFile());
			System.out.println(url.getHost());//blog.csdn.net  img.alicdn.com
			System.out.println(url.getPath());
			
			System.out.println(url.getPort());
			System.out.println(url.getProtocol()); //https
*/			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
