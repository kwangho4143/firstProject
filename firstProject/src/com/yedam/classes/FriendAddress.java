package com.yedam.classes;

import java.util.Scanner;


public class FriendAddress {
	static Scanner sc = new Scanner(System.in);
	static Friend[] friends = new Friend[100];
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.학교친구 2.회사친구 3.친구 4.리스트 9.종료");
			System.out.println("-------------------------");
			System.out.println("선택>");
			int selectNo = sc.nextInt();sc.nextLine();
			if(selectNo==1) {
				addUnivFriend();
			}
			else if(selectNo==2){
				addComFriend();
			}
			else if(selectNo==3){
				addFriend();
			}
			else if(selectNo==4){
				friendList();
			}
			else if(selectNo==9){
				break;
			}
			
			
		}
		System.out.println("프로그램 종료.");
		
		
	}
	//학교친구등록 메소스
	public static void addUnivFriend() {
		System.out.println("학교친구등록.");
		System.out.println("이름입력: ");
		String name = sc.nextLine();
		System.out.println("전화입력: ");
		String phone = sc.nextLine();
		System.out.println("전공입력: ");
		String major = sc.nextLine();
		
		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);
		
		
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료.");
		
		
	}
	//회사친구등록 메소스
	public static void addComFriend() {
		System.out.println("회사친구등록.");
		System.out.println("이름입력: ");
		String name = sc.nextLine();
		System.out.println("전화입력: ");
		String phone = sc.nextLine();
		System.out.println("회사입력: ");
		String major = sc.nextLine();
		
		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setComName(major);
		
		
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료.");
	}	
	
	
	
	
	public static void addFriend() {
		System.out.println("그외친구등록.");
		System.out.println("이름입력: ");
		String name = sc.nextLine();
		System.out.println("전화입력: ");
		String phone = sc.nextLine();

		
		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setPhone(phone);
		
		
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료.");
		
	}
	
	public static void friendList() {
		for(int i=0;i<friends.length;i++) {
			if(friends[i] !=null)
			System.out.println(friends[i].toString());
		}
//		for(Friend friend : friends) {
//			System.out.println(friend.toString());
//		}
//		
		
		
		

		
	}
	
	
	
	
	
	
	
	
}
