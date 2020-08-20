package com.yedam.classes;

final class FinalClass{
	
	
	
}
class ExtendClass extends FinalClass{
	
	
}





public class MainEx {

	final int age = 10;//고정시킴 final은
	public static void main(String[] args) {
		Friend fr  = new Friend();
		fr.getAge();
		
		Calculator.add(10,10); //static을 사용하여 정적메소드로 만듬
		
		final int val = 10;
		//val = 20;
		
		MainEx ex = new MainEx();
		//ex.age = 20;
		
		
		
		
		
		
		
		
	}
}
