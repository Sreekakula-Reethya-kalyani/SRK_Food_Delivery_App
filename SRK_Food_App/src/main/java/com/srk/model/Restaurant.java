package com.srk.model;

public class Restaurant 
{
	private int restaurant_Id;
	private String restaurant_Name;
	private String cuisinType;
	private int deliveryTime;
	private String adress;
	private double rating;
	private int adminId;
	private String isActive;
	public Restaurant() {
		super();
	}
	
	
	public Restaurant(int restaurant_Id, String restaurant_Name, String cuisinType, int deliveryTime, String adress,
			double rating, int adminId, String isActive) {
		super();
		this.restaurant_Id = restaurant_Id;
		this.restaurant_Name = restaurant_Name;
		this.cuisinType = cuisinType;
		this.deliveryTime = deliveryTime;
		this.adress = adress;
		this.rating = rating;
		this.adminId = adminId;
		this.isActive = isActive;
	}
	


	public Restaurant(String restaurant_Name, String cuisinType, int deliveryTime, String adress, double rating,
			int adminId, String isActive) {
		super();
		this.restaurant_Name = restaurant_Name;
		this.cuisinType = cuisinType;
		this.deliveryTime = deliveryTime;
		this.adress = adress;
		this.rating = rating;
		this.adminId = adminId;
		this.isActive = isActive;
	}


	public int getRestaurant_Id() {
		return restaurant_Id;
	}
	public void setRestaurant_Id(int restaurant_Id) {
		this.restaurant_Id = restaurant_Id;
	}
	public String getRestaurant_Name() {
		return restaurant_Name;
	}
	public void setRestaurant_Name(String restaurant_Name) {
		this.restaurant_Name = restaurant_Name;
	}
	public String getCuisinType() {
		return cuisinType;
	}
	public void setCuisinType(String cuisinType) {
		this.cuisinType = cuisinType;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return restaurant_Id+" "+restaurant_Name+" "+cuisinType+" "+deliveryTime+" "+adress+" "+rating+" "+adminId+" "+isActive;
	}
	

}
