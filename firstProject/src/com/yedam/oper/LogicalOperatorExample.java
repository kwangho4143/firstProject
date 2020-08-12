package com.yedam.oper;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; //A=65
		if(charCode >= 65 && charCode <= 90) {
			System.out.println("대문자입니다");
		}
		int num1 = 10;
		int num2 = 20;
		if(num1++ < 10 && num2++ > 20) { //뒤에값은 이미 앞에서 적용이 안되기 떄문에 반영되지 않음
			System.out.println("참입니다");
		}
		if(num1++ < 10 || num2++ > 20) { //or연산이라 둘다 반영이 된다
			System.out.println("참입니다");
		}
		
		System.out.println(num1 + "," + num2);
		
		
		int a = 10,b = 11;
		int result = a | b;
		System.out.println("논리곱결과: " + result);
		
		result = a << 2; //1010(10)을 왼쪽으로 두번 이동 -> 101000 (40)
		System.out.println(result);

		result = a >> 2; //1010(10)을 오른쪽으로 두번 이동 -> 10 (2)
		System.out.println(result);
		
		result = 80;
		boolean pass = false;
		if(result >= 80) {
			pass = true;
		
		}
		else {
			pass = false;
			
		}
		//위에와 아래는 같다
		pass = (result >= 80) ? true:false;
		
		
		
		
		
	}

}
