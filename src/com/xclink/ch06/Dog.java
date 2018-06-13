package com.xclink.ch06;

/*********************************
 * final:
 *     1.定义为final的类不允许被继承
 *     2.final方法是不可被重写
 *     3.final属性 不可以被修改同时在定义时给默认值
 *     
 * @author Administrator
 *
 ******************************/

public  class Dog extends Animal {
	
	private final String name = "狗类";
	private int no;
	
	public Dog(int no){
		this.no = no;
		System.out.println("狗在被创建");
	}
	
	
	
	@Override
	public void breah() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int sound() {
		System.out.println("狗叫,旺旺");
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog(100);
		d1.cn = 100;
		System.out.println(d1.cn);
		System.out.println(d1.sound());
		
	}
	
	

}

class ZangAo extends Dog{
	
	
	public ZangAo(int no) {
		super(no);
	}
	
	public static void main(String[] args) {
		System.out.println("zaoga");
	}

	
	
}
