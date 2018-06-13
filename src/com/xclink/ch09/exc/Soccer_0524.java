package com.xclink.ch09.exc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Soccer_0524 {
	
public static void main(String[] args) {
	
	List ls = new ArrayList();
	ls.add("意大利");
	ls.add("荷兰");
	ls.add("俄罗斯");ls.add("中国");
	ls.add("德国");ls.add("伊朗");ls.add("日本");ls.add("朝鲜");ls.add("韩国");
	ls.add("法国");ls.add("捷克");ls.add("巴西");ls.add("智利");ls.add("阿根廷");
	ls.add("乌拉圭");
	ls.add("西班牙");
	
	List teamA = new ArrayList(4);
	List teamB = new ArrayList(4);
	List teamC = new ArrayList(4);
	List teamD = new ArrayList(4);
	
	for (int i = 0; i < 4; i++) {
		//[0,16)=[0,15]  [0,15)=[0,14]
		int pre1 = new Random().nextInt(ls.size());
		teamA.add(ls.get(pre1));
		ls.remove(pre1); //remove
	}
	
	for (int i = 0; i < 4; i++) {
		int pre2 = new Random().nextInt(ls.size());
			teamB.add(ls.get(pre2));
			ls.remove(pre2);
	}
	
	for (int i = 0; i < 4; i++) {
		int pre3 = new Random().nextInt(ls.size());
			teamC.add(ls.get(pre3));
			ls.remove(pre3);
	}
	
	for (int i = 0; i < 4; i++) {
			int pre4 = new Random().nextInt(ls.size());
			teamD.add(ls.get(pre4));
			ls.remove(pre4);
	}
	
	System.out.println(teamA);
	System.out.println(teamB);
	System.out.println(teamC);
	System.out.println(teamD);
}
}
