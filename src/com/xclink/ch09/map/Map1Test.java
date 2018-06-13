package com.xclink.ch09.map;

import java.util.HashMap;
import java.util.Map;

public class Map1Test {
	
	public static void main(String[] args) {
		
		//Cannot instantiate the type Map 接口不能用于创建对象
		//12001--userInfo; userInfo-1005
		Map map = new HashMap(); 
		UserInfo u1 = new UserInfo(12001,"张一");
		UserInfo u2 = new UserInfo(12002,"张二");
		UserInfo u3 = new UserInfo(12003,"张三");
		UserInfo u4 = new UserInfo(12004,"张四");
		
		
		map.put(u1, 1000);
		map.put(u2, 2000);
		map.put(u3, 3000);
		map.put(u4, 4000);
		map.put(u1, 9000);
		
		System.out.println(map.get(u1));
		System.out.println(map.size());
		
	}
}
