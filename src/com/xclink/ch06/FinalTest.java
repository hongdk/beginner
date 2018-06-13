package com.xclink.ch06;

/*****
 * 函数的定义:
 * 		函数不可以被嵌套定义。
 * 函数的重载:
 * 
 * @author Administrator
 *
 */
public class FinalTest {
	
	public void add(final int a){
		//a++;
	}
	
	
	public void add(final Amermian person){
		//a++;
		//person = new Amermian();
		//person.num++;
		String a = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}


class Amermian{
	public final int num = 1706;
}
