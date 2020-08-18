package com.yedam.classes;

public class ComFriend extends Friend{

	private String comName;
	
	public ComFriend() {
		super();	
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Override
	public String toString() {
		return "회사친구 이름: "+this.getName()+","+"연락처: "+this.getPhone()+","+"회사명: "+this.getComName();
	}



}
