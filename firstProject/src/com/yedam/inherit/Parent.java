package com.yedam.inherit;

public class Parent {
	private String name;
	private int age;
	
	public Parent() {}

	
	public Parent(String name, int age) {
		super(); //부모클래스의 생성자 호출 => 모든 클래스는 object클래스를 상속받고 있다. 그래서 super()를 써주는 것
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
	public String toString() {
		//return super.toString(); // 주소값이 나온다
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
