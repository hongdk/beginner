package com.xclink.ch02;

public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*short  s = 5;
	    //s = s-2; //数值常量 默认为Int
		
		
		byte b = 3;
	    //b = b + 4; //编译不通过: 数值常量 默认为Int                  
	    b = (byte)(b+4); //强制类型转换
	    
	    char c = 'a';
        int  i = 5;
        double d = .314;
        double result = c+i+d;     */
        
		
        byte b = 5;
        short s = 3;
        short t =  (short) (s + b); //精度缺失
        short t1 = (short) (s - b);
        
        

	    
	      
	}

}
