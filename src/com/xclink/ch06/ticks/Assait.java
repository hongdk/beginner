package com.xclink.ch06.ticks;

public class Assait implements IBuyTickts {

	private WindowsBuy windowBuy = null;
	private NetBuy netBuy = null;
	
	
	private int days = 0;
	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		if(days%2==0){
			if(windowBuy==null)
				windowBuy = new WindowsBuy();
			this.windowBuy.buy();
		}else{
			if(netBuy==null)
				netBuy = new NetBuy();
			netBuy.buy();
		}
		
		this.days++;
		
		
	}

}
