package com.yedam.generic;

public class Container<T , K > {
	private T Value;
	private K Key;
	

	public T getValue() {
		return Value;
	}
	public void setValue(T value) {
		this.Value = value;
	}
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}

	public void set(T value, K key) {
		this.Value = value;
		this.Key= key; 
		
	}
	
	
}
