package com.srk.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.srk.connector.Connector;
import com.srk.dao.*;
import com.srk.model.Cart;
import com.srk.model.CartItem;
import com.srk.model.OrderHistory;
import com.srk.model.OrderItem;
import com.srk.model.OrderTable;
import com.srk.model.User;

/**
 * Servlet implementation class ConfirmServlet
 */
@WebServlet("/confirm")
public class ConfirmServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

        HttpSession session = req.getSession();
        OrderTableDao otd = new OrderTableDaoImplementation();
        OrderItemDao oid=new OrderItemDaoImplementation();
        OrderHistoryDao ohd=new OrderHistoryDaoImplementation();
        String paymentMethod = req.getParameter("paymentMethod");


        User u = (User) session.getAttribute("loggedInUser");
        int restaurant_Id=(int) session.getAttribute("restaurant_Id");
        int userId = u.getUser_id();
        double totalAmount = 0;
        Cart cart = (Cart) session.getAttribute("cart");
        
        if (cart != null) {
            Map<Integer, CartItem> cartitems = cart.getItems();
            if (cartitems != null && !cartitems.isEmpty()) {
                for (Map.Entry<Integer, CartItem> entry : cartitems.entrySet()) {
                    CartItem cartitem = entry.getValue();
                    totalAmount+= cartitem.getSubTotal();
                }
                
                OrderTable ot = new OrderTable(userId, restaurant_Id, totalAmount, "completed",paymentMethod );
                int orderId=otd.insertOrder(ot);
                
                    
                int a=0;
                for (Map.Entry<Integer, CartItem> entry : cartitems.entrySet()) {
                	CartItem cartitem = entry.getValue();
                	
                	OrderItem oi = new OrderItem(orderId, cartitem.getItemId(), cartitem.getQuantity(), cartitem.getPrice()*cartitem.getQuantity());
                	a=oid.insertOrderItem(oi);
                 }
               System.out.println(userId);
                OrderHistory oh = new OrderHistory(orderId,userId,totalAmount,"completed");
                System.out.println(oh);
            	int b=ohd.insertOrderHistory(oh);
            	
                if(orderId>0&&a>0&&b>0)
                {
                	resp.sendRedirect("confirmorder.jsp");
                }
                
            }
        }
        
	}
	
	
	
	
	
	
	
	
	
}
                	
                	

                    

                    
                    
