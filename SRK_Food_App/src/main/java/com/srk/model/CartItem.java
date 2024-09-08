package com.srk.model;

public class CartItem 
{
	private int itemId;
	private int restaurant_Id;
	private String itemName;
	private double price;
	private int quantity;
	private double subTotal;
	public CartItem()
	{
		
	}
	public CartItem(int itemId, int restaurant_Id, String itemName, double price, int quantity, double subTotal) {
		super();
		this.itemId = itemId;
		this.restaurant_Id = restaurant_Id;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getRestaurant_Id() {
		return restaurant_Id;
	}
	public void setRestaurant_Id(int restaurant_Id) {
		this.restaurant_Id = restaurant_Id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	@Override
	public String toString() {
		return "CartItem [itemId=" + itemId + ", restaurant_Id=" + restaurant_Id + ", itemName=" + itemName + ", price="
				+ price + ", quantity=" + quantity + ", subTotal=" + subTotal + "]";
	}
	

}
