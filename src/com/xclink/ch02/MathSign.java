package com.xclink.ch02;

public class MathSign 
{
	public static void main(String[] args) 
	{
		//========================���������======================
		/***
		�����������+ - * / %
		**/
		short s1 = 20;
		int int1 = 100;
		System.out.println(s1/5);
		System.out.println(int1/5);
		
		int mint1 = 100%3; 
		int mint2 = 100%-3;
		int mint3 = (-100)%3;
		int mint4 = (-100)%-3;
		
		//ȡ�෵��ֵ������ ȡ���� ������
		System.out.println(mint1); //1
	    System.out.println(mint2); //1
		System.out.println(mint3); //-1
		System.out.println(mint4); //-1

		//����
		float f1 = 12.56f; //����ʱ����Ҫ����f.�����ͳ���Ĭ������Ϊdouble
		System.out.println(f1/2);
		
		//�ӷ�
		short s2 = 100;
		byte b1 = 10;
		char c1 = 'a';

		//��������Ĭ��ΪInt
		//short s3 = s2+200; //���벻ͨ��:��ʧ����
		//b1 = b1+2;//��ʧ����
		//c1 = c1+2;//��ʧ����
		int d1 = b1+2; //����ͨ��
		
		//˫�ӣ������������
		int int3 = 200;
		int int4 = int3++;
		System.out.println(int3+" "+int4); //201 200 

		int3 = 200;
		int4 = ++int3;
		System.out.println(int3+" "+int4); //201 201
		
		//���㲢��ֵ������+= *= /=��
		short s4 = 300;
		//s4=s4+400; //���벻ͬ������ʧ���� 
		System.out.println(s4);
		s4+=400; //����ͨ��  s4=s4+400
		System.out.println(s4);
		
		//===========================================λ����=============================
		int a = 31;

		int a1 = 0b11111; //������ = 
		int a2 = 037; //�˽��� = 
		int a3 = 0X1F; //16����

		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a>>2);
		System.out.println(a>>3);
		System.out.println(a<<2);
		System.out.println(a<<3);
		System.out.println(a>>>2);

		a = -31;
		System.out.println();
		System.out.println(a>>2);
		System.out.println(a>>>2);
		
		//
		/*int a = 5;
		int b = 6;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);*/

		





	}
}
