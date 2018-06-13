package com.xclink.ch06.shape;

public class ComparableCircle extends Circle implements CompareObject {

	public ComparableCircle(int radius) {
		super(radius);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Circle){
			Circle c1 = (Circle) obj;
			if(this.getRadius()==c1.getRadius())
				return true;
			else 
				return false;
		}else{
			return false;
		}
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println("圆的比较方法");
		if(o instanceof Circle){
			Circle c1 = (Circle) o;
			/*if(this.getRadius()==c1.getRadius())
				return 1;
			else 
				return 0;*/
			/*if(this==c1){
				return 1;
			}else
				return 0;*/
			
			if(this.equals(c1)){
				return 1;
			}else
				return 0;
		}else{
			//System.out.println("输入cirle类型");
			return -1;
		}
			
		
	}

}
