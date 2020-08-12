package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if (v1 ==v2) {
			System.out.println("기본타입 일 경우 비교..");
		}
		
		String str1 = "Hello"; //같은 주소값을 참조한다
		String str2 = "Hello"; //
		String str3 = new String ("Hello");//주소값이 다르다
		
		if(str1==str2) {
			System.out.println("str1,str2은 같은 문자입니다.");
		}

		if(str1.equals(str3)) { //내용을 비교하는 함수
			System.out.println("str1,str3은 같은 문자입니다.");
		}
		
		System.out.println( (1==1)&&(2 ==3 ));
		
		
	}

}
