package com.yedam.classes;

import java.util.Scanner;

public class AddressExample {

	public static void main(String[] args) {
		
		
		Address ad1 = new Address();
		Address ad2 = new Address();
		Address ad3 = new Address();
		Address ad4 = new Address();
		Address ad5 = new Address();

			
		Scanner sc = new Scanner(System.in);

		
		Address adArry[] = {ad1,ad2,ad3,ad4,ad5} ;
		int maxcount = 0;
		
	
		int mode=0;
		
		while(true) {
			System.out.println("모드 선택:");
			mode=sc.nextInt();sc.nextLine();
			
			
			if(mode ==1) {
				
				System.out.println("<<<정보입력>>>");
				
				System.out.print("나이:");
				adArry[maxcount].setAge(sc.nextInt());sc.nextLine();
				
				
				System.out.print("전화번호:");
				adArry[maxcount].setNumber(sc.nextLine());

				
				System.out.print("이름:");
				adArry[maxcount].setName(sc.nextLine());
				
				maxcount++;
				
				continue;
			}
			else if(mode==2) {
				System.out.println("리스트");
				for(int i=0; i<adArry.length;i++) {
					System.out.println((i+1)+"번째 학생 정보");
					System.out.println("이름:" + adArry[i].getName() +"나이:" + adArry[i].getAge() +"전화번호:" + adArry[i].getNumber() );
				}
				
			}
			else if(mode==3) {
				System.out.println("원하는 이름을 조회하시오");
				String searchName = sc.next();
				for(int i=0;i<adArry.length;i++) {
					if(adArry[i].getAge()!=0 &&  adArry[i].getName().equals(searchName)) {
						System.out.println("이름:" + adArry[i].getName() +"나이:" + adArry[i].getAge() +"전화번호:" + adArry[i].getNumber() );
						
					}
				}
				
			}
			else if(mode==4) {
			
				System.out.println("수정을 원하는 이름을 조회하시오");
				String searchName = sc.next();
				for(int i=0;i<adArry.length;i++) {
					if(adArry[i].getAge()!=0 &&  adArry[i].getName().equals(searchName)) {
						System.out.println("<<<수정정보입력>>>");
						
						System.out.print("나이:");
						adArry[i].setAge(sc.nextInt());sc.nextLine();
						
						
						System.out.print("전화번호:");
						adArry[i].setNumber(sc.nextLine());

						
						System.out.print("이름:");
						adArry[i].setName(sc.nextLine());
						
						
						
						
					}
				}
				
			}
			else if(mode==9) {
				System.out.println("종료");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		

	}

	

}
