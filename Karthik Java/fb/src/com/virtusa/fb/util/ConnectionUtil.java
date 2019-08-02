package com.virtusa.fb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.fb.exception.FacebookException;



public class ConnectionUtil {
	public ConnectionUtil() {
		
	}
	
	private static Logger logger=Logger.getLogger("ConnectionUtil");
	
	public static Connection getConnection() throws FacebookException{

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.error("driver error", e);
		 throw new FacebookException("Driver is not available ");		
		}
       Connection connection=null;;
try {
	connection = DriverManager.getConnection("jdbc:mysql://localhost/zomato", "root", "root");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	logger.error("SQL  error", e);
	throw new FacebookException("Connection is not avaialble ");
}	
		return connection;
			
	}
	
	
	
	

}
