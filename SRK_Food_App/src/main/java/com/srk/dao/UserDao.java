package com.srk.dao;

import java.util.ArrayList;

import com.srk.model.User;

public interface UserDao 
{
	int insertUser(User u);
    ArrayList<User> fetchAllData();
	User getUserData(String email);
	int updateUser(User u,String email);
	int  deleteUser(String email);

}
