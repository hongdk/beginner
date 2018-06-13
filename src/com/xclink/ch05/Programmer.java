package com.xclink.ch05;

public class Programmer extends Person {
	
	public Programmer(String company,int salary){
		this.company = company;
		this.salary = salary;
	}
	
	private String company;
	private int salary;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
