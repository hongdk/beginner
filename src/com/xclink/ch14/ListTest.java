package com.xclink.ch14;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		for(int i=0;i<10;i++){
			list.add("str"+i);
		}
		
		int len = list.size();
		for(int i=0;i<len;i++){
			list.remove(len-1-i);
		}
		
		System.out.println(list.size());
	}

}
