package com.yedam.classes;


public class Address {
	private String name;
	int age;
	String number;
	
	Address(){
	}
	Address(String name, int age,String number){
		this.name = name;
		this.age = age;
		this.number = number;
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
		
		this.age= age;
	}
	
	public void setNumber(String number) {
		
		this.number= number;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void getNumber(String name) {
		
		this.number= number;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", age=" + age + ", number=" + number + "]";
	}

	
	
}
