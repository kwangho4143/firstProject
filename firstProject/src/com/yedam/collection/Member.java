package com.yedam.collection;

//com.yedam.classes.exam.Member
//com.yedam.collection.Member


public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member mem = (Member) obj;
		return this.name.contentEquals(mem.name);
	}
	
	//hashcode, equals 활용. 논리적으로 동일한 객체
	
	
	
	
}
