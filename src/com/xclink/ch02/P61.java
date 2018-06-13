package com.xclink.ch02;

public class P61 {
	
	public static void main(String[] args) {
		
		int days = 0; //共几天
		
		int month = 5; //月份
		int day = 6; // 日
		
		//计算到当前月初之前的天数
		for(int i=1;i<month;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days = days+31;break;
				case 4:
				case 6:
				case 9:
				case 11:
					days = days+30;break;
				case 2:
					days = days+28;
				default:
					System.out.println("请输入1-12");
			}
		}
		
		//增加当前月到当前日的天数
		days = days+day;
		System.out.println(days);
    }
}
