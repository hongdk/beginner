package com.xclink.ch02;

import java.util.Scanner;

public class P57 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			
			int month = scanner.nextInt();
			switch(month){
				
				case 3:
				case 4:
				case 5:
					System.out.println("����");break;
				case 6:
				case 7:
				case 8:
					System.out.println("�ļ�");break;
				case 9:
				case 10:
				case 11:
					System.out.println("��");break;
				case 12:
				case 1:
				case 2:
					System.out.println("��");break;
				default:
					System.out.println("��������ȷ���·ݡ�1-12��");
					break;
				
			
			}
		}
		
		    
		 
	}
}
