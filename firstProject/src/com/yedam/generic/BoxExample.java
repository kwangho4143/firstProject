package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {

	public static void main(String[] args) {
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String)box.get(); // Object타입을 String 타입으로 변환시 형변환을 해줘야한다.
//		
//		Person p1 = new Person();
//		box.set(p1);
//		Person p2 = (Person)box.get();
//		
//		result = (String)box.get(); //runtime에러

		Box<String> box = new Box<String>();
		String str1 = new String("Hello");
		
		box.set(new String(str1));
		String result =box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person result1=box2.get();
		
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
		
		
		
		
		
	}
}
