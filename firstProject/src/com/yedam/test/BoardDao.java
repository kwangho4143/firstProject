package com.yedam.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BoardDao {
public void removeBil(int deid) {
		
		Connection conn = DateBaseConn.getConnection();

		String sql = "delete from BIL_TABLE where bil_id="+deid;
		
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}
	
public void updateBil(Bilboard bil) {
		
		Connection conn = DateBaseConn.getConnection();
		
		String sql = "update emp_temp set main_content ="+bil.getContent() +"where bil_id = "+ bil.getNum();
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}

	public void addBilboard(Bilboard bil) {
		
		Connection conn = DateBaseConn.getConnection();
//
//		String sql = "insert into Bil_table(bil_id,title,main_content,userd,input_date)"
//		+ "values("+bil.getNum()+"\',+bil.getContent()+"\',\'"+bil.getUser()+"\',sysdate)";
//		
		String sql = "insert into Bil_table(bil_id,title,main_content,userd,input_date)"
				+ "values("+bil.getNum()+",\'"+bil.getTitle()+"\',\'"+bil.getContent()+"\',\'"+bil.getUser()+"\',sysdate)";
				
		
		
	//	"+emp.getEmployeeId()+",\'"+emp.getLastName()+"\',\'"+emp.getEmail()+"\',\'"+emp.getHireDate()+"\',\'"+emp.getJobId() + "\'
		
		
		System.out.println(sql);
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}

	public Bilboard[] getBilList() {
		Connection conn = DateBaseConn.getConnection();
		Bilboard[] bils = new Bilboard[100];
		try {
			String sql = "select * from BIL_TABLE";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Bilboard bil = new Bilboard();
				bil.setNum(rs.getInt("bil_id"));
				bil.setTitle(rs.getString("title"));
				bil.setContent(rs.getString("main_content"));
				bil.setUser(rs.getString("userd"));
				bil.setDate(rs.getString("input_date"));
				
				bils[idx++] = bil;
			}
			System.out.println("--end of data--");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bils;
	}
}
