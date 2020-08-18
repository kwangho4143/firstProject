package com.yedam.classes;

public class Student {

	int id;
	String name;
	String major;

	Student(){
	}
	
	Student(int id){
		this.id = id;
	}
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	Student(int id,String name,String major){
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public int  getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public void setId() {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + "]";
	}

}

