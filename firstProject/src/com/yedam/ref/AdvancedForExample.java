package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

     
      int[] scores = new int[5]; 
      
      
      for (int i=0; i<scores.length; i++) {
         System.out.println("점수를 입력하세요.");
         scores[i] = scn.nextInt();
      }

      int sum = 0;
      double avg = 0;
      int maxVal = 0;
      
      for (int num : scores) {
         sum += num;
      }
      avg = (double) sum / scores.length;
      System.out.println(sum + "," + avg);
   
   
      int b;
	  for(int i = 0 ; i <  scores.length-1 ; i ++) {
		for(int j = i+1 ; j < scores.length; j ++) {
			if(scores[i] > scores[j]) {
				b = scores[j];
				scores[j] = scores[i];
				scores[i] = b;
			}
		 }
	   }
		maxVal = scores[4];
		System.out.println("최댓값:" + maxVal);
   
   
   
   }

}