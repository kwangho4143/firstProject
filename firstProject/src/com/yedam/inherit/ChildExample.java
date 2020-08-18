package com.yedam.inherit;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child("홍길동",15,10);
		child.getName(); //부모꺼를 받았기 때문에 사용 가능
		child.getAge();//부모꺼를 받았기 때문에 사용 가능
		child.getGrade();//자신의 getGrade()
		
		Parent parent = new Child("김유신",20,20);
		parent.getName();
		parent.getAge();
		//parent.getGrade(); 자식꺼는 사용x
		Child c1 = (Child)parent;
		c1.getGrade();
		
		Vehicle v1 = new Taxi();
		v1.run();//오버라이딩중
		v1 = new Bus();
		v1.run();//오버라이딩중

		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
