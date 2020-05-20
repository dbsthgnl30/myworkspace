package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class RsvDAO {
	private final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USERNAME = "CA2";
	private final String PASSWORD = "ca2";
	
	public  RsvDAO() {  
		try {
			Class.forName(DRIVERNAME);
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading fail");
			e.printStackTrace();
		}
	}
	
	// 영화선택  
	public void pick(MovieDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		String sql1 = "select * from movie";
		String sql2 = "select * from theater";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connection success");
			//1. 영화선택: 영화 목록을 db에서 받아와서(select) arraylist에 추가하기  
			pstmt1 = conn.prepareStatement(sql1);
			List<MovieDTO> movieList = new ArrayList<MovieDTO>();
			movieList.add(dto);
			pstmt1.executeUpdate();   
			System.out.println("영화를 선택하시오");
			for(int i = 0; i < movieList.size(); i ++) {
				System.out.println(++i  + "번 영화:" + movieList );  // 신세계~ 타짜 이런것 설명 나오게. 
			}
			
			//영화관을 선택하시오: 영화관 목록을 db에서 받아와서(select) arraylist에 추가하기  
			pstmt2 = conn.prepareStatement(sql2);
			List<TheaterDTO> theaterList = new ArrayList<TheaterDTO>();
			
			
			
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt2 != null) {
					pstmt2.close();
				}
				if (pstmt1 != null) {
					pstmt1.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
}
