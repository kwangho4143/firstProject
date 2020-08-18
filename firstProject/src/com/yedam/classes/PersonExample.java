package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		
		
		
		
		p1.name = "123";
//		p1.setAge(27);
//		
		
		
		
		
		
		
//		System.out.println(p1.getName());
//	    System.out.println(p1.getAge());
//
//	    Person kwh = new Person();
//	    kwh.setName("asd");
//	    
//	    Person kde = new Person();
//	    kdh.setName(("김다은"));
//	    kdh.setAge(21);
//	    System.out.println(kdh.getName());
//	    
//	    System.out.println(kdh == p1);
//	    
		Person anoy = new Person("민해주");
		System.out.println(anoy.introduce()); //자동 초기화가 된다 기본생성자에 값을 지정해줘서
		
	    
		Person anoyy= new Person("이광호",45);
		System.out.println(anoyy.introduce()); //자동 초기화가 된다 기본생성자에 값을 지정해줘서
		
	    
	    
	    }
	    
	}


