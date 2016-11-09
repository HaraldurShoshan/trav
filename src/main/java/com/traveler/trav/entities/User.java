package com.traveler.trav.entities;

public class User
{

	private int userId;
	private String userName;
	private String password;

	public User()
	{
		userId = 0;
		userName = null;
		password = null;
	}

	public User(int id, String name, String pass)
	{
		userId = id;
		userName = name;
		password = pass;
	}

	public int getId()
	{
		return userId;
	}

	public void setId(int id)
	{
		userId = id;
	}

	public String getName()
	{
		return userName;
	}

	public void setName(String name)
	{
		userName = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String pass)
	{
		password = pass;
	}
}