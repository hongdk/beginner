package com.xclink.ch06.ticks.py;

/***
 * 我们代理商 
 *    实现IPhone 表示一种能力
 * @author Administrator
 *
 */
public class PoxyPhoneMaker implements IPhone {

	private XMPhoneMaker xm ; //小米生产商
	private HWPhoneMaker hm ; //华为手机生产商
	private String str;
	private int price; //0
	
	//可见性 类型（基本、类、） 变量名

	@Override
	public void makePhone() {
		if(str==null){
			str = new String("代理商");
			System.out.println(str.length());
		}
			
		price = 1000;
		
		if(hm==null)
			hm = new HWPhoneMaker();
		hm.makePhone();
	}
	
	

	
}
