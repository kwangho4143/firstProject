package com.yedam.dev;

public class OperatorExample {

	public static void main(String[] args) {
		
		int vall = 10;
		int result = 3 + (8 - 5) * 4+vall++;
	/*
		System.out.println(result);
		System.out.println(vall);
	
		result = 10 % 7;
		System.out.println(result); //나머지연산
		
		double r1 = (double)10/7;//둘중에 하나는 실수 타입이어야한다
		System.out.println(r1);
		
*/		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i % 2 != 0 ) {
				System.out.println("홀수");
			    System.out.print("\n");
			}
			    else {
				System.out.println("짝수");
			    System.out.print("\n");	
		    }
		
		}
		
	}

}
