package com.xclink.ch08;

public class Sanj {
	
	private int x;
	private int y;
	private int z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Sanj(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getArea(){
		if(x+y<=z || x+z<=y || y+z<=x)
			throw new SanjExcetion("两边之和必须大于第三边"+"x:"+this.x+"y:"+this.y+"z:"+this.z);
		return x*x+y*y+z*z;
	}
	
	public void showInfo(){
		if(x+y<=z || x+z<=y || y+z<=x)
			throw new SanjExcetion("两边之和必须大于第三边"+"x:"+this.x+"y:"+this.y+"z:"+this.z);
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		return "Sanj [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	
	
	
	
	
}
