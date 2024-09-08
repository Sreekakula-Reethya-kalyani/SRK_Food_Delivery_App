package com.srk.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srk.dao.*;
import com.srk.model.Restaurant;

@WebServlet("/home")
public class HomeServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<Restaurant> restaurantlist;
		RestaurantDao restaurant=new RestaurantDaoImplementation();
		restaurantlist=restaurant.fetchAllRestaurants();
	    HttpSession session=req.getSession();
	    session.setAttribute("restaurantlist", restaurantlist);
	    resp.sendRedirect("home.jsp");
		
	}
	


}
