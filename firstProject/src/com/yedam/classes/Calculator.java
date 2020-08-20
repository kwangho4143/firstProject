package com.yedam.classes;

public class Calculator {
	double pi = 3.14;
	
	public static int add(int x,int y) {
		return x+y;		
	}
	
	public double add(double x , double y) {
		return x+y;
	}
	
	
	
	public void getArea(double a) {
		double result = a*a*pi;
		System.out.println("반지름"+a+"원의 넓이"+result);
	}
	public void getArea2(double a,double b) {
		double result = a*b;
		System.out.println("가로" + a + "세로" + b + "and" + "직사각형의 넓이" + result);
	}
	
	
	
}
