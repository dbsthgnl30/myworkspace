package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDAO {
	private final String DRIVERNAME = "";
	
	
	//update
	public void update (TestDAO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE TABLE_member SET name =?, age = ? WHERE id = ?";
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(parameterIndex, dto.);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//select
	public void select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	
	//insert
	public void insert(MemberDTO dto) {
		//1
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into TBL_member(id,name,age) values(?,?,?)";
		
		try {
			//3
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection success");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("connection fail");
			e.printStackTrace();
		} finally {
			//2
			try {
				if(pstmt != null) pstmt.close();
				
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
