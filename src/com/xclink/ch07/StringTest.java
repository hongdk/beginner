package com.xclink.ch07;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("");
		String str2 = "abcdef";
		
		//String�Ĺ��캯��
		char[] ch = {'h','e','l','l','o'}; //char 2 utf-8 
		String str3 = new String("�ǳ�����");
		String str4 = new String(ch,1,1); //��ʼλ��,ȥ����char
		//System.out.println(str4);
		
		byte[] b = {97,98,99}; //һ���ֽ� 
		//System.out.println(new String(b));
		
		//ת��д
		/*System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());*/
		
		//����char���ַ������״γ��ֵ�λ��
		/*System.out.println(str3.indexOf('��'));
		System.out.println(str3.indexOf('��',4));
		System.out.println(str3.indexOf('��',-4));
		System.out.println(str3.indexOf('��',100));
		
		
		System.out.println(str3);
		str3 = str3+"�������";
		str3.concat("�������");
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
			dest[i] = '=';//�ո�
		}
		/*System.out.println("dest:"+new String(dest));
		System.arraycopy(src, 0, dest, 10, src.length);
		System.out.println("dest:"+new String(dest));
		*/
		//�ַ����滻
		//System.out.println(str3.replace('��', '��'));
		
		str3.equals("aa");
		
		//System.out.println(str3.contains("��"));
		
		/***************
		 * ��Ŀ:��������һ���ַ���
		 *   �������л����񹲺͹�,�й��͹�,�й�����
		   1.��ȡ���ַ����в�ͬ���ַ� 
		  	    �л����񹲺͹�����
		   2.ͳ��ÿ���ַ����ֵĴ���
		             �� 3
		              �� 1
		   3.�ж�һ���ַ����Ƿ�Գ�
		     abcba Ϊ�Գ��ַ�
		****************/
		  
		String str = "�л����񹲺͹�,�й��͹�,�й�����";
	
		str = str.concat("abc");
		
		StringBuffer sb= new StringBuffer("ccccaaaaccccaaaa");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("ccccaaaaccccaaaaf");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		
		
		
		
		
	}
}
