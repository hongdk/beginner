package com.xclink.ch05.exec;

public class Account {
	
	private int id; //�˺�ID
	private double balance; //���
	private double annualInterestRate; //������
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/*
	 * ����������
	 */
	public double getMonthlyInterest(){
		//
		return this.annualInterestRate/12;
	}
	
	/**
	 * ȡ���
	 * @param amount
	 */
	public void withdraw (double amount){
		if(this.balance>amount)
			this.balance = this.balance - amount;
		else
			System.out.println("����");
	}
	
	/**
	 * ����
	 * @param amount
	 */
	public void deposit (double amount){
		this.balance = this.balance+amount;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance
				+ ", annualInterestRate=" + annualInterestRate + "]";
	}
	
	
	
	

}
