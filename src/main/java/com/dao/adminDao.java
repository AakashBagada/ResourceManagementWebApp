package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.adminBean;
import com.util.dbConnection;

public class adminDao {


	public adminBean authenticate(String adminEmail, String adminPass) {
		
		Connection con=dbConnection.getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		adminBean abean=null;
		try {
		  pstm=con.prepareStatement("select * from Admin where adminEmail=? and adminPass=?");
		  pstm.setString(1, adminEmail);
		  pstm.setString(2, adminPass);
		  rs=pstm.executeQuery();
		  
		  while(rs.next()) {
			  abean=new adminBean();
			  abean.setAdminName(rs.getString("adminName"));
			  abean.setAdminEmail(rs.getString("adminEmail"));
			  abean.setAdminPass(rs.getString(rs.getString("adminPass")));
			  
		  }
		  
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return abean;
	}

}
