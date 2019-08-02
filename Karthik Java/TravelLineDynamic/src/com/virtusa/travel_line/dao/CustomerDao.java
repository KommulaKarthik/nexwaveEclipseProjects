package com.virtusa.travel_line.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.model.CustomerDetail;
import com.virtusa.travel_line.model.ServiceDetail;
import com.virtusa.travel_line.model.TicketInfo;
import com.virtusa.travel_line.service.ICustomer;
import com.virtusa.travel_line.util.ConnectionUtil;

public class CustomerDao implements ICustomer {

	public CustomerDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException {
		return null;
		
		/* 
		  String query =" select bo.source,bo.destination,bo.journeyDate,bm.seatNo,bm.passengerName,\r\n" + 
		  		"bo.selectedBusName,bo.selectedBusId from bookingmap bm join booking bo join ticketinfo ti \r\n" + 
		  		"on ti.seatNumber = bm.seatNo and ti.bookId = bo.BookingId where bo.BookingId = ? "; 
		  		
		  
		  
		  
		  List<TicketInfo> list = new ArrayList<TicketInfo>(); 
		  ResultSet resultSet = null; 
		  Connection connection = ConnectionUtil.getConnection();
		  PreparedStatement preparedStatement = null;
		  
		  
		  try { 
			  
			  preparedStatement = connection.prepareStatement(query);
		  
		  preparedStatement.setInt(1,bid ); 
		  resultSet = preparedStatement.executeQuery();
		  
		  
		  
		  while (resultSet.next()) {
		   
		  
			 
			  String source = resultSet.getString("source");
			  String destination = resultSet.getString("destination");
			  String dateOfJourney = resultSet.getString("journeyDate");
			  String selectedBusName = resultSet.getString("selectedBusName");
			  String selectedBusId = resultSet.getString("selectedBusId");
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
			  bookingMapDetail.setpassengerName(passengerName);
			  
			  
			  TicketInfo ticketInfo = new TicketInfo();
			  ticketInfo.setBookingDetail(bookingDetail);
			  ticketInfo.setBookingMapDetail(bookingMapDetail);
		  
		 
		  
		  
		  list.add(ticketInfo);
		  
		  
		  
		  
		  
		  
		  }

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//logger.error("sql error", e);
				throw new TravelLineException(e.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//logger.error("internal error", e);
				throw new TravelLineException(e.getMessage());
			}

			finally {

				// close pstmt,connection,result set also
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

					//logger.error("sql error", e);
					// TODO: handle exception
					throw new TravelLineException(" error while closing a resource contact to admin");

				} catch (Exception e) {
					// TODO: handle exception

					//logger.error("internal error", e);
					throw new TravelLineException("  contact to admin");

				}

			}

			// TODO Auto-generated method stub
			return list;*/

		
				
			
	}

	
	

}
