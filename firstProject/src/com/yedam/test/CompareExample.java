package com.yedam.test;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	
	class StudentComparator implements Comparator<Student>{
		
		@Override
		public int compare(Student a, Student b) {
			// TODO Auto-generated method stub
			return Integer.compare(a.sno,b.sno);
		}
		
	}
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		CompareExample ce = new CompareExample();
		
		int result = Objects.compare(s1, s2, ce.new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, ce.new StudentComparator());
		System.out.println(result);
		boolean result1 = Objects.equals(s1, s2);
		System.out.println(result1);
	}//end of min
	
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	
	
}
