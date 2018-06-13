package com.xclink.ch09.map;

import java.util.Comparator;
import java.util.TreeMap;

/****
 * TreeMap:
 * @author Administrator
 *
 */

//定制
class MyCompartor implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof UserInfo && o2 instanceof UserInfo ){
			UserInfo user1 = (UserInfo) o1;
			UserInfo user2 = (UserInfo) o2;
			if(user1.getName().compareTo(user2.getName())==0){
				return user2.getUserNo()-user1.getUserNo();
			}else{
				return user2.getName().compareTo(user1.getName());
			}
		}
		
		return 1;
	}
	
}

public class TreeMapTest {
	
	public static void main(String[] args) {
		
		UserInfo u1 = new UserInfo(12001,"a张一");
		UserInfo u2 = new UserInfo(12002,"d张二");
		UserInfo u3 = new UserInfo(12003,"f张三");
		UserInfo u4 = new UserInfo(12004,"c张四");
		
		TreeMap treeMap = new TreeMap(new MyCompartor());
		treeMap.put(u1, 12001);
		treeMap.put(u2, 12002);
		treeMap.put(u3, 12003);
		treeMap.put(u4, 12004);
		
		System.out.println(treeMap);
		
	}
	
	
	public static void test1(){
		
		UserInfo u1 = new UserInfo(12001,"a张一");
		UserInfo u2 = new UserInfo(12002,"d张二");
		UserInfo u3 = new UserInfo(12003,"f张三");
		UserInfo u4 = new UserInfo(12004,"c张四");
		
		TreeMap treeMap = new TreeMap();
		/*treeMap.put(91001, u1);
		treeMap.put(36002, u2);
		treeMap.put(87003, u3);
		treeMap.put(12004, u4);*/
		
		//cannot be cast to java.lang.Comparable 
		//key保持唯一:即每一个放入的值均会与已经放入的键进行比较
		treeMap.put(u1, 12001);
		treeMap.put(u2, 12002);
		treeMap.put(u3, 12003);
		treeMap.put(u4, 12004);
		
		System.out.println(treeMap);
		System.out.println(treeMap.size());
	}
}
