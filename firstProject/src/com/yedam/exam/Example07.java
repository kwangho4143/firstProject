package com.yedam.exam;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;

		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("현재 잔고 : "+balance);
			System.out.println("----------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			
			
			
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("입금할 금액을 넣으시오:");
				int input=0;
				input = sc.nextInt();
				balance = balance+ input;
			}
			else if(menu==2) {
				System.out.println("출금할 금액을 넣으시오:");
				int output=0;
				output = sc.nextInt();
				balance = balance - output;
				if(balance < output) {
					System.out.println("잔액이부족합니다");
					balance = balance + output;
					continue;
				}
			}
			else if(menu == 3)
				System.out.println("잔고:"+ balance);
			
			
			else {
				System.out.println("종료합니다");
				run = false;
			}
			
			
			
			
			
		}

	}

}
