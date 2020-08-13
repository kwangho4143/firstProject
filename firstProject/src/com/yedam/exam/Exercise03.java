package com.yedam.exam;

public class Exercise03 {

	public static void main(String[] args) {
		int total=0;
		for(int count =1;count<100;count++) {
			if(count%3==0 ) {
				total = total +  count;
				System.out.println(count);
			}
		}
		System.out.println("총 값:"+ total);

	}

}
