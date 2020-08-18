package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("----------------------");
			System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.종료");
			System.out.println("----------------------");
			System.out.println("선택>");

			int selectNo = sc.nextInt();sc.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {

		System.out.println("계좌번호");
		String ano = sc.nextLine();
		System.out.println("계좌주");
		String owner = sc.nextLine();
		System.out.println("초기입금액");
		int balance = sc.nextInt();sc.nextLine();

		System.out.println("결과 : 계좌를 생성하였습니다");
		Account f = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = f;
				break;

			}
		}

	}

	private static void accountList() {

		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());

			}
		}
	}

	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String aa = sc.nextLine();
		System.out.print("예금액 : ");
		int mm = sc.nextInt();sc.nextLine();

		Account ad = findAccount(aa);
		ad.setBalance(ad.getBalance() + mm);

	}

	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String aa = sc.next();
		System.out.print("출금액 : ");
		int mm = sc.nextInt();
		sc.nextLine();

		
		Account ad = findAccount(aa);
		if(ad.getBalance()>mm) {
			ad.setBalance(ad.getBalance() - mm);			
		}
		else
			System.out.println("출금액오류");
		
	}

	private static Account findAccount(String ano) {

		Account md = null;

		for (int i = 0; i < accountArray.length; i++) {
			if ((accountArray[i] != null) && (accountArray[i].getAno().equals(ano)))
				md = accountArray[i];
		}

		return md;

	}

}
