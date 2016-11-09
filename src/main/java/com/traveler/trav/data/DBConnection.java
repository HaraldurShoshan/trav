package com.traveler.trav.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	Connection c = null;

	public DBConnection()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			c = DriverManager
			.getConnection("jdbc:postgresql://localhost:5432/traveler",
            "postgres", "");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//System.err.println(e.getClass().getName() + ": " + e.getMessage());
			//System.exit(0);
		}
		// System.out.println("Opened database successfully");
	}

	public Connection getConnection() { return c; }

}