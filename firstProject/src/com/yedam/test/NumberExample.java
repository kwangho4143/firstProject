package com.yedam.test;

import java.util.Scanner;

public class NumberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IdefyNumber people = new IdefyNumber();
		int count=0;
		
		while(true) {
			System.out.println("주민번호를 입력하시오");
			people.setNum(sc.nextLine());
			char sex[] = new char[10];
					
			for(int i=0;i<sex.length;i++) {

				sex[i]= people.getNum().charAt(i);
				System.out.println(sex[i]);
			}
			for(int j=0;j<10;j++) {
				if((sex[j]=='1')||(sex[j]=='2')||(sex[j]=='3')||(sex[j]=='4')||(sex[j]=='5')||(sex[j]=='6')||(sex[j]=='7')||(sex[j]=='8')||(sex[j]=='9')||(sex[j]=='0')){
					count++;
					System.out.print(count);
					if(count==7) {
						break;
					}
				}
			}
			char sss = people.getNum().charAt(count);
			
			
			if((sss == '1')||(sss == '3')) {
				System.out.println("남자입니다");
			}
			else if((sss == '2')||(sss == '4')) {
				System.out.println("여자입니다");
			}
			else
				System.out.println("잘못된 성별입니다");
			
		}
		
	}

}
