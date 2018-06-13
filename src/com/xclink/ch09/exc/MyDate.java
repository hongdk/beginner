package com.xclink.ch09.exc;

public class MyDate implements Comparable {
	
	private int month;
	private int day;
	private int year;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public MyDate(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		return "MyDate [month=" + month + ", day=" + day + ", year=" + year
				+ "]";
	}
	
	
	public int compareTo(Object obj) {
		if(obj instanceof MyDate){
			MyDate d1 = (MyDate) obj;
			if(this.year==d1.getYear()){
				if(this.month==d1.getMonth()){
					
					if(this.day==d1.getDay()){
						return 0;
					}else{
						return this.day-d1.getDay();
					}
					
				}else
				{
					return this.month-d1.getMonth();
				}
			}else
				return this.year-d1.getYear();
		}
		
		return 1;
	}
	
	
}
