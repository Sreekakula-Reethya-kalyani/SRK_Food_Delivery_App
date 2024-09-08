package com.srk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.Statement;

import com.srk.connector.Connector;
import com.srk.model.Restaurant;

public class RestaurantDaoImplementation implements RestaurantDao
{
	private static final String FETCH_ALL_RESTAURANTS="select * from restaurant";
	private static final String FETCH_RESTAURANDBY_ID="select * from restaurant where restaurant_Id=?";
	private static final String INSERT_RESTAURANT="insert into restaurant(restaurant_Name,cuisinType,deliveryTime,adress,rating,adminId,isActive) "
			+ "values(?,?,?,?,?,?,?)";
	private static final String UPDATE_RESTAURANT_DATA="update restaurant set restaurant_Name=?,cuisinType=?,deliveryTime=?,"
			+ "adress=?,rating=?,adminId=?,isActive=? where restaurant_Id=?";
	private static final String DELETE_RESTAURANT="delete table restauranat";
	private static Connection con=null;
	private static Statement stmt;
	private static PreparedStatement ptsp;
	Restaurant r;
	private static int i=0;

	private static ResultSet res;
	static private ArrayList<Restaurant> restaurantlist=new ArrayList<Restaurant>();
	
	
	public RestaurantDaoImplementation()
	{
		con=Connector.connetion();
	}



	@Override
	public int insertUser(Restaurant r) 
	{
		try
		{
			ptsp=con.prepareStatement(INSERT_RESTAURANT);
			ptsp.setString(1,r.getRestaurant_Name());
			ptsp.setString(2,r.getCuisinType());
			ptsp.setInt(3, r.getDeliveryTime());
			ptsp.setString(4,r.getAdress());
			ptsp.setDouble(5, r.getRating());
			ptsp.setInt(6,r.getAdminId());
			ptsp.setString(7, r.getIsActive());
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
	public ArrayList<Restaurant> fetchAllRestaurants() 
	{
		try
		{
			stmt=con.createStatement();
			res=stmt.executeQuery(FETCH_ALL_RESTAURANTS);
			restaurantlist=extractRestaurantFromResultSet(res);
		}
		catch(Exception e)   
		{
			e.printStackTrace();
		}
		return restaurantlist;
	}

	@Override
	public Restaurant getRestaurantData(int restaurant_Id) 
	{
		try
		{
			ptsp=con.prepareStatement(FETCH_RESTAURANDBY_ID);
		    ptsp.setInt(1, restaurant_Id);
		    res=ptsp.executeQuery();
		    while(res.next())
		    {
		    	r=new Restaurant(res.getString(1),res.getString(2),res.getInt(3),res.getString(4),res.getDouble(5),res.getInt(6),res.getString(7));
		    }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public int updateRestaurant(Restaurant r, String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRestaurant(int restaurant_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	public ArrayList<Restaurant> extractRestaurantFromResultSet(ResultSet res) {
		try {
			while (res.next()) {
				restaurantlist.add(new Restaurant(res.getInt("restaurant_Id"),res.getString("restaurant_Name"),res.getString("cuisinType"),res.getInt("deliveryTime"),res.getString("adress"),res.getDouble("rating"),res.getInt("adminId"),res.getString("isActive")));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return restaurantlist;
	}
	

	

}
