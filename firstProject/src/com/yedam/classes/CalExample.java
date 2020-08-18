package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		
		Cal cal = new Cal();
		//cal.r = -5;
		cal.setRadius(0);
		
		//System.out.println("반지름 : "+ cal.getRadius() + "의 넓이는 : "+ cal.getArea());
		
		
//		
//		System.out.println(10);
//		System.out.println(10.5);
//		System.out.println("10");
//		
		
		print(200);
	}

	public static void print(int a) {
		System.out.println("입력값은 : " + a);
	}
	
	public static void print(double a) {
		System.out.println("입력값은 : " + a);
	}
	public static void print(String a) {
		System.out.println("입력값은 : " + a);
	}
	
}
