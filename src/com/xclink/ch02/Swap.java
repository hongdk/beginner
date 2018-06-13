package com.xclink.ch02;

/*****
 * 函数定义:
 * 		格式:
 *      可见性（public/private/..）   static(面向对象是讲解)
 * 函数的调用:
 * @author Administrator
 *
 */
public class Swap {

	
	/*public static int add(int a,int b){
		
		int c = a+b;	
		return c;
		
	}*/
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = add(100,895);
		/*int a = 100;
		int b = 200;*/
		//System.out.println("输入参数:"+a+","+b);
		//swap(a,b);
		//System.out.println("调用后:"+a+","+b);
		//System.out.println("num="+num);
		
		Data data = new Data(100, 200);
		System.out.println("a="+data.a+";b="+data.b);
		swap(data);
		System.out.println("a="+data.a+";b="+data.b);
	}
	
	
	public static void swap(Data data){
		int c = data.a;
		data.a = data.b;
		data.b = c;
	}
	
	public static void swap(int a,int b){
		int c = a;
		a = b;
		b = c;
	}
	
	public static void swap(int[] a){
	    //System.out.println("a="+a+";b="+b);
		int c = a[0];
		a[0] = a[1];
		a[1] = c;
		//System.out.println("a="+a+";b="+b);
	}
	
	
	
	public static int  add(int a,int b)//add_int_int
	{
		return 1;
	}
	
	public static int  add(float a,int b)//add_float_int
	{
		return 1;
	}

	public static int  add(int a,float d)//add_int_float
	{
		return 1;
	}
	
	void show(int a,char b,double c){}    //show_int_char_double
	//void show(int x,char y,double z){}  //show_int_char_double
	int show(int a,double c,char b){return 1;} //show_int_double_char
    boolean show(int c,char b){return true;}  //show_int_double
	
	

}
