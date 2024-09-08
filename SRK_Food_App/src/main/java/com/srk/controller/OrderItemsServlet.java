package com.srk.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.srk.dao.*;
import com.srk.model.OrderItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OrderItemsServlet
 */
@WebServlet("/orderitem")
public class OrderItemsServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		OrderItemDao oid=new OrderItemDaoImplementation();
		int orderId=Integer.parseInt(req.getParameter("orderId"));
		ArrayList<OrderItem> orderItemList=oid.getOrderItemsBasedOnOrderId(orderId);
		
		if(orderItemList!=null)
		{
			HttpSession session=req.getSession();
		    session.setAttribute("orderItemList", orderItemList);
		    resp.sendRedirect("OrderItem.jsp");
			
		}
		else
		{
			
		}
		
		
	}
	
}
