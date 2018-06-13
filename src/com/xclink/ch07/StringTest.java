package com.xclink.ch07;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("");
		String str2 = "abcdef";
		
		//String的构造函数
		char[] ch = {'h','e','l','l','o'}; //char 2 utf-8 
		String str3 = new String("星辰互联");
		String str4 = new String(ch,1,1); //开始位置,去几个char
		//System.out.println(str4);
		
		byte[] b = {97,98,99}; //一个字节 
		//System.out.println(new String(b));
		
		//转大写
		/*System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());*/
		
		//返回char在字符串中首次出现的位置
		/*System.out.println(str3.indexOf('中'));
		System.out.println(str3.indexOf('中',4));
		System.out.println(str3.indexOf('中',-4));
		System.out.println(str3.indexOf('中',100));
		
		
		System.out.println(str3);
		str3 = str3+"新年快乐";
		str3.concat("新年快乐");
		System.out.println(str3);*/
		
		char[] src = new char[100];
		for(int i=0;i<src.length;i++){
			if(i%5==0)
				src[i] = 'a';
			else if(i%5==1)
				src[i] = 'b';
			else if(i%5==2)
				src[i] = 'c';
			else if(i%5==3)
				src[i] = 'd';
			else if(i%5==4)
				src[i] = 'e';
			
		}
		
		//System.out.println("src:"+new String(src));
		char[] dest = new char[200];
		for(int i=0;i<dest.length;i++){
			dest[i] = '=';//空格
		}
		/*System.out.println("dest:"+new String(dest));
		System.arraycopy(src, 0, dest, 10, src.length);
		System.out.println("dest:"+new String(dest));
		*/
		//字符串替换
		//System.out.println(str3.replace('星', '高'));
		
		str3.equals("aa");
		
		//System.out.println(str3.contains("互"));
		
		/***************
		 * 题目:任意输入一个字符串
		 *   举例：中华人民共和国,中共和国,中国青年
		   1.提取数字符串中不同的字符 
		  	    中华人民共和国青年
		   2.统计每个字符出现的次数
		             中 3
		              华 1
		   3.判断一个字符串是否对称
		     abcba 为对称字符
		****************/
		  
		String str = "中华人民共和国,中共和国,中国青年";
	
		str = str.concat("abc");
		
		StringBuffer sb= new StringBuffer("ccccaaaaccccaaaa");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ccccaaaaccccaaaaf");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		
		
		
		
		
	}
}
