package com.srk.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector 
{
	static Connector connection=new Connector();
	private Connector() {
		
	}
	public static Connector getConnetion() {
		return connection;
	}
	public static Connection connetion()
	{
		String url="jdbc:mysql://localhost:3306/tapfoods";
		String usn="root";
		String pwd="S@reethya0608";
		Connection con;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url,usn,pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
