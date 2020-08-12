package com.yedam.oper;

public class InfinityExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x % y; //NaN: 의미가 없는 값 ,Infinity: 무한대
		if(Double.isInfinite(z) || Double.isNaN(z)) {              //값에 문제가 있는지를 확인
			System.out.println("의미없는 값입니다.");
		}
		else {
			System.out.println(z);
		}
		
		
		
	}

}
