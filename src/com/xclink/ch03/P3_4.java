package com.xclink.ch03;

public class P3_4 {
	
	/***
	 * ����Ķ���: type[] ������� type����������������
	 * @param args
	 */
	public static void main(String[] args) {
		
		//��������
		int k;//ռ��4���ֽ�
		int[] a; //���������
		int b[];
		//����ĳ�ʼ��
		int[] a1= {1,2,3,6,8,9}; //����̬��ʼ���� ����ʱֱ�Ӹ�ֵ
		int[] a2;
		a2 = new int[5];  //����̬��ʼ������ʼ��ʱָ������ĳ��ȡ�
		//����1: �ؼ��֡�new�� ˵��������һ������
		
		int[] b1 = new int[5];   //int ��ʼ����5������int 5*4B=20B
		char[] c1 = new char[5]; //char
		double[] d1 = new double[5];
		String[] str1 = new String[5];
		
		//�������ʱ�±귶Χ:0  n-1
		System.out.println(b1[5]);
		//����2:��������length˵�� ������һ������
		for(int i=0;i<b1.length;i++){
			b1[i] = 2*i+1;
			System.out.println(b1[i]);
		}
		
		for(int i=0;i<c1.length;i++){
			System.out.println(c1[i]);
		}
		
		for(int i=0;i<c1.length;i++){
			System.out.println(c1[i]);
		}
		
		for(int i=0;i<str1.length;i++){
			System.out.println(b1[i]);
		}
		
		
		
		
		
	}
}
