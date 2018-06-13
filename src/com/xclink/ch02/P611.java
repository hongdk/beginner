package com.xclink.ch02;

public class P611 {
	
	public static void main(String[] args) {
		int days = 0; //共几天
		
		int month = 5; //月份
		int day = 6; // 日
		
		switch(1){
			case 1:
				days = days+31;
			case 2:
				days = days+28;
			case 3:
				days = days+31;
			case 4:
				days = days+30;
				switch(day){
					case 6: System.out.println("5.6");break;
					default:
						System.out.println("===");break;
				}
				if(month-1==4) break;
			case 5:
				days = days+31;if(month-1==5) break;
			case 6:
				days = days+30;
			case 7:
				days = days+31;
			case 8:
				days = days+31;
			case 9:
				days = days+30;
			case 10:
				days = days+31;
			case 11:
				days = days+30;	
			case 12:
				days = days+31;

			default:
				System.out.println("请输入1-12");
		}
			
		
		
		//增加当前月到当前日的天数
		days = days+day;
		System.out.println(days);
    }
}
