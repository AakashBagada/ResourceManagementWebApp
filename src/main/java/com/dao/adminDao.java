package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.HrBean;
import com.bean.adminBean;
import com.util.dbConnection;

public class adminDao {

	public adminBean authenticate(String adminEmail, String adminPass) {

		Connection con = dbConnection.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		adminBean abean = null;
		try {
			pstm = con.prepareStatement("select * from Admin where adminEmail=? and adminPass=?");
			pstm.setString(1, adminEmail);
			pstm.setString(2, adminPass);
			rs = pstm.executeQuery();

		   if(rs.next()) {
				abean = new adminBean();
				abean.setAdminName(rs.getString("adminName"));
				abean.setAdminEmail(rs.getString("adminEmail"));
				abean.setAdminPass(rs.getString("adminPass"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		return abean;
	}

	public void addHr(HrBean Hbean) {
		Connection con=null;
		
        
		try {
			//store into database 
			con =dbConnection.getConnection();
			

			//sql 
			//Statement
			//PreparedStatement
			//CallableStatement 
			PreparedStatement pstm = con.prepareStatement("insert into Hr(hrFirstName,hrLastName,hrEmail,hrPassword,hrGender,hrContact,hrJoinDate) values (?,?,?,?,?,?,?) ");
			pstm.setString(1,Hbean.getHrFirstName());
			pstm.setString(2, Hbean.getHrLastName());
			pstm.setString(3, Hbean.getHrEmail());
			pstm.setString(4, Hbean.getHrPassword());
			pstm.setString(5, Hbean.getHrGender());
			pstm.setString(6, Hbean.getHrContact());
			pstm.setString(7, Hbean.getHrJoinDate());
			

			pstm.executeUpdate(); //db -> 	1 -> inserted , updated , deleted 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
	}

	public ArrayList<HrBean> getHrList() {
		Connection con = null;
		ResultSet rs = null;
		HrBean user = null;
		ArrayList<HrBean> list = new ArrayList<>();
		try {
			con = dbConnection.getConnection();
			PreparedStatement pstm = con.prepareStatement("select * from Hr ");

			rs = pstm.executeQuery();

			while (rs.next()) {
				user = new HrBean();
				user.setHrId(rs.getInt("hrId"));
				user.setHrFirstName(rs.getString("hrFirstName"));
				user.setHrLastName(rs.getString("hrLastName"));
				user.setHrEmail(rs.getString("hrEmail"));
//			user.setHrPassword(rs.getString("hrPassword"));
//			user.setHrGender(rs.getString("hrGender"));
				user.setHrContact(rs.getString("hrContact"));
//			user.setHrJoinDate(rs.getString("hrJoinDate"));

				list.add(user);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;

	}

	public HrBean getHrById(Integer id) {
		HrBean user = null;
		ResultSet rs = null;

		Connection con = null;
		try {

			// TODO Auto-generated method stub
			con = dbConnection.getConnection();
			PreparedStatement pstm = con.prepareStatement("select * from Hr where hrId=?");

			pstm.setInt(1, id);
			rs = pstm.executeQuery();

			if (rs.next()) {
				user = new HrBean();
				user.setHrId(rs.getInt("hrId"));
				user.setHrFirstName(rs.getString("hrFirstName"));
				user.setHrLastName(rs.getString("hrLastName"));
				user.setHrEmail(rs.getString("hrEmail"));
				user.setHrPassword(rs.getString("hrPassword"));
				user.setHrGender(rs.getString("hrGender"));
				user.setHrContact(rs.getString("hrContact"));
				user.setHrJoinDate(rs.getString("hrJoinDate"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return user;

	}

	public void deleteHr(Integer id) {
		
		Connection con=null;
		   try
		  {
			
			
			// TODO Auto-generated method stub
			con = dbConnection.getConnection();
			PreparedStatement pstm = con.prepareStatement("delete from Hr where hrId=?");
			
			pstm.setInt(1,id);
			pstm.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
