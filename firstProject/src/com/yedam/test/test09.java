package com.yedam.test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
	/*
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("결과 ");
		
		if(a>b) {
			if(b>c) {
				System.out.println(a + "," + b + "," + c);
			}
			else
				System.out.println(a + "," + c + "," + b);
			
		}
		else if(a>c) {
			if(c>b) {
				System.out.println(a + "," + c + "," + b);
			}
			else
				System.out.println(a + "," + b + "," + c);
			
		}
		else if(b>a) {
			if(a>c) {
				System.out.println(b + "," + a + "," + c);
			}
			else
				System.out.println(b + "," + c + "," + a);
			
		}
		else if(b>c) {
			if(c>a) {
				System.out.println(b + "," + c + "," + a);
			}
			else
				System.out.println(b + "," + a + "," + c);	
		}
		else if(c>a) {
			if(a>b) {
				System.out.println(c + "," + a + "," + b);
			}
			else
				System.out.println(c + "," + b + "," + a);	
		}
		
		
		else  {
			if(b>a) {
				System.out.println(c + "," + b + "," + a);
			}
			else
				System.out.println(c + "," + a + "," + b);	
		}
		
		
		*/
		Scanner sc = new Scanner(System.in);
		
		int fir= sc.nextInt();
		int se= sc.nextInt();
		int th= sc.nextInt();
		
		int[] a = {fir,se,th};
		
		System.out.println("결과 ");
		
		int b;
		for(int i = 0 ; i <  a.length ; i ++) {
			for(int j = i+1 ; j < a.length; j ++) {
				if(a[i] > a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		for(int i = 0 ; i <  a.length ; i ++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
			
			
			
		
		

}


