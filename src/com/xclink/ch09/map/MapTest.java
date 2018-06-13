package com.xclink.ch09.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		//Cannot instantiate the type Map 接口不能用于创建对象
		//12001--userInfo; userInfo-1005
		
		List list = new ArrayList();
		
		
		Map map = new HashMap(); 
		UserInfo u1 = new UserInfo(12001,"张一",1000);
		UserInfo u2 = new UserInfo(12002,"张二",2000);
		UserInfo u3 = new UserInfo(12003,"张三",3000);
		UserInfo u4 = new UserInfo(12004,"张四",4000);
		
		UserInfo u11 = new UserInfo(12001,"张一",3000);
		UserInfo u21 = new UserInfo(12002,"张二",1000);
		UserInfo u31 = new UserInfo(12003,"张三",3000);
		UserInfo u41 = new UserInfo(12004,"张四",8000);

		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u11);
		list.add(u21);
		list.add(u31);
		list.add(u41);
		
		//写  主键如果重复则会覆盖
		map.put(12001, u1);  //
		map.put(12002, u2);
		map.put(12003, u3);
		map.put(12004, u4);
		//map.put(12001, u2);
		
		System.out.println(map.size());
		System.out.println(map.containsValue(u1));
		System.out.println(map.containsValue(new UserInfo(12001,"张一",1000)));
		/*
		System.out.println(map.containsKey(12002));
		
		//读
		UserInfo temp = (UserInfo) map.get(12001);
		System.out.println(temp);*/
		
		
		
		/*//删除
		map.remove(12004);
		System.out.println(map.size());
		
		Set  set1 = map.entrySet();
		Iterator it = set1.iterator();
		while(it.hasNext()){
			Entry en = (Entry) it.next();
			System.out.println("key:"+en.getKey()+";userInfo:"+en.getValue());
		}

		Set ks1 = map.keySet();
		Iterator it1 = ks1.iterator();
		int key ;
		UserInfo userInfo;
		while(it1.hasNext()){
			key = (int) it1.next();
			userInfo = (UserInfo) map.get(key);
			System.out.println("key:"+key+";userInfo:"+userInfo);
		}
		

		for(Object obj: map.entrySet()){
			Entry en = (Entry) obj;
			System.out.println("key:"+en.getKey()+";userInfo:"+en.getValue());
		}
		*/
		
		
		
		
		//System.out.println(map.toString());
		
	}
}
