package com.srk.dao;

import java.util.ArrayList;

import com.srk.model.Restaurant;


public interface RestaurantDao 
{
	int insertUser(Restaurant r);
    ArrayList<Restaurant> fetchAllRestaurants();
    Restaurant getRestaurantData(int restaurant_Id);
	int updateRestaurant(Restaurant r,String email);
	int  deleteRestaurant(int restaurant_Id);

}
