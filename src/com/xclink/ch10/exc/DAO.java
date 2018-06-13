package com.xclink.ch10.exc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DAO<E> {
	
	private Map<String,E> map;
	
	public void save(String id,E entity){
		if(map==null){
			map = new HashMap<String,E>();
		}
		map.put(id, entity);
	}
	
	
	public E get(String id){
		
		return map.get(id);
	}
	
	void update(String id,E entity){
		
		map.put(id, entity);
	}
	
	
	public List<E> list(){
		
		List<E> list  = new ArrayList();
		Set keySet = map.entrySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()){
			Entry<String,E> entry = (Entry<String,E>) it.next();
			list.add(entry.getValue());
		}
		return list;
	}
	
	
	public void delete(String id){
		map.remove(id);
	}
	
}
