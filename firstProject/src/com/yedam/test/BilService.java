package com.yedam.test;


public interface BilService {
	public Bilboard[] showList();
	public void addBil(Bilboard bil);
	public void modBil(Bilboard bil);
	public void delBil(int delId);
}
