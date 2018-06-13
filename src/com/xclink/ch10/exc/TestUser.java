package com.xclink.ch10.exc;

public class TestUser {
	
	public static void main(String[] args) {
		
		DAO<User> dao = new DAO<User>();
		
		User user1 = new User(1,"张1",30);
		User user2 = new User(1,"张2",60);
		
		dao.save("1", user1);
		dao.save("2", user2);
		
		System.out.println(dao.get("1"));
		
		dao.update("1", new User(99,"张99",99));
		System.out.println(dao.get("1"));
		
		System.out.println(dao.list());
		dao.delete("1");
		System.out.println(dao.get("1"));
		
	}

}
