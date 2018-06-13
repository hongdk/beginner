package com.xclink.ch06.shape;

public class TestInterface {
	
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(10);
		ComparableCircle c2 = new ComparableCircle(11);
		ComparableCircle c3 = new ComparableCircle(10);
		
		/*if(c1.compareTo(c2)==1){
			System.out.println("c1==c2");
		}else{
			System.out.println("c1!=c2");
		}*/
		
	/*	if(c1.compareTo(c3)==1){
			System.out.println("c1==c3");
		}else{
			System.out.println("c1!=c3");
		}*/
		
		ComparableRectangle r1 = new ComparableRectangle(100, 200);
		ComparableRectangle r2 = new ComparableRectangle(200, 100);
		ComparableRectangle r3 = new ComparableRectangle(100, 200);
		/*if(r1.compareTo(r2)==1){
			System.out.println("r1==r2");
		}else{
			System.out.println("r1!=r2");
		}*/
		
		/*if(r1.compareTo(r3)==1){
			System.out.println("r1==r3");
		}else{
			System.out.println("r1!=r3");
		}*/
		
		
		CompareObject[] coms = {c1,r1,c2,r2};
		
		for(int i=0;i<coms.length-1;i++){
	
			System.out.println(coms[i].compareTo(coms[i+1]));
		}
		
		
	}
}
