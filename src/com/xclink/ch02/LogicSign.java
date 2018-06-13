package com.xclink.ch02;

class LogicSign 
{
	public static void main(String[] args) 
	{
		//===========================================逻辑运算=============================
		boolean a = true;
		boolean b = false;
		System.out.println(a^b);

		//逻辑与 会执行完所有判断语句
		int a1 = 100;
		if(b&(a1++>0)){
			System.out.println(b+" "+a1);
		}else{
			System.out.println(b+" "+a1);
		}

		//短路与 如果遇到false就结束判断，后续判断语句不执行
		a1 = 100;
		if(b&&(a1++>0)){
			System.out.println(b+" "+a1);
		}else{
			System.out.println(b+" "+a1);
		}
		System.out.println("Hello World!");
	
		int n1 = 90;
		int n2 = 100;

		int n3 = n1>n2?n1:n2;
		System.out.println(n3);

		String n4 = n1>n2? "n1>n2" : (n1==n2)? "n1==n2" : "n1<n2";
		System.out.println(n4);

		byte b22 = 0;
		String s = 4- ++b22*2>>2-1>0?"正确":"错误";

		System.out.println(4- ++b22);
		System.out.println(2>>1);
		System.out.println(s);
      

		//exec1();
		//exec2();
		//exec3();
		//exec4();
		
	}

	public static void exec1(){
		
		int x = 1;
		int y=1;
		if(x++==2&++y==2){
			x =7;
		}
		// 2 2
		System.out.println(x+"  "+y);

	}

	public static void exec2(){
	
		int x = 1,y = 1;
		if(x++==2 && ++y==2){
			x =7;
		}
		//2 1 
		System.out.println("x="+x+",y="+y);

	}

	public static void exec3(){
		
		int x = 1,y = 1;
 
		if(x++==1 | ++y==1){
			x =7; //执行
		}
		//7 2
		System.out.println("x="+x+",y="+y);

	}

	public static void exec4(){
		
		int x = 1,y = 1;
 
		if(x++==1 || ++y==1){
			x =7;
		}
		//7 1
		System.out.println("x="+x+",y="+y);
		
	}

}
