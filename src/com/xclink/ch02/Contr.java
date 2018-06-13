package com.xclink.ch02;

import java.util.*;
class Contr
{
	public static void main(String[] args) 
	{

		/*Scanner scanner = new Scanner(System.in);
	    int grade = scanner.nextInt();

		//顺序结构  
		int b = 100;
		int a = b+10;*/
	
		
		//顺序结构====【if陷阱】
		int score = 90;
		if(score>60){
			System.out.println("及格");	
		}else if(score>80){
			System.out.println("良好");	
		}else{
			System.out.println("优秀");	
		}

		System.out.println("Hello World!");
	}
}
