package com.yedam.abstracts;

public class AnimalExample {

	public static void main(String[] args) {
		//Animal anm = new Animal(); // 추상클래스는 인스턴스 생성불가
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		System.out.println(" ");
		anm = new Dog();
		anm.breathe();
		anm.sound();

		System.out.println(" ");
		int a = 10;
		double b = a; //pronotion
		a = (int)b ; //casting

		System.out.println(" ");
		Dog dog = (Dog) anm; //클래스도 강제 형 변환이 가능하다
		dog.sound();
		
		
	}

}
