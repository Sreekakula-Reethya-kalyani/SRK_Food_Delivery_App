package com.srk.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.srk.connector.Connector;
import com.srk.model.Menu;
import com.srk.model.OrderHistory;
import com.srk.model.OrderTable;

public class OrderHistoryDaoImplementation implements OrderHistoryDao
{
	private static final String INSERT_ORDERHISTORY="insert into `orderhistory`( orderId, userId, totalAmount, status) values(?,?,?,?)";
	private static final String GET_USER_HISTORY="select * from orderhistory where userId=?";

	private static Connection con;
	private static PreparedStatement ptsp;
	private static ResultSet res;
	private static Statement stmt;
	static int i=0;
	OrderHistory oh;
	ArrayList<OrderHistory> orderHistoryList=new ArrayList<OrderHistory>();

	public OrderHistoryDaoImplementation()
	{
		con = Connector.connetion();

	}

	@Override
	public int insertOrderHistory(OrderHistory oh) 
	{
		try
		{
			ptsp=con.prepareStatement(INSERT_ORDERHISTORY);
			ptsp.setInt(1, oh.getOrderId());
			ptsp.setInt(2, oh.getUserId());
			ptsp.setDouble(3,oh.getTotAmount());
			ptsp.setString(4, oh.getStatus());
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
	public int updateOrderHistory(OrderHistory oh, int orderHistoryId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderHistory> fetchAllOrderHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderHistory getOrderHistoryBasedOnOrderId(int orderHistoryId) 
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteOrderItem(int orderHistoryId) {
		// TODO Auto-generated method stub
		return 0;
	}
	public ArrayList<OrderHistory> getOrderHistoryBasedOnUserId(int userId) 
	{
		try
		{
			ptsp=con.prepareStatement(GET_USER_HISTORY);
			ptsp.setInt(1, userId);
			res=ptsp.executeQuery();
			orderHistoryList=extractHistory(res);	
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return orderHistoryList;
	}
	private ArrayList<OrderHistory> extractHistory(ResultSet res) 
	{
		try
		{
			while(res.next())
			{
				orderHistoryList.add(new OrderHistory(res.getInt("orderId"), res.getDouble("totalAmount"),res.getInt("orderHistoryId"),res.getString("status")));

			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderHistoryList;
	}

//	
}
