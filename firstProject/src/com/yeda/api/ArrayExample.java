package com.yeda.api;

import java.util.Arrays;

class User implements Comparable<User>{
	String name;
	int grade;
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.grade-o.grade; 
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	
}


public class ArrayExample {

	public static void main(String[] args) {
		
//		String[] names = {"Hong","Park","Choi"};
//
//		Arrays.sort(names);
//		for(int i = 0 ; i <  names.length ; i ++) {
//			System.out.println(names[i]);
//		}
		
		User[] users = {new User("user1",1),new User("user2",2),new User("user3",3)};
		Arrays.sort(users);
		for(User s : users) {
			System.out.println(s);
		}
		
	}
}
