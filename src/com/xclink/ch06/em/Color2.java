package com.xclink.ch06.em;

public enum Color2 {
	
	RED("红色",1);
	
	private String colorName;
	private int index;
	
	private Color2(String name,int value) {
		this.colorName = name;
		this.index = value;
		
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Color2.RED.colorName);
		Color2.values();
		
	}

}
