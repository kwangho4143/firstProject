package com.yedam.interfaces;

public class OracleDb implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB 입력:");
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 수정:");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB 조회:");
		
	}

}
