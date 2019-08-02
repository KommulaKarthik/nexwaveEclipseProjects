package com.virtusa.BusTicketReservation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;


public class ConnectionUtil {

	public ConnectionUtil() {

	}
	private static Logger logger = Logger.getLogger("ConnectionUtil.class");
	public static Connection getConnection() throws TravelLineException{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			logger.error("Driver Error",e);
			throw new TravelLineException("Driver is not available ");
		}
		
		Connection connection = null;
		
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelline", "root", "root");
		}catch(SQLException e){
			
			logger.error("SQL Error",e);
			throw new TravelLineException("Connection is not available");
			
		}
		
		return connection;
		
		
	}

}
