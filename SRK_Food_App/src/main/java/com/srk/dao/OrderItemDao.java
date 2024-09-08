package com.srk.dao;

import java.util.ArrayList;
import java.util.List;

import com.srk.model.OrderItem;
import com.srk.model.OrderTable;

public interface OrderItemDao 
{
	int insertOrderItem(OrderItem oi);
	int updateOrderItem(OrderItem oi,int orderItemId );
	List<OrderItem> fetchAllOrderItems();
	 OrderItem getOrderItemBasedOnOrderItemId(int orderItemId);
	 int deleteOrderItem(int orderItemId);
	 ArrayList<OrderItem> getOrderItemsBasedOnOrderId(int orderId);

}
