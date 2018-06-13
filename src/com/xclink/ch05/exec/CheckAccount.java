package com.xclink.ch05.exec;

public class CheckAccount extends Account {
	
	
	private double overdraft; //可透支限额   20000
	
	/**
	 * 方法:
	 *    用于取款操作。
	 *    amount:取款额度  100 
	 */
	@Override
	public void withdraw(double amount) {
		
		if(amount<getBalance()){
			//如果（取款金额<账户余额），可直接取款 1000-100
			double diff = getBalance()-amount;
			setBalance(diff);
		}else{
			//如果（取款金额>账户余额） 9999 - 1000 = 8999
			double tmp = amount-getBalance();
			if(tmp>overdraft){
				System.out.println("用户超过可透支额的限额");
			}else{
				setBalance(0);  //余额为0
				overdraft = overdraft-tmp;
			}
			
		}
	}

	@Override
	public String toString() {
		return "CheckAccount [overdraft=" + overdraft + ", getId()=" + getId()
				+ ", getBalance()=" + getBalance()
				+ ", getAnnualInterestRate()=" + getAnnualInterestRate()
				+ ", getMonthlyInterest()=" + getMonthlyInterest() + "]";
	}
	
	
	
	
	

}
