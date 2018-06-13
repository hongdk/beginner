package com.xclink.ch06.shape;

public class ComparableRectangle extends Rectangle implements CompareObject {

	public ComparableRectangle(int height, int width) {
		super(height, width);
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("矩形的比较方法");
		if(o instanceof Rectangle){
			Rectangle r1 = (Rectangle) o;
			if(this.getHeight() == r1.getHeight() && this.getWidth()==r1.getWidth()){
				return 1;
			}else
				return 0;
		}
		return -1;
	}

}
