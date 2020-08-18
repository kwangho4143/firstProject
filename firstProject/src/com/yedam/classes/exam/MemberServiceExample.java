package com.yedam.classes.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		//db역활
		Member members[] = new Member[3];
		members[0] = new Member("홍길동","hong");
		members[0].setPassword("hong123");
	    members[1] = new Member("김유신","kim");
	    members[1].setPassword("kim123");		
	    members[2] = new Member("이광호","Lee");
	    members[2].setPassword("lee123");		
		
		
		
		//로그인 할 정보 
		Member mem1 = new Member("홍길동","hong");
		mem1.setPassword("hong123");
		
		MemberService mService = new MemberService(); //MemberSerivce가 배열에 접근할 방법이 없어서 매개변수 사용
		boolean result = mService.login(mem1.getId(),mem1.getPassword(),members);
		
		if(result) {
			System.out.println(mem1.getName()+"님 로그인됨");
		}
		else
			System.out.println("id나 password 확인해라");

		
			
			
	}

}
