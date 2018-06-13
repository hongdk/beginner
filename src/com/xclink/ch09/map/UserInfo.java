package com.xclink.ch09.map;

public class UserInfo implements Comparable {
	
	private String name;  //姓名
	private String address; //地址
	private boolean sex; //
	private int age;
	private String province; //省
	private int userNo;
	private int monery;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	
	public UserInfo( int userNo,String name) {
		super();
		this.name = name;
		this.userNo = userNo;
	}
	
	
	
	
	public UserInfo( int userNo, String name,int monery) {
		super();
		this.name = name;
		this.userNo = userNo;
		this.monery = monery;
	}
	public int getMonery() {
		return monery;
	}
	public void setMonery(int monery) {
		this.monery = monery;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + monery;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + userNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (monery != other.monery)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (userNo != other.userNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", userNo=" + userNo + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof UserInfo){
			UserInfo user = (UserInfo) o;
			if(this.name.compareTo(user.getName())==0){
				return this.userNo-user.getUserNo();
			}else{
				return this.name.compareTo(user.getName());
			}
		}
		
		return 1;
	}
	
	
	
	
	
}
