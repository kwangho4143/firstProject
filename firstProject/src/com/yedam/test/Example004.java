package com.yedam.test;
import java.util.HashSet;
import java.util.Random;


public class Example004 {

	public static void main(String[] args) {
//		int[] checkAry = {0,1,2,3,4,5,6};
//		int[] RandomAry = {0,0,0,0,0,0};
//		int randomNum=0;
//		int dValue=(int)(Math.random()*6)+1;
//		int count =0;
//		
//		for(int i=0;i<checkAry.length;i++) {
//			RandomAry[i]=(int)(Math.random()*6)+1;
//
//			for(int j=0;j<6;j++) {
//				if(RandomAry[i]==checkAry[j]) {
//					System.out.println(RandomAry[i]);
//					RandomAry[i]=123;
//				}
//				
//			
//			
//			
//			
//				
//			}
//			
//		}
//
//		
		for(Integer it : set) {
	         System.out.println(it);
	      
	      Set<Person> pSet = new HashSet<>();
	      pSet.add(new Person("Hong",20));
	      pSet.add(new Person("Hong",20));
	      pSet.add(new Person("Hong",20));

	      for(Person p : pSet) {
	         System.out.println(p.name + "," + p.age +","+ p.toString());
	      }
	   }
	}
		
		
		
	
