package com.yedam.cond;

public class IfExample {

	public static void main(String[] args) {
		int score = 80;
		String grade = "";//NUll과 같다

		if(score >= 90)
		{
			grade = "A";
		}
		else if(score >=80)
		{
			if(score >=85)
				grade = "B+";
			else
				grade = "B";	
		}
		else if(score >=70)
		{
			if(score >=70)
			grade = "C";	
		}
		else 
			grade = "D";
		
		System.out.println("등급은"+grade+"입니다");
		
	}

}
