package com.traveler.trav;

import com.traveler.trav.entities.*;
import com.traveler.trav.services.*;
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import java.sql.SQLException;

public class Trav implements SparkApplication
{
    public static void main(String[] args)
	{	
		staticFileLocation("/public");
		SparkApplication trav = new Trav();

		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        trav.init();
	}

	@Override
    public void init()
    {
        // final Trav trav = new Trav();
    	post("/loginUser", (req, res) ->
    	{
    		User user = new User();
            DataService ds = new DataService();

    		final String userName = req.queryParams("userName");
    		final String userPass = req.queryParams("userPass");

            user.setId(1);
    		user.setName(userName);
    		user.setPassword(userPass);

            try 
            {
                ds.addUser(userName, userPass);
            } 
            catch (SQLException e) 
            {
                e.printStackTrace();
            }
            

    		res.status(200);

    		return res;
    	});
    }	
}
