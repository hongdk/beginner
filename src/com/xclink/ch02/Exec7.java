package com.xclink.ch02;

/****
 * 7.有口井7米深，一只青蛙白天爬3米，晚上坠下2米，问这青蛙几天才能爬出这口井 
 * @author Administrator
 *
 */
public class Exec7 {

	public static void main(String[] args) {
		
		int m = 0; //定义变量m保存 当前爬出的位置
		int days = 0;
		
		do{
			days++;  //体会days++的位置
			m = m+3; //白天到了  开始努力爬出3米 
			m = m-2; //晚上了 要追下2米了
			
			if(m>=7) 
				break;
		}while(true);
		
		System.out.println(days++);
		
	}

}
