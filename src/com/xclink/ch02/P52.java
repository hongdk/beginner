package com.xclink.ch02;

public class P52 {
	
	public static void main(String[] args) {
		
		int height = 10;
		int wealth = 1000;
		boolean handSome = false;
		
		marrage1(height, wealth, handSome);
		
	}
	
	
	public static void marrage1(int height,int wealth,boolean handSome){
		
		if(height>180 && wealth>10000000 && handSome==true ){
			//��������ȫ������
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height>180 || wealth>10000000 || handSome==true){
			
			System.out.println("�ްɣ����ϲ��㣬��������");
			
		}else{
			System.out.println("���ޣ�");
		}
		
	}
	
	/********
	 * 
	 * @param height
	 * @param wealth
	 * @param handSome
	 * 
	 * �ر�ע�ͣ�
	 *     if������˳��
	 */
	public static void marrage2(int height,int wealth,boolean handSome){
		
		if(height>180 || wealth>10000000 || handSome==true){	
			System.out.println("�ްɣ����ϲ��㣬��������");
		}
		else if(height>180 && wealth>10000000 && handSome==true ){
			//��������ȫ������
			System.out.println("��һ��Ҫ�޸���!!!");
		}else {
			System.out.println("���ޣ�");
		}
		
	}

}
