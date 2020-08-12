package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "이광호";
		System.out.println(str1 + "," + name);
		
		int v1 = 150,v2 = 270;
		int result = add(v1,v2);
		System.out.println( "결과값:" + result);
		
		introduce(name);
	
		minus(v1,v2);
		
	}
	public static void minus(int a,int b) {
		int result = a-b;
		System.out.println( "두수의 차이:" + result);
	}
	
	
	
	public static void introduce(String name) {
		System.out.println("저는 " + name + "입니다");
	
		
		
	}
	
	
	
	public static int add(int x,int y) {
		int sum = x + y;
		return sum;
	}

}
