package com.yedam.exam;

public class Exercise04 {

	public static void main(String[] args) {
	
		while(true) {
			System.out.println("주사기를 던지시오");
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			if((a==1 && b == 4) || (a==4 && b ==1) || (a==2 && b ==3) || (a==3 && b ==2)) {
				System.out.println("나온 주사기 " + a +","+ b);
				break;
			}
			else 
				System.out.println("다시");
				
			
			
			
			
			
			
			
			
		}
		

	}

}
