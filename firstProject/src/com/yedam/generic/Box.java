package com.yedam.generic;

public class Box<T> {
		private T obj;//Object 타입은 모든 타입을 다 받을수 있는 최상위 자료형
		public void set(T obj) {
			this.obj = obj;
		}
		public T get() {
			return this.obj;
		}
}
