package com.yedam.test;

public class exam7 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		   
	      int b;
		  for(int i = 0 ; i <  array.length-1 ; i ++) {
			for(int j = i+1 ; j < array.length; j ++) {
				if(array[i] > array[j]) {
					b = array[j];
					array[j] = array[i];
					array[i] = b;
				}
			 }
		   }
			max = array[array.length-1];
			System.out.println("최댓값:" + max);
	   
		
		System.out.println("max:" + max);

	}

}
