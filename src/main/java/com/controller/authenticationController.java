package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.adminBean;
import com.dao.adminDao;

@WebServlet("/authenticationController")
public class authenticationController extends HttpServlet {
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		   String adminEmail=request.getParameter("adminEmail");
		   String adminPass=request.getParameter("adminPass");
		   
		   adminBean abean=new adminDao().authenticate(adminEmail,adminPass);
		     
				RequestDispatcher rd=null;
				if(abean==null)
				{
					request.setAttribute("error", "Please Enter Valid Credentials...");
					rd=request.getRequestDispatcher("adminLogin.jsp");
				}
				else
				{
					rd=request.getRequestDispatcher("adminDashBoard.jsp");
				}
						
				rd.forward(request, response);
			}
}
