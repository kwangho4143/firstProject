package com.yedam.classes;

public class CalcalatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		System.out.println("10+20 = " + cal.add(10, 20));
		System.out.println("10+20 = " + cal.add(10.0, 20.0));
		
		double r1 = 3.5;
		cal.getArea(r1);
		
		cal.getArea2(4,5);
	
	}

}
