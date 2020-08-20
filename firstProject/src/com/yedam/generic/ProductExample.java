package com.yedam.generic;

import com.yedam.classes.Person;

public class ProductExample {
	public static void main(String[] args) {
		Product<String,Person> pr1 = new Product<>();
		
		pr1.setModel(new Person());
		pr1.setType(new String("유형"));
		
		
		
		
		Product<String,Integer> p1 = new Product<>();
		p1.setModel(10);
		p1.setType("이광호");
		
		Product<String,Integer> p2 = new Product<>();
		p2.setModel(10);
		p2.setType("이광호");
		
		//p1== p2는 주소값이 들어있는데 항상false가 나온다. 하지만 값을 비교할려면 compare를 하면 안의 내용물이 확인 가능하다
		
		boolean tof = Utils.compare(p1,p2);
		if(tof)
			System.out.println("논리적으로 같다");
		else
			System.out.println("논리적으로 다르다");
		
	}
	
	
}
