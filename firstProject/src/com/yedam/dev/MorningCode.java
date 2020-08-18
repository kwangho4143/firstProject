package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {
		
		int[][] iAry = new int[5][5];
		int num1 = 1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				iAry[j][i] = num1++;
			}
			System.out.println("");
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%3d",  iAry[i][j]);
			}		
			System.out.println("");
		}
	}
	
}
