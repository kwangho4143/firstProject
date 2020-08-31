package com.yedam.test;

import java.util.ArrayList;
import java.util.List;


public class PeopleExample {

	public static void main(String[] args) {
		//People personData = new People("이광호",27,new Pet("멍멍이",27,"암컷"),new Fruit("사과",1000));
		//People people = new People("김다희",27,new Pet("고양이",20,"수컷"),new Fruit("딸기",2000));
		//People people = new People("이광호",27,new Pet("멍멍이",21,"암컷"),new Fruit("수박",3000));
		
	
		List<People> personData = new ArrayList<>();
		Pet petArry[]= new Pet[2];
		Fruit fruitArry[] = new Fruit[2];
		
		
		personData.add(new People("이광호",27,new Pet[] {new Pet("고양이",20,"수컷"),new Pet("고양",21,"암컷")},new Fruit[] {new Fruit("사과",200),new Fruit("고양",10)})) ;
	
		
		for(People p : personData) {
			System.out.println(p);
		}
		
	}

}
