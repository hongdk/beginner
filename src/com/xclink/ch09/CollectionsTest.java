package com.xclink.ch09;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class AgeCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student){
			Student st1 = (Student) o1;
			Student st2 = (Student) o2;
			return st1.getAge()-st2.getAge();
		}
		return 1;
	}
	
}
public class CollectionsTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		
		list.add(new Student("zs",30));  //zs  as
		list.add(new Student("as",40));
		list.add(new Student("as",10));
		list.add(new Student("bs",50));
		
		/*System.out.println(list);
		//Collections.sort(list,new AgeCompartor());
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, new Student("as",10)));
		Collections.reverse(list);
		System.out.println(list);*/
		
		Collections.shuffle(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	public static void max_min(){
		Collection coll = new HashSet();
		/*coll.add("abc");
		coll.add("dbc");
		coll.add("kbc");
		coll.add("zbc");*/
		
		
		/*coll.add(new Integer(695));
		coll.add(new Integer(678));
		coll.add(new Integer(612));
		coll.add(new Integer(665));*/
		
					
		coll.add(new Student("zs",30));  //zs  as
		coll.add(new Student("as",40));
		/*coll.add(new Student("as",10));
		coll.add(new Student("bs",50));*/
		
		//System.out.println("as".compareTo("zs"));
		Iterator it = coll.iterator();
		Student max = null;
		Student temp;
		while(it.hasNext()){
			temp = (Student) it.next();
			if(max==null)
				max = temp;
			else{
				if(max.compareTo(temp)<0)
					max = temp;
			}
			
		}
		
		System.out.println(max);
		
		System.out.println(coll.size());
		System.out.println(Collections.max(coll)); //zs
		System.out.println(Collections.min(coll)); //as
	
	}

}
