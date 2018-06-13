package com.xclink.ch02;

public class P52 {
	
	public static void main(String[] args) {
		
		int height = 10;
		int wealth = 1000;
		boolean handSome = false;
		
		marrage1(height, wealth, handSome);
		
	}
	
	
	public static void marrage1(int height,int wealth,boolean handSome){
		
		if(height>180 && wealth>10000000 && handSome==true ){
			//三个条件全部满足
			System.out.println("我一定要嫁给他!!!");
		}else if(height>180 || wealth>10000000 || handSome==true){
			
			System.out.println("嫁吧，比上不足，比下有余");
			
		}else{
			System.out.println("不嫁！");
		}
		
	}
	
	/********
	 * 
	 * @param height
	 * @param wealth
	 * @param handSome
	 * 
	 * 特别注释：
	 *     if条件的顺序
	 */
	public static void marrage2(int height,int wealth,boolean handSome){
		
		if(height>180 || wealth>10000000 || handSome==true){	
			System.out.println("嫁吧，比上不足，比下有余");
		}
		else if(height>180 && wealth>10000000 && handSome==true ){
			//三个条件全部满足
			System.out.println("我一定要嫁给他!!!");
		}else {
			System.out.println("不嫁！");
		}
		
	}

}
