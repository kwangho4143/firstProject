package com.yedam.interfaces;

public class MySqlDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB 입력:");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

		System.out.println("Mysql DB 수정:");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("Mysql DB 조회:");		
	}

}
