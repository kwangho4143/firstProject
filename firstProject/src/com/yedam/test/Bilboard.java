package com.yedam.test;

public class Bilboard {
	private int num;
	private String content;
	private String title;
	private String user;
	private String date;
	public int getNum() {
		return num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public Bilboard(int num, String content, String title, String user, String date) {
		super();
		this.num = num;
		this.content = content;
		this.title = title;
		this.user = user;
		this.date = date;
	}
	public Bilboard() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "num=" + num + ", title=" + title + ", content= "+content+", user=" + user + ", date="
				+ date + "";
	}


	
}
