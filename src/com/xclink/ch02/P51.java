package com.xclink.ch02;

public class P51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		int y = 1;
		
		if (x > 2) {
		   //顺序1
		   if (y > 2){
			   
			   System.out.println("hello");
			   System.out.println(x + y);  //
		   }
			   
		   
		   //顺序2             
		   System.out.println("echo");//会
		} else{
		   System.out.println("x is " + x);// 不会
	    }
	
	
		 	boolean b = true;
	        if(b = false)  //如果写成if(b=false)能编译通过吗？如果能，结果是？
	        {
	        	System.out.println("a");//不会
	        	
	        }else if(b)      //
		 		System.out.println("b");//会 
	        else if(!b)
	        	System.out.println("c");//不会
			else
			    System.out.println("d");// 不会
			}

}
