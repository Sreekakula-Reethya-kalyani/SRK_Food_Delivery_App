package com.srk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.srk.connector.Connector;
import com.srk.model.Menu;

public class MenuDaoImplementation implements MenuDao{
	private static final String FETCH_ALL_ITEMS="select *from menu";
	private static final String FETCH_BASED_ON_RESTATURANT_ID="select *from menu where restaurantId=?";
	private static final String FETCH_BASED_ON_MENU_ID="select *from menu where menuId=?";

	
	private static Connection con;
	private static PreparedStatement ptsp;
	private static ResultSet res;
	ArrayList<Menu> itemList=new ArrayList<Menu>();
	
	
	
	
	public MenuDaoImplementation()
	{
		con = Connector.connetion();
	}


	@Override
	public ArrayList<Menu> getItemsBasedOnRestaurantId(int restaurantId) 
	{
		
		try
		{
			ptsp=con.prepareStatement(FETCH_BASED_ON_RESTATURANT_ID);
			ptsp.setInt(1, restaurantId);
			res = ptsp.executeQuery();
			itemList=exctractItems(res);
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return itemList;
	}



	private ArrayList<Menu> exctractItems(ResultSet res) 
	{
		try
		{
			while(res.next())
			{
				itemList.add(new Menu(res.getInt("menuId"),res.getString("itemName"),res.getString("description"),res.getDouble("price")));
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return itemList;
	}


	@Override
	public int insertItem(Menu m) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public ArrayList<Menu> fetchAllItems() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Menu getItemData(int menuId)
	{
		Menu m=null;
		
		try
		{
			ptsp=con.prepareStatement(FETCH_BASED_ON_MENU_ID);
			ptsp.setInt(1, menuId);
			res=ptsp.executeQuery();
			while(res.next())
			{
				m=new Menu(res.getInt("restaurantId"),res.getString("itemName"),res.getString("description"),res.getDouble("price"));
				
			}
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return m;
		
	}




	@Override
	public int updateItem(Menu m, int menuId) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int deleteItem(int menuId) {
		// TODO Auto-generated method stub
		return 0;
	}




	

}
