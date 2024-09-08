package com.srk.model;

import java.sql.Date;
import java.time.LocalDateTime;

public class OrderTable 
{
	private int orderId;
	private int userId;
	private int restaurantId;
	private LocalDateTime orderDate;
	private double totalAmount;
	private String status;
	private String paymentMode;
	public OrderTable()
	{
		
	}
	
	public OrderTable(int userId, int restaurantId, double totalAmount, String status, String paymentMode) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentMode = paymentMode;
	}

	public OrderTable(int orderId, int userId, int restaurantId, LocalDateTime orderDate, double totalAmount, String status,
			String paymentMode) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentMode = paymentMode;
	}
	
	public OrderTable(int userId, int restaurantId, LocalDateTime orderDate, double totalAmount, String status,
			String paymentMode) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentMode = paymentMode;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "OrderTable [orderId=" + orderId + ", userId=" + userId + ", restaurantId=" + restaurantId
				+ ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + ", status=" + status + ", paymentMode="
				+ paymentMode + "]";
	}
	
	
	
	

}
