package com.yedam.test;

public class Fruit {
	String fruitName;
	int price;
	public Fruit(String fruitName, int price) {
		super();
		this.fruitName = fruitName;
		this.price = price;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruit() {
	
	}
	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", price=" + price + "]";
	}
	
}
