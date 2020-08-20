package com.yedam.database;

//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;


public class EmpDAO {

	public void removeEmp(int deid) {
		
		Connection conn = DBConnection.getConnection();

		String sql = "delete from emp_temp where employee_id="+deid;
		
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}
	
public void updateEmp(Employee emp) {
		
		Connection conn = DBConnection.getConnection();
		
		String sql = "update emp_temp set salary ="+emp.getSalary() +"where employee_id = "+ emp.getEmployeeId();
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}

	public void addEmployee(Employee emp) {
		
		Connection conn = DBConnection.getConnection();
//
//		insert into emp_temp(employee_id,last_name,email,hire_date,job_id)
//		values(301,'test','test','2020-05-05','IT_PROG')
		
		String sql = "insert into emp_temp(employee_id,last_name,email,hire_date,job_id)"
		+ "values("+emp.getEmployeeId()+",\'"+emp.getLastName()+"\',\'"+emp.getEmail()+"\',\'"+emp.getHireDate()+"\',\'"+emp.getJobId() + "\')";
		
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}

	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);//위 아래 동작은 같다
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
						
				employees[idx++] = emp;
			}
			System.out.println("--end of data--");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
