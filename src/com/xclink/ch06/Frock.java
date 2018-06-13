package com.xclink.ch06;

public class Frock {
	
	private int size;
	private String color;
	private double price;
	private static int currentNum = 100000;
	private int serialNumber;
	
	public Frock(){
		this.serialNumber = getNextNum();
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public static int getNextNum(){
		return currentNum++;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Frock [size=" + size + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
	
}
