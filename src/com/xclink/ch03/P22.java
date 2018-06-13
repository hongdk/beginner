package com.xclink.ch03;
import java.util.Scanner;

import com.xclink.ch05.Person;

public class P22 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int max = 0;
		//从键盘输入学生的成绩
		for(int i=0;i<10;i++){
			int score = scanner.nextInt(); //从键盘输入数值
			a[i] = score;
		}
		System.out.println("打印输入的分数值");
		
		max = a[0];
		//遍历数组寻找最大值
		for(int i=0;i<10;i++){
			if(a[i]>max)
				max = a[i];
			System.out.println(a[i]);
		}
		
		//遍历数组打印等级
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
