package com.yedam.cond;

public class MethodExample {

	public static void main(String[] args) {
		multiTable(3,5);
		multiTable(3);
		multiTable();
	}

	
	public static void multiTable(int num1) {

		for(int i = 1; i<10;i++) {
			System.out.println(num1 + "*" + i + "=" + (num1*i));
		}
		
	}
	
	public static void multiTable(int a,int b) {

		for(int i = a; i<b;i++) {
			for(int j=1;j<10;j++) {
			System.out.println(i + "*" + j + "=" + (i*j));
				
			}
			
		}
		
	}
	
	public static void multiTable() {

		int num1=2;
		for(int i = 1; i<10;i++) {
			System.out.println(num1 + "*" + i + "=" + (num1*i));
		}
		
	}
	
}
