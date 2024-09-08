package com.srk.dao;

import java.util.List;

import com.srk.model.OrderTable;
import com.srk.model.User;

public interface OrderTableDao 
{
	int insertOrder(OrderTable ot);
	int updateOrder(OrderTable ot,int orderId);
	List<OrderTable> fetchAllOrderTable();
	 OrderTable getOrderBasedOnOrderId(int orderId);
	 int deleteOrderItem(int orderId);


}
