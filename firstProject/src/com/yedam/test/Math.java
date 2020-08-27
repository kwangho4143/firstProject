package com.yedam.test;



public class Math {

	public static class Math1{
		public static double min11(double a,double b) {
			//double result = (a > b) ? b : a;
			return (a > b) ? b : a;	
		}
	}
	public static double min(double a,double b) {
		//double result = (a > b) ? b : a;
		return (a > b) ? b : a;	
	}
	public static int min(int a,int b) {
		int result = (a > b) ? b : a;
		return result;	
	}


	public static void main(String[] args) {
		
		double result = Math.min(39, 25);
		System.out.printf("작은수 수는 : "+result);
		result = Math.min(24.6, 3.8);
		System.out.println("작은수 수는 : "+result);
		result = Math1.min11(13.5,46.4);
		System.out.println("작은수 수는 : "+result);
	}
}
