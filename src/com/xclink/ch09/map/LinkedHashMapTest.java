package com.xclink.ch09.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/***
 * HashSet:无序
 * LinkedHashSet: 串  铁索连环。
 * 
 * @author Administrator
 *
 */
public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		
		//CTRL+SHIFT+O
		//Map map = new HashMap();
		Map map = new LinkedHashMap();
		
		map.put("a", "hello1");
		map.put("f", "hello2");
		map.put("d", "hello3"); //
		map.put("g", "hello4");
		map.put("k", "hello5");
		map.put("d", "hello6"); //覆盖
		
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		String key,value;
		while(it.hasNext()){
			key = (String) it.next();
			value = (String) map.get(key);
			System.out.println("key:"+key+";value="+value); 
		}
		
		//System.out.println(map);
		
		
		
		
		
		
	}
}
