package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // 월: 0~11
//		System.out.println(cal.get(Calendar.DATE));
//		
//		
		Calendar cal = Calendar.getInstance(); //2020-8-19
		cal.set(2020,7,1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // 월: 0~11
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DATE));
		
		createCalendar(2020,8);
	}
	
	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance(); //2020-8-19
		
		int count = 1;
		System.out.println("일   월    화    수    목    금    토  ");
		for (int i = 1; i <= 31; i++) {
			if (count <= 31) {
				if (count % 7 == 0) {
					System.out.printf("%3d", count);
					System.out.println(" ");
					count++;

				}
				System.out.printf("%3d", count++);

			}

//		for(int j=0;j <=7;j++) {
//			if(j<cal.get(Calendar.DAY_OF_WEEK)) {
//				
//				System.out.println(" ");
//		
//		}
//
//		}
			
			
			
		}

	}

}
