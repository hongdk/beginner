package com.xclink.ch02;

/**
*@author  hdk
*@version 1.0
 
*/

public class  Var
{
	
	/**
		1.JavaӦ�ó����ִ�������main()����
		
		��ʶ��:
		��26��Ӣ����ĸ��Сд��0-9 ��_�� $ ���  
		���ֲ����Կ�ͷ��
		������ʹ�ùؼ��ֺͱ����֣����ܰ����ؼ��ֺͱ����֡�
		Java���ϸ����ִ�Сд�����������ơ�
		��ʶ�����ܰ����ո�

		ע�⣺
		  ��ֵ����Ĭ��ΪInt����
	*/
	public static void main(String[] args) 
	{

		int a = 100;
		//int 1a = 200;  //���ֲ����Կ�ͷ
		//int static = 300;  //������ʹ�ùؼ��ֺͱ�����
		int b  = 100;

		int cnt = 1000; //Java���ϸ����ִ�Сд�����������ơ� cnt��cNt����������
		int cNt = 2000;

		int a1 = 0xDF;

		System.out.println(a1);

		//byte��ȡֵ��Χ -18~127 
		//byte b3 = 120;
		byte b2 = (byte)245; //ǿ��ת��

		System.out.println(b2); //-11 Ϊ��Ϊ-11������
		short s1 = 200;
		//short s2 = 1231412456677;  //������Χ

		//int s1 = 268;  //�����ظ�����
		
		//21474836478L Ĭ�ϣ�int��
		// long����-9223372036854774808��9223372036854774807�� 8���ֽ� ����-2��63�η���2��63�η�-1���� 8*8-1
		//long g1 =  21474836478L;


		//Java �ĸ����ͳ���Ĭ��Ϊdouble�ͣ�����float�ͳ��������ӡ�f����F����
		float f1 = 31.4f;
		double d1 = 5555.66;
		

		//==============================char===========================
		char zhong = '\u4e2d'; //unicode����
		System.out.println(zhong);

		String str = "�й�";
		char ch1 = 'a';
		char ch2 = '\"';  //ת���ַ�
		char ch3 = '\'';  //ת���ַ�
		char ch4 = '\t';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("�й�"+ch4+"china");
		
		//=============================================================
	
		//===========================boolean==========================
	    boolean b1 = false;

		if(b1==true){
			System.out.println("�ҵ����");
		}else{
			System.out.println("�ҵļٵ�");
		}

		boolean b22 = (b1=false);
		System.out.println("b22="+b22+"b1="+b1);
		
		b22 = (b1=true);
		System.out.println("b22="+b22+"b1="+b1);
		

		if(b1=true){
			System.out.println("�ҵ����");
		}else{
			System.out.println("�ҵļٵ�");
		}
		
		
		

		System.out.println(a);
		System.out.println("Hello World!");
	}
}
