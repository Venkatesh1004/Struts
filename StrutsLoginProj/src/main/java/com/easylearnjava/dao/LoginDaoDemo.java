package com.easylearnjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.easylearnjava.util.DBConnection;



public class LoginDaoDemo {

	public String getPassword(String uname){
		Connection conn = null;
        String password = null;
		String confirmpassword = null;

		try {
			DBConnection dbconn = new DBConnection();
			conn = dbconn.getDatabaseConnection();
			PreparedStatement pstmt = conn.prepareStatement("select * from usercredentials where username=?");
			pstmt.setString(1, uname);
		
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				password = rs.getString("password");
				confirmpassword = rs.getString("confirmpassword");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return confirmpassword ;
		
		

	}
}
