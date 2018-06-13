package com.xclink.ch06;

/***
 * 
 * @author Administrator
 * 
 */
public class StaticTest {
	
	public static void main(String[] args) {

		Person[] persons = new Person[100]; //100个数  0-99
		for(int i=0;i<100;i++){
			persons[i] = new Person("李"+i,i);
			//System.out.println(persons[i]);
		}
		
		System.out.println(Person.getTotal());
		/*Person.country = "中国";//通过类修改
		//persons[0].country = "中国"; //通过任意一个对象修改
		for(int i=0;i<100;i++){
			
			System.out.println(persons[i]);
		}*/
		
		
		
		
		
	}
}
