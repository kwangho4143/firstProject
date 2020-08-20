package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("이광호");
		list.add("김시무");
		list.add(1,"김다은");
		
		
		for(int i=0;i<list.size();i++) {
			list.add(i,"김다은");
			System.out.println(list.get(i));  //무한으로 담아진다.
		}
		
		
		
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
