package com.xclink.ch03;
import java.util.Scanner;

import com.xclink.ch05.Person;

public class P22 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int max = 0;
		//�Ӽ�������ѧ���ĳɼ�
		for(int i=0;i<10;i++){
			int score = scanner.nextInt(); //�Ӽ���������ֵ
			a[i] = score;
		}
		System.out.println("��ӡ����ķ���ֵ");
		
		max = a[0];
		//��������Ѱ�����ֵ
		for(int i=0;i<10;i++){
			if(a[i]>max)
				max = a[i];
			System.out.println(a[i]);
		}
		
		//���������ӡ�ȼ�
		for(int i=0;i<10;i++){
			
			if(a[i]>=max-10){
				System.out.println("A");
			}else if(a[i]>=max-20){
				System.out.println("B");
			}else if(a[i]>=max-30){
				System.out.println("B");
			}else
				System.out.println("D");
			
		}
		
		

	}
}
