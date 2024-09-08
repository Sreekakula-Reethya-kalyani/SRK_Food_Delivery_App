package com.srk.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.srk.dao.*;
import com.srk.model.OrderHistory;
import com.srk.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OrderHistoryServlet
 */
@WebServlet("/history")
public class OrderHistoryServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		OrderHistoryDao orderho=new OrderHistoryDaoImplementation();

		HttpSession session=req.getSession();  
		User u=(User)session.getAttribute("loggedInUser");
		
		int user_id=u.getUser_id();
		ArrayList<OrderHistory> orderhistorylist=orderho.getOrderHistoryBasedOnUserId(user_id);
		if(orderhistorylist!=null)
		{
			
			
			session.setAttribute("orderhistorylist", orderhistorylist);
			resp.sendRedirect("orderhistory.jsp");
			
		}
		else
		{
			resp.sendRedirect("user_not_found.jsp");
		}
		
		
		
		
				
	
	}
	
}
