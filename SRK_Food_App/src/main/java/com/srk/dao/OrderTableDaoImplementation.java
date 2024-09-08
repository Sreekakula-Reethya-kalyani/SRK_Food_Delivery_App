package com.srk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.srk.connector.Connector;
import com.srk.model.OrderTable;

public class OrderTableDaoImplementation implements OrderTableDao
{
	private static final String INSERT_ORDER="insert into `ordertable`(userId,restaurantId,totalAmount,status,paymentMode) values(?,?,?,?,?)";
	private static final String GET_ORDERID="select orderId from `ordertable` order by orderId desc limit 1";
	private static Connection con;
	private static PreparedStatement ptsp;
	private static ResultSet res;
	private static Statement stmt;
	static int i=0;

	public OrderTableDaoImplementation()
	{
		con = Connector.connetion();

	}

	@Override
	public int insertOrder(OrderTable ot) 
	{
		int orderId=0;
		try
		{
			ptsp=con.prepareStatement(INSERT_ORDER,Statement.RETURN_GENERATED_KEYS);
			ptsp.setInt(1, ot.getUserId());
			ptsp.setInt(2, ot.getRestaurantId());
			ptsp.setDouble(3, ot.getTotalAmount());
			ptsp.setString(4, ot.getStatus());
			ptsp.setString(5, ot.getPaymentMode());
			 i = ptsp.executeUpdate();

		        if (i > 0) {
		            res = ptsp.getGeneratedKeys();
		            if (res.next()) {
		                orderId = res.getInt(1);
		            }
		        }

		        
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return orderId;
	}
	
	@Override
	public int updateOrder(OrderTable ot, int orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderTable> fetchAllOrderTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderTable getOrderBasedOnOrderId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteOrderItem(int orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
