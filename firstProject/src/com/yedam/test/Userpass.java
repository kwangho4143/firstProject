package com.yedam.test;

public class Userpass<T , K> {
	private T conid;
	private K conpw;
	
	
	public T getConid() {
		return conid;
	}
	public void setConid(T conid) {
		this.conid = conid;
	}
	public K getConpw() {
		return conpw;
	}
	public void setConpw(K conpw) {
		this.conpw = conpw;
	}
	public Userpass(T conid, K conpw) {
		super();
		this.conid = conid;
		this.conpw = conpw;
	}
	
	
}
