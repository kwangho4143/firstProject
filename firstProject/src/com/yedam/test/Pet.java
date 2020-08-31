package com.yedam.test;

public class Pet {
	String petName;
	int petname;
	String petS;
	public Pet(String petName, int petname2, String petS) {
		super();
		this.petName = petName;
		petname = petname2;
		this.petS = petS;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetname() {
		return petname;
	}
	public void setPetname(int petname) {
		this.petname = petname;
	}
	public String getPetS() {
		return petS;
	}
	public void setPetS(String petS) {
		this.petS = petS;
	}
	public Pet() {
		
	}
	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", petname=" + petname + ", petS=" + petS + "]";
	}
	
	
}
