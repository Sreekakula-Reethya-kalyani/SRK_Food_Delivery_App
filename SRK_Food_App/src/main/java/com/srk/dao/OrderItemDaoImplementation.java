package com.srk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.srk.connector.Connector;
import com.srk.model.OrderItem;
import com.srk.model.Restaurant;

public class OrderItemDaoImplementation implements OrderItemDao
{
	private static final String INSERT_ORDERItem="insert into `orderitem`(orderId, menuId, quantity, subTotal) values(?,?,?,?)";
	private static final String GET_ORDERITEMS_BASED_ORDERID="select * from orderitem where orderId=?";
	private static Connection con;
	private static PreparedStatement ptsp;
	private static ResultSet res;
	private static Statement stmt;
	static int i=0;
	static private ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();

	public OrderItemDaoImplementation()
	{
		con = Connector.connetion();

	}


	@Override
	public int insertOrderItem(OrderItem oi) 
	{
		try
		{
			ptsp=con.prepareStatement(INSERT_ORDERItem);
			ptsp.setInt(1, oi.getOrderId());
			ptsp.setInt(2, oi.getMenuId());
			ptsp.setInt(3,oi.getQuantity());
			ptsp.setDouble(4, oi.getSubTotal());
			i=ptsp.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return i;
	}
	

	@Override
	public int updateOrderItem(OrderItem oi, int orderItemId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderItem> fetchAllOrderItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem getOrderItemBasedOnOrderItemId(int orderItemId) 
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteOrderItem(int orderItemId) {
		// TODO Auto-generated method stub
		return 0;
	}
	 public ArrayList<OrderItem> getOrderItemsBasedOnOrderId(int orderId)
	 {
		 try
		 {
			 ptsp=con.prepareStatement(GET_ORDERITEMS_BASED_ORDERID);
			 ptsp.setInt(1, orderId);
			 res=ptsp.executeQuery();
			 orderItemList=extractOrderItems(res);
			 System.out.println(orderItemList);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return orderItemList;
	 }
	


	public ArrayList<OrderItem> extractOrderItems(ResultSet res)
	{
		try
		{
			while(res.next())
			{
				
				orderItemList.add(new OrderItem(res.getInt("orderItemId"),res.getInt("menuId"),res.getDouble("subTotal"),res.getInt("quantity")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderItemList;
	}


}
