package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.HrBean;
import com.dao.adminDao;

@WebServlet("/ListHrController")
public class ListHrController extends HttpServlet {
     
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<HrBean> users=new adminDao().getHrList();
		
		req.setAttribute("users", users);
		req.getRequestDispatcher("adminDashBoard.jsp").forward(req, resp);
	}
}
