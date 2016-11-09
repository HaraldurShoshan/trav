package com.traveler.trav.services;

import com.traveler.trav.entities.User;
import com.traveler.trav.data.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataService
{
	DBConnection connect = new DBConnection();
	Statement stmt = null;
	Connection c = connect.getConnection();	
	
	public void addUser(String name, String pass) throws SQLException
	{
		stmt = c.createStatement();
		c.setAutoCommit(false);
		String sql = "INSERT INTO users (username, password) "
					+"VALUES('" + name + "', '"+ pass + "');";
		stmt.executeUpdate(sql);
		stmt.close();
		c.commit();
		c.close();
	}

	// public User getUser(String name, String pass)
	// {
		
	// }
}