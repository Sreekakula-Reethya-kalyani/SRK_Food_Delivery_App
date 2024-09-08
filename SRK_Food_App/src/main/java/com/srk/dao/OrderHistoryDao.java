package com.srk.dao;

import java.util.ArrayList;
import java.util.List;

import com.srk.model.OrderHistory;
import com.srk.model.OrderTable;

public interface OrderHistoryDao 
{
	int insertOrderHistory(OrderHistory oh);
	int updateOrderHistory(OrderHistory oh,int orderHistoryId);
	List<OrderHistory> fetchAllOrderHistory();
	OrderHistory getOrderHistoryBasedOnOrderId(int orderHistoryId);
	 int deleteOrderItem(int orderHistoryId);
	 
	 ArrayList<OrderHistory> getOrderHistoryBasedOnUserId(int user_id) ;

}
