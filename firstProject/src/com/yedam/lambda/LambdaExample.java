package com.yedam.lambda;

//함수적 인터페이스
interface MyFunctionalInterface {
	public void run();// 추상메소드

}

class MyFuncClass implements MyFunctionalInterface {// 인터페이스를 구현하는 클래스

	@Override
	public void run() {
		System.out.println("runnnn.");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf =  () -> {
			System.out.println("runn.");
		};
		myintf.run();
		
		ShowContent sc =  (content) -> {System.out.println("내용은"+ content + "입니다");};
		sc.show("바나나");
		
//		ShowContent s2 = (content) -> {System.out.println("this is"+ content );}; //this is 바나나.
//		sc.show("바나나");
		ShowContent s2 =(content) -> {System.out.println("this is" + content);

		};
		s2.show("바나나");
		
		Calculate cal = (a, b)-> a+b;
		cal.sum(4, 6);
		
	}

}

