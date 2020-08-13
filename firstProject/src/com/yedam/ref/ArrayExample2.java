package com.yedam.ref;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] arry = {1,2,3};
		addAry(arry);
		System.out.println(arry[1]);
		

	}

	public static int[] addAry(int[] ary) {
		int sum[] = new int[2];
		for(int i =0;i<ary.length;i++) {
			sum[i] = ary[i]*2;
			
		}
		return sum;
		
		
	}
	
	
}
