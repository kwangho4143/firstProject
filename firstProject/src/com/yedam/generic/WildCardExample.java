package com.yedam.generic;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) { //Student의 자식 클래스 들만(student를 상속받는)
		//Course<Student>,Course<HighStudent>
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) { //worker를 포함한 상위클래스만
		//Course<Worker>,Course<Person>
	}
	
	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정",5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고딩1"));

		
		
		Course<Worker> crsWorker = new Course<>("직장인과정",5);
		//crsWorker.add(new Person("일반인"));
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생과정",5);
		crsPerson.add(new Student("학생2"));
		crsPerson.add(new HighStudent("고딩2"));
		
				
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정",5);
		crsPerson.add(new HighStudent("고딩1"));

		
		
		
		
		
		//일반인 등록가능  모든 클래스....
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		
		//직장인등록가능
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
		
		
		//학생등록가능
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		
		//고등등록가능
		registerCourseHighStudent(crsHighStudent);
		
		
		
		
	}

	private static void registerCourseHighStudent(Course<HighStudent> crsHighStudent) {
		// TODO Auto-generated method stub
		
	}

}
