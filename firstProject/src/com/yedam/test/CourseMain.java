package com.yedam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CourseMain {
	static List<Student> stList = new ArrayList<>();
	static List<Course> list = new ArrayList<>();
	static Course java = new Course("자바",5);
	public static void showCourseInfo(List<Student> stlist) {

		for(Student st:stlist) {
			System.out.println(st);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("1.자바과정 정보보기   2.오라클과정 정보보기");
		
		List<Student> javalist = new ArrayList<>();
		
		Course java = new Course("오라클",5);
		javalist.add(new Student("이광호",20,"A+"));
		javalist.add(new Student("김다희",19,"A+"));
		javalist.add(new Student("김도은",18,"A+"));
		javalist.add(new Student("큐티섹시영래",28,"C+"));
		
		
		Course oracle = new Course("오라클",5);	
		List<Student> oraclelist = new ArrayList<>();
		oraclelist.add(new Student("최형준",25,"AAA"));	
		oraclelist.add(new Student("김다은",29,"B+"));	
		oraclelist.add(new Student("박선영",26,"A+"));	

		
		System.out.println("자바 학생정보 출력");
		showCourseInfo(javalist);
		
		
		
		
		System.out.println("오라클 학생정보 출력");
		showCourseInfo(oraclelist);
		
		
		
		
		
	
		
		
	}//end of main
}
