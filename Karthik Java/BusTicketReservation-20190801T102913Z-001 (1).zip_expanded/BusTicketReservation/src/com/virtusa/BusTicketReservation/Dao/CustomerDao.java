package com.virtusa.BusTicketReservation.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.BookingMapDetail;

import com.virtusa.BusTicketReservation.model.TicketInfo;
import com.virtusa.BusTicketReservation.service.ICustomer;
import com.virtusa.BusTicketReservation.util.ConnectionUtil;


import com.virtusa.BusTicketReservation.model.ServiceDetail;


public class CustomerDao implements ICustomer {

	public CustomerDao() {
	}
	  @Override 
	  public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException { 
	   
	  String query =" select bo.source,bo.destination,bo.journeyDate,bm.seatNo,bm.passengerName,\r\n" + 
	  		"	  		bo.selectedBusName,bo.selectedBusId from bookingmap bm join booking bo on bo.BookingId = bm.bookingId join ticketinfo ti \r\n" + 
	  		"	  		on ti.seatNumber = bm.seatNo where bo.BookingId = ? "; 
	  List<TicketInfo> list = new ArrayList<TicketInfo>(); 
	  ResultSet resultSet = null; 
	  Connection connection = ConnectionUtil.getConnection();
	  PreparedStatement preparedStatement = null;
	  try { 
		  System.out.println(connection);
		  preparedStatement = connection.prepareStatement(query);
	  preparedStatement.setInt(1,bid ); 
	  resultSet = preparedStatement.executeQuery();
	  while (resultSet.next()) {
		  String source = resultSet.getString("source");
		  String destination = resultSet.getString("destination");
		  String dateOfJourney = resultSet.getString("journeyDate");
		  String selectedBusName = resultSet.getString("selectedBusName");
		  int selectedBusId = resultSet.getInt("selectedBusId");
		  
		  
		  BookingDetail bookingDetail = new BookingDetail();
		  bookingDetail.setSource(source);
		  bookingDetail.setDestination(destination);
		  bookingDetail.setJourneyDate(dateOfJourney);
		  bookingDetail.setSelectedBusName(selectedBusName);
		  bookingDetail.setSelectedBusId(selectedBusId);
		  
		  
		  int seatNumber = resultSet.getInt("seatNo");
		  String passengerName = resultSet.getString("passengerName");
		  BookingMapDetail bookingMapDetail = new BookingMapDetail();
		  bookingMapDetail.setSeatNumber(seatNumber);
		  bookingMapDetail.setTravellerName(passengerName); 
		  TicketInfo ticketInfo = new TicketInfo();
		  ticketInfo.setBookingDetail(bookingDetail);
		  ticketInfo.setBookingMapDetail(bookingMapDetail);
	  list.add(ticketInfo);

	  }
	  

		} catch (SQLException e) {
			throw new TravelLineException(e.getMessage());
		} catch (Exception e) {
			throw new TravelLineException(e.getMessage());
		}

		finally {

			
			try {

				if (resultSet != null) {

					resultSet.close();
				}

				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {

				throw new TravelLineException(" error while closing a resource contact to admin");

			} catch (Exception e) {


				throw new TravelLineException("  contact to admin");

			}

		}

		return list;
	  
	 
	
}
}


