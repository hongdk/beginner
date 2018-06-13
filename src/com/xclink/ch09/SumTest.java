package com.xclink.ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumTest {
	
	public static void main(String[] args) {
		
		//12001-4000;12002-3000;12003-6000;12004-12000
		//12001-3  12002-3 12004-2 12004-2
		List list = new ArrayList();
		UserInfo u1 = new UserInfo(12001,"张一",1000);
		UserInfo u2 = new UserInfo(12002,"张二",2000);
		UserInfo u3 = new UserInfo(12003,"张三",3000);
		UserInfo u4 = new UserInfo(12004,"张四",4000);
		
		UserInfo u11 = new UserInfo(12001,"张一",3000);
		UserInfo u21 = new UserInfo(12002,"张二",1000);
		UserInfo u31 = new UserInfo(12003,"张三",3000);
		UserInfo u41 = new UserInfo(12004,"张四",8000);
		
		UserInfo u12 = new UserInfo(12001,"张一",3000);
		UserInfo u22 = new UserInfo(12002,"张二",1000);

		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u11);
		list.add(u21);
		list.add(u31);
		list.add(u41);
		
		sum(list);
		
		
	}
	
	//userNo money
	public static Map sum(List list){
		
		Map map = new HashMap();
		
		UserInfo temp ;
		if(list!=null){
			for(int i=0;i<list.size();i++){
				temp = (UserInfo) list.get(i);
				
				if(map.containsKey(temp.getUserNo())){
					//判断结果中是否包含 该用户
					int cur = (int) map.get(temp.getUserNo());
					int sum = cur+temp.getMonery();
					map.put(temp.getUserNo(), sum);
				}else{
					map.put(temp.getUserNo(), temp.getMonery());
				}
			}
		}
		
		System.out.println(map);
		return map;
		
	}
	
	
	//userNo-count
	public static Map count(List list){
		
		Map map = new HashMap();
		
		System.out.println(map);
		return map;
		
	}
}
