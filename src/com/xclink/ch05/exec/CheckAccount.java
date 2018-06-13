package com.xclink.ch05.exec;

public class CheckAccount extends Account {
	
	
	private double overdraft; //��͸֧�޶�   20000
	
	/**
	 * ����:
	 *    ����ȡ�������
	 *    amount:ȡ����  100 
	 */
	@Override
	public void withdraw(double amount) {
		
		if(amount<getBalance()){
			//�����ȡ����<�˻�������ֱ��ȡ�� 1000-100
			double diff = getBalance()-amount;
			setBalance(diff);
		}else{
			//�����ȡ����>�˻��� 9999 - 1000 = 8999
			double tmp = amount-getBalance();
			if(tmp>overdraft){
				System.out.println("�û�������͸֧����޶�");
			}else{
				setBalance(0);  //���Ϊ0
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
