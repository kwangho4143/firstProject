package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> stlist = new ArrayList<Student>();

		for(int i=0;i<3;i++) {
			
			System.out.println("학생이름, 수학점수 , 영어점수를 차례로 입력하시오");
			String nn = sc.nextLine();
			int mm = sc.nextInt();sc.nextLine();
			int ee = sc.nextInt();sc.nextLine();
			
			
			stlist.add(new Student(nn,mm,ee));
		}
		double mathavg = 0;
		double enavg = 0;
		System.out.println("수학 평균 , 영어 평균 은 무엇인가요?");
		for(int j=0;j<stlist.size();j++) {
			mathavg = stlist.get(j).getMathScore()+mathavg;
			enavg = stlist.get(j).getEngScore()+enavg;
		}
		mathavg = mathavg/3;
		enavg = enavg/3;
		System.out.println("수학점수:"+ mathavg +"영어점수"+enavg);
		
		
		
		int b;
		for(int i = 0 ; i <  stlist.size() -1 ; i ++) {
			for(int j = i+1 ; j < stlist.size() ; j ++) {
				if(stlist.get(i).getMathScore()> stlist.get(j).getMathScore()) {
					b = stlist.get(j).getMathScore();
					stlist.get(j).setMathScore(stlist.get(i).getMathScore());
					stlist.get(i).setMathScore(b);
				}
			}
		}
		
		System.out.println("최고점수: "+ stlist.get(2).getMathScore()+"이름 :"+stlist.get(2).getName() );

		
		
		
		
	
		
		
		

	}

}
