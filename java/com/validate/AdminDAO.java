package com.validate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
	
	Connection con;
	
	public boolean isValid(String email,String password)
	{
		try
		{
			con=CreateConnection.createConnection();
			String query="Select * from admin where email=? and password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rows=ps.executeQuery();
			if(rows.next())
				return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
