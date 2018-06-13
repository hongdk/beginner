package com.xclink.ch10;

public class Gun {
	
	private String brand;
	private int balls;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	
	
	public Gun(String brand, int balls) {
		super();
		this.brand = brand;
		this.balls = balls;
	}
	
	@Override
	public String toString() {
		return "Gun [brand=" + brand + ", balls=" + balls + "]";
	}
	
	

	
	
	

}
