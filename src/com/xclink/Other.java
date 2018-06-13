package com.xclink;

public class Other {
	public static void main(String[] args) {
		String str = new String("中华人民共和国,中共和国,中国青年");
		
		//charAt
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
	
		
		//实现了不同字符串的抽取
		String[] a= str.split(""); //	
		String b = "" ;
		for (int i = 0; i < a.length; i++) {
			if(b.indexOf(a[i])==-1) {
				b = b+a[i];
			}
		}
		System.out.println(b);
		
		//////////////////////////////////////////////
		//保存每个不同字符出现的次数
		String[] b1 =b.split(""); 
		int[] counts = new int[b1.length]; 
		
		for (int i = 0; i < b1.length; i++) {
			int k = 0;
			for (int j = 0; j < a.length; j++) {
				if(b1[i].equals(a[j])) {
					k++;
				}	
			}
			counts[i] = k;
		
		}
		////////////////////////////////////////////////
		String str1="abcecba"; //7
		String[] str2 = str1.split("");
		
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
		}
		
		System.out.println("len:"+str2.length);
		boolean boo = false;
		for (int i = 0; i < str2.length/2+1; i++) {
			//4
			if(str2[i].equals(str2[str2.length-i-1])) {	
			}else {
				System.out.println("i="+i+""+str2[i]+"不对称");
				boo =true;
				break;
			}
		}
		if(boo==false)
			System.out.println("对称");
	}
}
