package com.srk.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srk.dao.UserDao;
import com.srk.dao.UserDaoImplementation;
import com.srk.model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String user_name=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String phone_no=req.getParameter("phoneNumber");
		String adress=req.getParameter("adress");
		
		
		UserDao a=new UserDaoImplementation();
		User u=new User(user_name, email, phone_no, password, adress);
		
		int i=a.insertUser(u);
		if(i!=0)
		{
			resp.sendRedirect("registrationsuccessfull.jsp");
		}
		else
		{
			resp.sendRedirect("signup.jsp");
		}
	}
	
}
