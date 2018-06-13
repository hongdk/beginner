package com.xclink.ch10;

public class Rose extends Flower {
	
	public Rose(String name, int price) {
		super(name, price);
	}
	
	private String color;
	private int leaf;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeaf() {
		return leaf;
	}
	public void setLeaf(int leaf) {
		this.leaf = leaf;
	}
	
	
	
}
