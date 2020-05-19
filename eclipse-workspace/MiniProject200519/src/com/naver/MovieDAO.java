package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MovieDAO {
private final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USERNAME = "CA2";
	private final String PASSWORD = "ca2";
	
	public MovieDAO() {  //마름모 완성
		try {
			Class.forName(DRIVERNAME);
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading fail");
			e.printStackTrace();
		}
	}
	
	
	
	public void rsv(MovieDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select title from movie";
		String sql2 = "select  from movie"
		
		for()
		
	}
	
	
	public void insert(MovieDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into customer (id,pwd) values (?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
		
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
}
