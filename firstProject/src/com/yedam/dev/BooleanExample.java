package com.yedam.dev;

public class BooleanExample {

	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;

		boolean trueOrFalse=false; //if문 안의 조건에 사용가능
		
		trueOrFalse = l1 == i1;
		if(trueOrFalse) {
			System.out.println("내용이 참일때 출력된다");
		}
		else
			System.out.println("내용이 거짓일때 출력된다");
		
		if(l1 == i1) {
			System.out.println("l1,i1 두개의 값이 같습니다.");
		}
		
		
		System.out.println(trueOrFalse);
		
	}

}
