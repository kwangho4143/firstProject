package com.yedam.cond;

public class WhileExample {

	public static void main(String[] args) {
		
		
		int i=2;
		int j=1;
		
		while (i<10) {
			while (j<10) {
				System.out.println(i+"X"+j +"="+ i*j );
				j++;
				if(j==10) {
					j=1;
					break;
				}
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		/*
		
		int i = 0;
		int sum =0;
		while(i<10) {
			i++;
			sum+=i;
		
				
		}

		
		System.out.println("1 ~ " + i +  "까지의 합: " + sum);
		
		*/
	}

}
