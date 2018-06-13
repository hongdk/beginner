package com.xclink.ch10;

import java.util.List;

public class Bag<T> {
	
	//
	private T content;

	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
	public void show(){
		System.out.println(content);
	}
	
	
	public<E> E get(List<E> list,int index){
		
		return list.get(index);
	}
	
	
	
}
