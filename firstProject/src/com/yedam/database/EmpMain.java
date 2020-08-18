package com.yedam.database;

import java.util.*;

public class EmpMain {

	
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
//				for(Employee emp : emps) {
//					System.out.println(emp);
//				}
				for(int i=0;i<emps.length;i++) {
					if(emps[i]!=null)
						System.out.println(emps[i].toString());
				}	
			}
			else if(selectNo == 2) {
			
				System.out.print("아이디 입력 :");
				int aa = sc.nextInt();sc.nextLine();
				System.out.print("첫이름 입력 :");
				String bb = sc.nextLine();
				System.out.print("이메일 입력 :");
				String cc = sc.nextLine();
				System.out.print("입사일 ex)2020-05-06 :");
				String dd = sc.nextLine();
				System.out.print("잡아이디 입력 :");
				String ee = sc.nextLine();
				
				EmpDAO dao = new EmpDAO();

				Employee emp = new Employee();
				emp.setEmployeeId(aa);
				emp.setLastName(bb);
				emp.setEmail(cc);
				emp.setHireDate(dd);
				emp.setJobId(ee);
				
				//Employee emp = new Employee(333,"test","test","2020-05-05","IT_PROG");
			    dao.addEmployee(emp);
			}
			else if(selectNo == 3) {
				System.out.println("수정 할 사원번호를  고르시오");
				int upId=sc.nextInt();sc.nextLine();
				
				System.out.println("연봉을 수정하시오");
				int upsal=sc.nextInt();sc.nextLine();
				
				
				//Employee emp = new Employee(); 
				
				EmpDAO dao = new EmpDAO();
				dao.updateEmp(upId,upsal);
				
				
			}
			else if(selectNo == 4) {
			
				System.out.println("삭제할 ID를 입력하시오");
				int deleteId=sc.nextInt();sc.nextLine();
				
				EmpDAO dao = new EmpDAO();
				dao.removeEmp(deleteId);
				
				
				
			}
			else if(selectNo == 9) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료!!!~~");
		
	}

}
