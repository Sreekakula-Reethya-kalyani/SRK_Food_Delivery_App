package com.srk.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srk.dao.MenuDao;
import com.srk.dao.MenuDaoImplementation;
import com.srk.model.Menu;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();

		int id=Integer.parseInt(req.getParameter("restaurant_Id"));
		session.setAttribute("restaurant_Id", id);

		MenuDao items=new MenuDaoImplementation();
		ArrayList<Menu> itemsList=items.getItemsBasedOnRestaurantId(id);
		session.setAttribute("itemsList", itemsList);
		resp.sendRedirect("menu.jsp");
		
		
	}
	

}
