package com.xclink.ch02;

/****
 * 7.�пھ�7���һֻ���ܰ�����3�ף�����׹��2�ף��������ܼ������������ھ� 
 * @author Administrator
 *
 */
public class Exec7 {

	public static void main(String[] args) {
		
		int m = 0; //�������m���� ��ǰ������λ��
		int days = 0;
		
		do{
			days++;  //���days++��λ��
			m = m+3; //���쵽��  ��ʼŬ������3�� 
			m = m-2; //������ Ҫ׷��2����
			
			if(m>=7) 
				break;
		}while(true);
		
		System.out.println(days++);
		
	}

}
