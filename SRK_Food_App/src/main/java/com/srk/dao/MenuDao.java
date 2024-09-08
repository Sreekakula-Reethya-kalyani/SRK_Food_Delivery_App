package com.srk.dao;

import java.util.ArrayList;

import com.srk.model.Menu;

public interface MenuDao 
{
	int insertItem(Menu m);
    ArrayList<Menu> fetchAllItems();
    Menu getItemData(int menuId);
	int updateItem(Menu m, int menuId);
	int  deleteItem(int menuId);
    ArrayList<Menu> getItemsBasedOnRestaurantId(int restaurantId);

	

}
