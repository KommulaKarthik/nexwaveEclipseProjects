package com.virtusa.travel_line.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.AdminDetail;
import com.virtusa.travel_line.model.FeedbackDetail;
import com.virtusa.travel_line.model.ServiceDetail;
import com.virtusa.travel_line.service.IAdmin;
import com.virtusa.travel_line.util.ConnectionUtil;




public class AdminDao implements IAdmin {

	public AdminDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	Logger logger = Logger.getLogger("AdminDao");

	@Override
	public int addService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		
		int flag=0;
		
		ResultSet resultSet = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = connection
				.prepareStatement("  ",Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, adminDetail.getAdminId());
		//preparedStatement.setString(2, adminDetail.getAdminName());
		//preparedStatement.setString(3, adminDetail.getPassword());
		preparedStatement.executeUpdate();
		resultSet = preparedStatement.getGeneratedKeys();
		if (resultSet.next()) {
			flag = 1;

		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//logger.error("error with SQL", e);
		throw new TravelLineException("Some internal error with SQL");
	} catch (Exception exception) {

		//logger.error("error with system", exception);
		throw new TravelLineException("Some internal error");

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
	public int modifyService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		int flag=0;
		
		ResultSet resultSet = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = connection
				.prepareStatement("  ",Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, adminDetail.getAdminId());
		//preparedStatement.setString(2, adminDetail.getAdminName());
		//preparedStatement.setString(3, adminDetail.getPassword());
		preparedStatement.executeUpdate();
		resultSet = preparedStatement.getGeneratedKeys();
		if (resultSet.next()) {
			flag = 1;

		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//logger.error("error with SQL", e);
		throw new TravelLineException("Some internal error with SQL");
	} catch (Exception exception) {

		//logger.error("error with system", exception);
		throw new TravelLineException("Some internal error");

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
	public int addAdmin(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		int flag=0;
		ResultSet resultSet= null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		String query="insert into admin (admin_id,admin_name,password) values(?,?,?)";
		
		try {
			preparedStatement = connection
					.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, adminDetail.getAdminId());
			preparedStatement.setString(2, adminDetail.getAdminName());

			preparedStatement.setString(3, adminDetail.getPassword());
			
			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				flag = 1;

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
				throw new TravelLineException(" error while closing a resource");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new TravelLineException("  some internal error");

			}

		}

		
		
		
		
		
		
		return flag;
		
	}

	@Override
	public int deleteService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		int flag=0;
ResultSet resultSet = null;
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
		preparedStatement = connection
				.prepareStatement("delete from admin where admin_id=? ",Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1, adminDetail.getAdminId());
		preparedStatement.executeUpdate();
		resultSet = preparedStatement.getGeneratedKeys();
		if (resultSet.next()) {
			flag = 1;

		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//logger.error("error with SQL", e);
		throw new TravelLineException("Some internal error with SQL");
	} catch (Exception exception) {

		//logger.error("error with system", exception);
		throw new TravelLineException("Some internal error");

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
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceDetail viewSchedules(ServiceDetail serviceDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doLogin(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		int flag = 0;
		Connection connection = com.virtusa.travel_line.util.ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection
					.prepareStatement(" ");
			preparedStatement.setString(1, adminDetail.getAdminName());

			preparedStatement.setString(2, adminDetail.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				flag = 1;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("error with SQL", e);
			throw new TravelLineException("Some internal error contact to admin");
		} catch (Exception exception) {

			logger.error("error with system", exception);
			throw new TravelLineException("Some internal error contact to admin");

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
				throw new TravelLineException(" error while closing a resource ");

			}

		}
		return flag;
	}

}
