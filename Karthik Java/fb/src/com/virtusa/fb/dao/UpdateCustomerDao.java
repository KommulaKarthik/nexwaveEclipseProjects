package com.virtusa.fb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.fb.exception.FacebookException;
import com.virtusa.fb.model.CustomerDetail;
import com.virtusa.fb.util.ConnectionUtil;

public class UpdateCustomerDao {

	public UpdateCustomerDao() {
		// TODO Auto-generated constructor stub
	}
	
	static Logger logger=Logger.getLogger("updatecustomerdao");

	


public int	updateCustomerDetailsById( CustomerDetail customerDetail) throws FacebookException{
		

	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	PreparedStatement preparedStatement = null;
	int flag = 0;
	try {
		System.out.println(connection);
		preparedStatement = connection.prepareStatement(
				"update customer set "
				+ "cu_name=?"
				+ ",cu_address=?, cu_contact=?, cu_email=?"
				+ ",password=?,gender=?,country=?,state=?,city=?"
				+ " where cu_id=?");

		
		preparedStatement.setString(1, customerDetail.getCustomerName());
		preparedStatement.setString(2, customerDetail.getCustomerAddress());
		preparedStatement.setString(3, customerDetail.getCustomerContact());
		preparedStatement.setString(4, customerDetail.getCustomerEmail());
		preparedStatement.setString(5, customerDetail.getPassword());
		preparedStatement.setString(6, customerDetail.getGender()+"");
		preparedStatement.setString(7, customerDetail.getCountry());
		preparedStatement.setString(8, customerDetail.getState());
		preparedStatement.setString(9, customerDetail.getCity());
		preparedStatement.setInt(10, customerDetail.getCustomerId());
		flag = preparedStatement.executeUpdate();
		
		
		
	
		

		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		logger.error("sql error", e);
		throw new FacebookException(e.getMessage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error("internal error", e);
		throw new FacebookException(e.getMessage());
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
			throw new FacebookException(" error while closing a resource contact to admin");

		} catch (Exception e) {
			// TODO: handle exception

			logger.error("internal error", e);
			throw new FacebookException("  contact to admin");

		}
	
	}
return flag;	
}

	

public CustomerDetail	getCustomerDetailsById(int cid) throws FacebookException{
		

  CustomerDetail customerDetail=new CustomerDetail();
	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	PreparedStatement preparedStatement = null;
	int customerNo = 0;
	try {
		System.out.println(connection);
		preparedStatement = connection.prepareStatement("select * from customer where cu_id=?");

		preparedStatement.setInt(1, cid);
		resultSet = preparedStatement.executeQuery();
		
		
		
		
		
		
		if (resultSet.next()) {
			
		int custId=	resultSet.getInt("cu_id");
		String name=	resultSet.getString("cu_name");
		String address=	resultSet.getString("cu_address");
		String contact=	resultSet.getString("cu_contact");
		String email=	resultSet.getString("cu_email");
		String password=	resultSet.getString("password");
		String gender=	resultSet.getString("gender");
		String country=	resultSet.getString("country");
		String state=	resultSet.getString("state");
		String city=	resultSet.getString("city");
		
		customerDetail.setCustomerId(cid);
		
		customerDetail.setCustomerName(name);
customerDetail.setCity(city);
customerDetail.setCountry(country);

customerDetail.setCustomerAddress(address);
customerDetail.setCustomerContact(contact);
customerDetail.setCustomerEmail(email);

customerDetail.setGender(gender.charAt(0));
customerDetail.setPassword(password);
customerDetail.setState(state);


		}

		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		logger.error("sql error", e);
		throw new FacebookException(e.getMessage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error("internal error", e);
		throw new FacebookException(e.getMessage());
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
			throw new FacebookException(" error while closing a resource contact to admin");

		} catch (Exception e) {
			// TODO: handle exception

			logger.error("internal error", e);
			throw new FacebookException("  contact to admin");

		}
	
	}
return customerDetail;	
}


	
	
	
public List<CustomerDetail>	viewCustomerDetails() throws FacebookException{
		

     List<CustomerDetail> list=new ArrayList<>();		

	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	PreparedStatement preparedStatement = null;
	int customerNo = 0;
	try {
		System.out.println(connection);
		preparedStatement = connection.prepareStatement("select * from customer");

		
		resultSet = preparedStatement.executeQuery();
		
		
		
		
		
		
		while (resultSet.next()) {
			
		int cid=	resultSet.getInt("cu_id");
		String name=	resultSet.getString("cu_name");
		String address=	resultSet.getString("cu_address");
		String contact=	resultSet.getString("cu_contact");
		String email=	resultSet.getString("cu_email");
		String password=	resultSet.getString("password");
		String gender=	resultSet.getString("gender");
		String country=	resultSet.getString("country");
		String state=	resultSet.getString("state");
		String city=	resultSet.getString("city");
		CustomerDetail customerDetail=new CustomerDetail();
		customerDetail.setCustomerId(cid);
		
		customerDetail.setCustomerName(name);
customerDetail.setCity(city);
customerDetail.setCountry(country);

customerDetail.setCustomerAddress(address);
customerDetail.setCustomerContact(contact);
customerDetail.setCustomerEmail(email);

customerDetail.setGender(gender.charAt(0));
customerDetail.setPassword(password);
customerDetail.setState(state);

list.add(customerDetail);

		}

		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		logger.error("sql error", e);
		throw new FacebookException(e.getMessage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.error("internal error", e);
		throw new FacebookException(e.getMessage());
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
			throw new FacebookException(" error while closing a resource contact to admin");

		} catch (Exception e) {
			// TODO: handle exception

			logger.error("internal error", e);
			throw new FacebookException("  contact to admin");

		}
	
	}
return list;	
}

}
