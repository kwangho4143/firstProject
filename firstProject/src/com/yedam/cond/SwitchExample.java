package com.yedam.cond;

public class SwitchExample {

	public static void main(String[] args) {
		int m = (int) (Math.random() * 5 )+1 ;
		
		System.out.println(m);
		
		
		
		switch(m) {
		
		case 1:
			System.out.println("1이 나왔다");
			break;
		case 2:
			System.out.println("2이 나왔다");
			break;
		case 3:
			System.out.println("3이 나왔다");
			break;
		case 4:
			System.out.println("4이 나왔다");
			break;
		case 5:
			System.out.println("5이 나왔다");
			break;
		
		}
	}

}
