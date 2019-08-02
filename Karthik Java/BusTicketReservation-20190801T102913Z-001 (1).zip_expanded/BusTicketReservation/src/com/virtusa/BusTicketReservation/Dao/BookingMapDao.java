package com.virtusa.BusTicketReservation.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.*;
import org.apache.log4j.Logger;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingMapDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.IBookingMap;
import com.virtusa.BusTicketReservation.util.ConnectionUtil;

public class BookingMapDao implements IBookingMap {
	Logger logger = Logger.getLogger("BookingMapDao");

	public BookingMapDao() {
		//empty
	}

	@Override
	public void displayBookingDetails(BookingMapDetail bookingMapDetail) throws TravelLineException {
		
	}

	

	@Override
	public int passengerDetails(BookingMapDetail bookingMapDetail) throws TravelLineException {
		int flag=0;

		ResultSet resultSet = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = connection
				.prepareStatement("insert into bookingmap (seatNo,passengerName,passengerAge)values(?,?,?) ",Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1,  bookingMapDetail.getSeatNumber());
		preparedStatement.setString(2, bookingMapDetail.getTravellerName());
		preparedStatement.setInt(3, bookingMapDetail.getTravellerAge());

		flag=preparedStatement.executeUpdate();
		if(flag>0) {
			flag=1;
		}
		} catch (SQLException e) {

		logger.error("error with SQL", e);
		} catch (Exception exception) {

		logger.error("error with system", exception);

		}

		finally {

		
		try {
		if (preparedStatement != null) {
		preparedStatement.close();
		}

		if (connection != null) {
		connection.close();
		}
		} catch (SQLException e) {



		}

		}
		return flag;	}

}
