package com.yedam.classes;

public class StuduentExample {

	public static void main(String[] args) {
		Student st1 = new Student(111,"홍길동","역사학과");
		Student st2 = new Student(121,"홍a길동","역사학과");
		Student st3 = new Student(141,"홍d길동","역사학과");
		Student st4 = new Student(151,"홍d길동","승마학과");
		Student st5 = new Student(161,"홍s길동","역사학과");
		Student st6 = new Student(171,"홍s길동","승마학과");
		
		Student st7 = new Student(222,"김s유신","승마학과");
		

		st1.setId();
		
		Student std[] = {st1,st2,st3,st4,st5,st6,st7};
		
		
//		for(int i=0;i<std.length;i++) {
//			System.out.println("학번:"+ std[i].id+"이름:"+std[i].name+"전공:"+std[i].major);
//			System.out.println(std[i]);	
//		}
		
		for(int k=0;k<std.length;k++) {
			if(std[k].major=="역사학과") {
				
				System.out.println(std[k]);
				
				
			}
		}
		
		
		
		
		
	}

}
