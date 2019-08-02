package com.virtusa.BusTicketReservation.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import org.apache.log4j.Logger;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.IService;
import com.virtusa.BusTicketReservation.service.ServiceSearch;
import com.virtusa.BusTicketReservation.util.ConnectionUtil;

public class ServiceDao implements IService {
	static ServiceDao serviceDao = null;

	public static ServiceDao getServiceDao() {
		if (serviceDao == null) {
			serviceDao = new ServiceDao();
		}
		return serviceDao;
	}

	private ServiceDao() {
		// TODO Auto-generated constructor stub
	}

	Logger logger = Logger.getLogger("ServiceDao");

	@Override
	public void printServiceDetails() throws TravelLineException {
		// TODO Auto-generated method stub

	}

	
	@Override
	public List<ServiceDetail> selectService() throws TravelLineException {
		// TODO Auto-generated method stub

		String query = "select busId, busName, fare from service where srFrom in(select source from Booking)";
     
		List<ServiceDetail> list = new ArrayList<>();
		ResultSet resultSet = null;
		Connection connection =ConnectionUtil.getConnection();
		PreparedStatement statement = null;
		try {
		statement=connection.prepareStatement(query);
		resultSet=statement.executeQuery();
		while(resultSet.next()){

		String id=resultSet.getString("busId");
		String name=resultSet.getString("busName");
		double price=resultSet.getDouble("fare");
		ServiceDetail p=new ServiceDetail();
		p.setBusId(id);
		p.setServiceName(name);
		p.setServiceFare(price);
		list.add(p);
		
		
		}
		
		} catch (SQLException e) {
			logger.error("sql error", e);
			throw new TravelLineException(e.getMessage());
		} catch (Exception e) {
			logger.error("internal error", e);
			throw new TravelLineException(e.getMessage());
		}

		finally {

			try {

				if (resultSet != null) {

					resultSet.close();
				}

				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {

				logger.error("sql error", e);
				// TODO: handle exception
				throw new TravelLineException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new TravelLineException("  contact to admin");

			}

		}

		// TODO Auto-generated method stub*/
		return list;

	}
	@Override
	public int bookedDetails() throws TravelLineException {
		// TODO Auto-generated method stub
		int flag=0;

		ResultSet resultSet = null;
        ServiceDetail  serviceDetail=new ServiceDetail();
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = connection
				.prepareStatement(" insert into booking (selectedBusId,selectedBusName)"
						+ " values(?,?) ",Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1,  serviceDetail.getBusId());
		preparedStatement.setString(2, serviceDetail.getServiceName());
		flag=preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		logger.error("error with SQL", e);
		//throw new TravelException("Some internal error with SQL");
		} catch (Exception exception) {

		logger.error("error with system", exception);
		//throw new TravelException("Some internal error");

		}

		finally {

		// close pstmt,connection,result set also
		try {
		if (preparedStatement != null) {
		preparedStatement.close();
		}

		if (connection != null) {
		connection.close();
		}
		} catch (SQLException e) {
		// TODO: handle exception
		throw new TravelLineException(" error while closing a resource");

		}

		}
		return flag;

	}

	@Override
	public int searchService(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement=null;
		ResultSet resultSet = null;
		int bookingNo=0;
		
		try {
		
			preparedStatement=connection.prepareStatement("insert into booking (source,destination,noOfPassengers,journeyDate) VALUES(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, bookingDetail.getSource());
			preparedStatement.setString(2, bookingDetail.getDestination());
			preparedStatement.setInt(3, bookingDetail.getNoOfpassengers());
			preparedStatement.setDate(4,Date.valueOf(bookingDetail.getJourneyDate()));
			bookingNo=preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			
			if(bookingNo>0) {
				bookingNo=1;
			}
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("sql error", e);
			throw new TravelLineException(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("internal error", e);
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

				logger.error("sql error", e);
				// TODO: handle exception
				throw new TravelLineException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new TravelLineException("  contact to admin");

			}

		}
return bookingNo;		
	}
}
