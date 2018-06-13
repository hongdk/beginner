package com.xclink.ch06.exam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c1 = new Computer(10);
		
		Mouse m1 = new Mouse(1001);
		c1.addDevice(m1);
		
		Display d1 = new Display(1002);
		c1.addDevice(d1);
		
		Printer p1 = new Printer(1003);
		c1.addDevice(p1);
		
		Mouse m2 = new Mouse(1004);
		c1.addDevice(m2);
		
		System.out.println(c1.getRealCount());
		
		c1.dislaly();
		
		/*c1.powerOn();
		c1.removeDevice(1001);
		System.out.println(c1.getRealCount());
		c1.powerOn();
		//c1.powerDown();
*/		
		
	}

}
