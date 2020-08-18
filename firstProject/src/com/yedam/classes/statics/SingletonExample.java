package com.yedam.classes.statics;

import com.yedam.classes.Student;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		if(s1 == s2) { //클래스면 주소값으로 	비교 => 원래는 다르지만 static으로 만들게 되면 같은 주소값을 가진다. 이유: 많은 인스턴스를 만들지 않고 메모리효율을 올리기 위해서
			System.out.println("같은 주소값을 가진다");
		}
	}

}
