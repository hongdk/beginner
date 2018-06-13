package com.xclink.ch09.xf;

public class MyDate implements Comparable{
	
	private int month;
	private int year;
	private int day;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public MyDate(int month, int year, int day) {
		super();
		this.month = month;
		this.year = year;
		this.day = day;
	}
	@Override
	public String toString() {
		return "MyDate [month=" + month + ", year=" + year + ", day=" + day + "]";
	}
	public int getYear() {
		return year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyDate dt =null;
		if(o instanceof MyDate) {
			dt = (MyDate) o;
			if(this.year==dt.year) {
				if(this.month ==dt.month) {
					return this.day -dt.day;
				}else {
					return this.month - dt.month;
				}
			}else {
				return  this.year - dt.year;
			}
		}
		return -1;
	}
}
