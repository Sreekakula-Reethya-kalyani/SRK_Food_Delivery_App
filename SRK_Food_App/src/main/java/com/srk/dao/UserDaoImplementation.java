package com.srk.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.srk.connector.Connector;
import com.srk.model.User;

public class UserDaoImplementation implements UserDao
{
	private static final String INSERT_USER="insert into `user`(user_name,email,phone_no,password,adress) values(?,?,?,?,?)";
	private static final String FETECH_ALL_DATA="select * from `user`";
	private static final String FETCH_USER_DATA="select * from `user` where email=?";
	private static final String UPDATE_USER_DATA="update `user` set user_name=?, password=?, phone_no=?, adress=? where email=?";
	private static final String DELETE_BASED_ON_EMAIL="delete `user` where email=?";

	static int i;
	private static Connection con;
	private static PreparedStatement ptsp;
	private static ResultSet res;
	private static Statement stmt;
	private User u;
	ArrayList<User> userlist=new ArrayList<User>();
	public UserDaoImplementation() {
		con=Connector.connetion();
	}

	@Override
	public int insertUser(User u) 
	{
		try
		{
			ptsp=con.prepareStatement(INSERT_USER);
			ptsp.setString(1, u.getUser_name());
			ptsp.setString(2, u.getEmail());
			ptsp.setString(3, u.getPhone_no());
			ptsp.setString(4, u.getPassword());
			ptsp.setString(5, u.getAdress());
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
	public ArrayList<User> fetchAllData()
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserData(String email) 
	{
		try
		{
			ptsp = con.prepareStatement(FETCH_USER_DATA);
			ptsp.setString(1, email);
			res = ptsp.executeQuery();
			u=extractUserFromResultSet(res).get(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return u;
	}

	@Override
	public int updateUser(User u, String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String email) {
		// TODO Auto-generated method stub
		return 0;
	}
	ArrayList<User> extractUserFromResultSet(ResultSet res){
		try {
			while(res.next()) {
				userlist.add(new User(res.getInt("user_id"),res.getString("user_name"),res.getString("email"),res.getString("phone_no"),
						res.getString("password") , res.getString("adress")));

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userlist;

	}
}
