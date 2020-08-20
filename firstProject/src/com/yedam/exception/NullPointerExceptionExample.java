package com.yedam.exception;

import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String str = null;
		
		try {
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("null 값 참조중");
			//System.out.println(e);
		}catch(Exception e1) {
			System.out.println("알수없다");
		}
		
		int intAry[] = new int[5];
		for(int i=0;i<=5;i++) {
			try {
			System.out.println(intAry[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열을 초과함");
				System.out.println();
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		try {
			int menu = sc.nextInt();

		}catch(Exception e) {
			System.out.println("숫자를 정확하게 입력하시오");
		}
		
		
		
		
		System.out.println("정상 종료.");
	}

}
