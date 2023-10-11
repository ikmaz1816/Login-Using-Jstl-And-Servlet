package com.validate;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	static Connection con;
	
	public static Connection createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/management";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
