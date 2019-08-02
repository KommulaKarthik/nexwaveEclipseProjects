package com.virtusa.travel_line.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.travel_line.exception.TravelLineException;


public class ConnectionUtil {

	public ConnectionUtil() {
		// TODO Auto-generated constructor stub
	}
	private static Logger logger = Logger.getLogger("ConnectionUtil.class");
	public static Connection getConnection() throws TravelLineException{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error("Driver Error",e);
			throw new TravelLineException("Driver is not available ");
		}
		
		Connection connection = null;
		
		try{
			connection = DriverManager.getConnection("","root","root");
		}catch(SQLException e){
			
			logger.error("SQL Error",e);
			throw new TravelLineException("Connection is not available");
			
		}
		
		return connection;
		
		
	}

}
