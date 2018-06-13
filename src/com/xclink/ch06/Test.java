package com.xclink.ch06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Chairman c1 = new Chairman();
		System.out.println(c1);
		
		Chairman c2 = new Chairman();
		System.out.println(c2);*/
		
		//Animal a1 = new Animal();
		
		Chairman c1 = Chairman.gen();
		Chairman c2 = Chairman.gen();
		Chairman c3 = Chairman.gen();
		
		if(c1==c3){
			System.out.println("====");
		}else{
			System.out.println("!!==");
		}
		
		
	}

}
