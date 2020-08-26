package com.yedam.lambda;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int ansArray[] = new int[3];

		for (int i = 0; i < ansArray.length; i++) {
			ansArray[i] = (int) ((Math.random() * 9) + 1);
			System.out.println(ansArray[i]);
			for (int j = 0; j < i; j++) {
				if (ansArray[i] == ansArray[j]) {
					i--;
					
				}
			}

		}

		Scanner sc = new Scanner(System.in);

		int sC = 0;
		int bC = 0;

		System.out.println(ansArray[0] + "," + ansArray[1] + "," + ansArray[2]);

		System.out.println("숫자 3개를 입력하시오");
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int checkArray[] = { aa, bb, cc };
		System.out.println("입력한 값: " + aa + "," + bb + "," + cc);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((ansArray[i] == checkArray[j]) && (i == j)) {
					sC++;
				} else if (ansArray[i] == checkArray[j] && (i != j)) {
					bC++;
					
				}
			}
		}

		System.out.println(sC + "스트라이크" + "/" + bC + "볼");

	}

}
