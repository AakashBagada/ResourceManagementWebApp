package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.bean.HrBean;
@WebFilter("/AddHr")
public class AddHrFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AddHrFilter::init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("AddHrFilter::doFilter()");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");// null
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		String gender= request.getParameter("gender");
		String number=request.getParameter("number");

		String fn = "[a-zA-Z]+";
		String em = "[a-z]{2,10}.+[a-z]{2,10}[0-9]{0,4}@[gmail]{5}.[com]{3}";
		String ps = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
//			error.append("<br> Please Enter FirstName");
			request.setAttribute("firstname", "Please Enter FirstName");

		} else if (firstName.matches(fn) == false) {
			isError = true;
//			error.append("<br>Please Enter valid Name");
			request.setAttribute("firstname", "Please Enter valid First Name");

		} else if (firstName.trim().length() <= 2) {
			isError = true;
//			error.append("<br>Please Enter Atleast 2 Characters");
			request.setAttribute("firstname", "Please Enter Atleast 2 Characters");
		}

		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
//			error.append("<br> Please Enter Last Name");
			request.setAttribute("lastname", "Please Enter Last Name");
		} else if (lastName.matches(fn) == false) {
			isError = true;
//			error.append("<br>Please Enter valid Name");
			request.setAttribute("lastname", "Please Enter valid Last Name");
		} else if (lastName.trim().length() <= 2) {
			isError = true;
//			error.append("<br>Please Enter Atleast 2 Characters");
			request.setAttribute("lastname", "Please Enter Atleast 2 Characters");
		}

		if(emailId == null || emailId.trim().length()==0)
		{
			isError=true;
//			error.append("<br> Please Enter Email id");
			request.setAttribute("email", "Please Enter Email id");

		}
		else
		{
			if(emailId.matches(em)==false)
			{
			   isError=true;
//			   error.append("<br>Please Enter valid Email Address");
			   request.setAttribute("email", "Please Enter valid Email Address");

			}
			
		}
		if(password==null || password.trim().length()==0)
		{
			isError=true;
//			error.append("<br> Please Enter Password");
			request.setAttribute("password", "Please Enter Password");

		}
		else 
		{
			if(password.matches(ps)==false)
			{
			isError=true;
//			error.append("<br>Please Enter valid Password");
			   request.setAttribute("password", "Please Enter valid Password");

			}
			
		}
         if(gender==null)
			
		{
			isError=true;
//			error.append("<br> Please Enter Gender");
			request.setAttribute("gender", "Please Enter Gender");
			
		}
         if(number.trim().length()!=10) {
        	 isError=true;
        	 request.setAttribute("number", "please Enter valid contect NO");
        			 
         }
         
         HrBean bean=new HrBean();
 		bean.setHrFirstName(firstName);
 	    bean.setHrLastName(lastName);
 	    bean.setHrEmail(emailId);
 	    bean.setHrPassword(password);
 	    bean.setHrGender(gender);
 	    bean.setHrContact(number);

		if (isError) {
			request.setAttribute("user", bean);
			request.getRequestDispatcher("AddHr.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		System.out.println("AddHrFilter::destroy()");

	}
}
