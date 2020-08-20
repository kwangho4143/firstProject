package com.yedam.abstracts;

public abstract class Animal {
	private String species;
	public Animal() {}
	public void showInfo(){
		System.out.println("분류는 " + species);
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드  상속받을 곳에서 코딩한다
	
	
}
