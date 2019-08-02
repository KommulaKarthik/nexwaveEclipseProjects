package com.virtusa.BusTicketReservation.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.AdminDetail;
import com.virtusa.BusTicketReservation.model.FeedbackDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.IAdmin;
import com.virtusa.BusTicketReservation.util.ConnectionUtil;



public class AdminDao implements IAdmin {

	public AdminDao() {
		//empty
	}

	
	
	
		Logger logger=Logger.getLogger("AdminDao");
		private static final String ACTION_1="SOME INTERNAL ERROR";
		@Override
		public int addService(ServiceDetail serviceDetail) throws TravelLineException {
			
			int flag=0;

			

			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement preparedStatement = null;
			try {
			preparedStatement = connection
					.prepareStatement(" insert into service (serviceId,busName,srFrom,srTo,fare)"
							+ " values(?,?,?,?,?) ",Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1,  serviceDetail.getServiceId());
			preparedStatement.setString(2, serviceDetail.getServiceName());
			preparedStatement.setString(3, serviceDetail.getServiceFrom());
			preparedStatement.setString(4, serviceDetail.getServiceTo());
			preparedStatement.setDouble(5, serviceDetail.getServiceFare());
			
			flag=preparedStatement.executeUpdate();
			
			} catch (SQLException e) {

			logger.error("error with SQL", e);
			throw new TravelLineException(ACTION_1);
			} catch (Exception exception) {

			logger.error("error with system", exception);
			throw new TravelLineException(ACTION_1);

			}

			finally {

			// close pstmt,connection,result set also
			try {
			if (preparedStatement != null) {
			preparedStatement.close();
			}

			
			} catch (SQLException e) {
				logger.error("sql error",e);
			}catch(Exception e){
				logger.error(ACTION_1,e);

			


			}

			}

			
			return flag;
		}

		
	

		@Override
		public int modifyService( ServiceDetail serviceDetail) throws TravelLineException {

			int flag=0;

			ResultSet resultSet = null;

			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement preparedStatement = null;
			try {
			preparedStatement = connection.prepareStatement("update service set busName=?,srFrom=? ,srTo=?,fare=? where serviceId=?" );


			preparedStatement.setString(1, serviceDetail.getServiceName());
			preparedStatement.setString(2, serviceDetail.getServiceFrom());
			preparedStatement.setString(3, serviceDetail.getServiceTo());
			preparedStatement.setDouble(4, serviceDetail.getServiceFare());
			preparedStatement.setInt(5,  serviceDetail.getServiceId());
			flag=preparedStatement.executeUpdate();
			if(flag>0){
				flag=1;
			}
			} catch (SQLException e) {

			logger.error(" SQL error", e);
			throw new TravelLineException("Some internal error with SQL"+e.getLocalizedMessage());
			} catch (Exception e) {

			logger.error("internal error", e);
			throw new TravelLineException("Some internal error");

			}

			finally {

			// close pstmt,connection,result set also
			try {
			
				if(resultSet!=null){
					resultSet.close();
				}
			if (preparedStatement != null) {
			preparedStatement.close();
			}

			
			} catch (SQLException e) {

				logger.error("sql error",e);


			}catch(Exception e){
				logger.error("internal error",e);

			}

			}

			return flag;
		}

		
		
		
		
		

		
	

	@Override
	public int addAdmin(AdminDetail adminDetail) throws TravelLineException {
		String s="Some internal error contact to admin";
		int i = 0;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			
			preparedStatement = connection.prepareStatement("insert into admin (adminName ,password) values(?,?)");
			preparedStatement.setString(1, adminDetail.getAdminName());
			preparedStatement.setString(2, adminDetail.getPassword());
			i = preparedStatement.executeUpdate();

			if (i > 0) {
				i = 1;
			}
		} catch (SQLException e) {
			logger.error("error with SQL", e);
			throw new TravelLineException(s);
		} catch (Exception exception) {

			logger.error("error with system", exception);
			throw new TravelLineException(s);

		}

		finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}

			} catch (SQLException e) {
				throw new TravelLineException(s);

			}

		}
		return i;
	}

	

	@Override
	public int doLogin(AdminDetail adminDetail) throws TravelLineException {
		int i = 0;
		String s="Some internal error contact to admin";
		Connection connection =ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection
					.prepareStatement("select adminName ,password  from admin where adminName=? and password=? ");
			preparedStatement.setString(1, adminDetail.getAdminName());

			preparedStatement.setString(2, adminDetail.getPassword());
			try(ResultSet resultSet = preparedStatement.executeQuery()){
			if (resultSet.next()) {
				i = 1;

			}
			}
		} catch (SQLException e) {
			logger.error("error with SQL", e);
			throw new TravelLineException(s);
		} catch (Exception exception) {

			logger.error("error with system", exception);
			throw new TravelLineException(s);

		}

		finally {

			try {
				if (preparedStatement!= null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new TravelLineException(s);

			}

		}
		return i;
	}

	@Override
	public String deleteService(AdminDetail adminDetail) throws TravelLineException {
		
		return null;
	}

	@Override
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException {
		
		return null;
	}

	@Override
	public List<ServiceDetail> viewSchedules() throws TravelLineException {
	
		String query ="select serviceId,srFrom,srTo,fare from service"; 

		ResultSet resultSet = null; 
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		List<ServiceDetail> list = new ArrayList<ServiceDetail>(); 
		try { 
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
		int serviceId = resultSet.getInt("serviceId");
		String srFrom = resultSet.getString("srFrom");
		String srTo = resultSet.getString("srTo");
		double fare = resultSet.getDouble("fare");
		ServiceDetail p=new ServiceDetail();
		p.setServiceId(serviceId);
		p.setServiceFrom(srFrom);
		p.setServiceTo(srTo);
		p.setServiceFare(fare);
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
	
		throw new TravelLineException(" error while closing a resource contact to admin");

		} catch (Exception e) {
	

		//logger.error("internal error", e);
		throw new TravelLineException("  contact to admin");

		}

		}

		// TODO Auto-generated method stub
		return list;	
		}

	}

