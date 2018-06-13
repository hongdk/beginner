package com.xclink.ch02;

public abstract class Test {

	public static void main(String args[]){
  	   for (int i = 1; i < 100; i++) {
  		   for(int j=1;j<11;j++){
  			 if (j%10==0){
  				  System.out.println("j="+j);
  		          break;
     	     }

  		   }
   	    
  		 System.out.println("i="+i);//
	}  
  	   
  }

}
