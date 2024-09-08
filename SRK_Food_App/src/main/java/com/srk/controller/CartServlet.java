package com.srk.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srk.dao.*;
import com.srk.model.Cart;
import com.srk.model.CartItem;
import com.srk.model.Menu;


/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		Cart cart=(Cart) session.getAttribute("cart");
		if(cart==null)
		{
			cart=new Cart();
			session.setAttribute("cart", cart);
		}
		String action=req.getParameter("action");
		if("add".equals(action))
		{
			addItemToCart(req,cart);
		}
		else if("update".equals(action))
		{
			updateCartItem(req,cart);
		}
		else if("delete".equals(action))
		{
			removeItemFromCart(req,cart);
		}
		session.setAttribute("cart", cart);
		resp.sendRedirect("cart.jsp");
		
		
		
		
		
		
	}

	private void addItemToCart(HttpServletRequest req, Cart cart) 
	{
		int itemId=Integer.parseInt(req.getParameter("itemId"));
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		
		MenuDao menu=new MenuDaoImplementation();
		
		Menu menuItem=menu.getItemData(itemId);
		
		HttpSession session=req.getSession();
		session.setAttribute("restaurantId", menuItem.getRestaurantId());
		if(menuItem!=null)
		{
			
			CartItem item=new CartItem(itemId,menuItem.getRestaurantId(),menuItem.getItemName(),menuItem.getPrice(),quantity,menuItem.getPrice()*quantity);
			cart.addItem(item);
			
		}
		// TODO Auto-generated method stub
		
	}
	private void removeItemFromCart(HttpServletRequest req, Cart cart) 
	{
		int itemId=Integer.parseInt(req.getParameter("itemId"));
		cart.removeItem(itemId);
        req.getSession().setAttribute("cart", cart);

		

		
		
		// TODO Auto-generated method stub
		
	}

	private void updateCartItem(HttpServletRequest req, Cart cart) 
	{
		 String itemIdStr = req.getParameter("itemId");
	        String quantityStr = req.getParameter("quantity");
	        
	        System.out.println(itemIdStr+"  "+quantityStr);

	        if (itemIdStr != null && quantityStr != null) {
	            try {
	                int itemId = Integer.parseInt(itemIdStr);
	                int quantity = Integer.parseInt(quantityStr);
	                cart.updateItem(itemId, quantity);
	                cart.calculateSubTotal(itemId);
	               req.getSession().setAttribute("cart", cart);
	            } catch (NumberFormatException e) {
	                e.printStackTrace();  // Log the exception, handle error
	            }
	        } else {
	        	System.out.println("error");
	        }

		
		
	}


}
