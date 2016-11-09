package com.traveler.trav;

import com.traveler.trav.entities.*;
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class Trav implements SparkApplication
{
	public static void main(String[] args)
	{	
		staticFileLocation("/public");
		SparkApplication traveler = new Trav();

		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        traveler.init();
	}

	@Override
    public void init()
    {
    	post("/loginUser", (req, res) ->
    	{
    		User user = new User();

    		final String userName = req.queryParams("userName");
    		final String userPass = req.queryParams("userPass");

    		user.setId(1);
    		user.setName(userName);
    		user.setPassword(userPass);

    		res.status(200);

    		return res;
    	});
    }	
}