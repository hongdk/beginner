package com.xclink.ch02;

import java.util.Scanner;

public class P571 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			int score = scanner.nextInt();
			switch(score/60){
			
				case 1:
					System.out.println("�ϸ�");break;
				case 0:
					System.out.println("���ϸ�");break;
				default:
					System.out.println("������1-100����ֵ");
					break;

			}	
		}
	}
}
