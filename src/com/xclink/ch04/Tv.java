package com.xclink.ch04;

/**************
 * 构造函数的重载
 * 		
 * @author Administrator
 *
 */
public class Tv {
	
	//属性
	private String color;
	private int length;
	private int width;
	private String brand;
	private double price;
		
	public Tv(String pcolor,double pprice){
	
		this.color = pcolor;
		this.price = pprice;
		
	}
	
	public Tv(String color,double price,int length,int width){
		
		this(color,price);
		this.length = length;
		this.width = width;
		
	}


	//方法
	public double sell(){
		
		return price+price*0.2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
