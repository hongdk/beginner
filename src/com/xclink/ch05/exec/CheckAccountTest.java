package com.xclink.ch05.exec;

public class CheckAccountTest {
	
	public static void main(String[] args) {
		
		CheckAccount c1 = new CheckAccount();
		c1.setId(1122);
		c1.setBalance(20000);
		c1.setAnnualInterestRate(0.45); //doulbe
		
		c1.withdraw(5000);
		System.out.println(c1);
		
		c1.withdraw(18000);
		System.out.println(c1);
		
		c1.withdraw(3000);
		System.out.println(c1);
		
		
		
	}
}
