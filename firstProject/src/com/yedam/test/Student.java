package com.yedam.test;

public class Student {
	String stName;
	int stAge;
	String stGrade;
	
	public Student(String stName, int stAge, String stGrade) {
		super();
		this.stName = stName;
		this.stAge = stAge;
		this.stGrade = stGrade;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStAge() {
		return stAge;
	}
	public void setStAge(int stAge) {
		this.stAge = stAge;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stAge=" + stAge + ", stGrade=" + stGrade + "]";
	}

	
}
