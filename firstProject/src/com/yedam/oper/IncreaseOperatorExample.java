package com.yedam.oper;

public class IncreaseOperatorExample {

	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;
		
		//var1=var1+1;
		
		for(int i = 0; i < 3 ;i++) { 
		run = !run;
		if(run) {	
			var1++;
					//1: ok
			        //2: 실행x
		            //3: ok                
		}
		System.out.println(var1);
		
	}
		
  }
}


