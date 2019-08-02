package com.virtusa.zomato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import com.virtusa.zomato.exception.ZomatoException;
import com.virtusa.zomato.model.CustomerDetail;
import com.virtusa.zomato.model.LoginDetail;
import com.virtusa.zomato.model.MenuDetail;
import com.virtusa.zomato.model.OrderDetail;
import com.virtusa.zomato.model.PaymentDetail;
import com.virtusa.zomato.model.RestaurantDetail;
import com.virtusa.zomato.model.RestaurantMenuDetail;
import com.virtusa.zomato.service.IZomato;
import com.virtusa.zomato.util.ConnectionUtil;

public class ZomatoDao implements IZomato {
	public ZomatoDao(){
		
	}

	Logger logger = Logger.getLogger("ZomatoDAO");
	@Override
	public int doLoginCheck(LoginDetail loginDetail) throws ZomatoException {
		// TODO Auto-generated method stub
		int flag = 0;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection
					.prepareStatement("select cu_email ,password  " + "from customer where cu_email=? and password=? ");
			preparedStatement.setString(1, loginDetail.getUsername());

			preparedStatement.setString(2, loginDetail.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				flag = 1;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("error with SQL", e);
			throw new ZomatoException("Some internal error contact to admin");
		} catch (Exception exception) {

			logger.error("error with system", exception);
			throw new ZomatoException("Some internal error contact to admin");

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
				throw new ZomatoException(" error while closing a resource contact to admin");

			}

		}
		return flag;
		
		
	}

	@Override
	public int registerCustomer(CustomerDetail customerDetail) throws ZomatoException {
		ResultSet resultSet = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int customerNo = 0;
		try {
			System.out.println(connection);
			preparedStatement = connection.prepareStatement(
					"insert into customer (cu_name,cu_address,cu_contact,cu_email,password) values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS

			);
			preparedStatement.setString(1, customerDetail.getCustomerName());
			preparedStatement.setString(2, customerDetail.getCustomerAddress());
			preparedStatement.setString(3, customerDetail.getCustomerContact());
			preparedStatement.setString(4, customerDetail.getCustomerEmail());
			preparedStatement.setString(5, customerDetail.getCustomerPassword());
		

			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {

				customerNo = resultSet.getInt(1);
				System.out.println(customerNo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("sql error", e);
			throw new ZomatoException(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("internal error", e);
			throw new ZomatoException(e.getMessage());
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
				throw new ZomatoException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new ZomatoException("  contact to admin");

			}

		}

		// TODO Auto-generated method stub
		return customerNo;
	}

	@Override
	public List<RestaurantMenuDetail> searchRestaurants(String text) throws ZomatoException {

		String query = "select * from restaurant r join menu m" + " join restarant_menu_detail md "
				+ " on r.re_id=md.rm_re_fk and m.me_id=md.rm_me_fk " + " where r.re_name like ? or m.me_name like ?  ";

		List<RestaurantMenuDetail> list=new ArrayList<>();
		ResultSet resultSet = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int customerNo=0;
		try {
			System.out.println(connection);
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "%" + text + "%");
			preparedStatement.setString(2, "%" + text + "%");
			resultSet = preparedStatement.executeQuery();
            
			while (resultSet.next()) {

				String menuName = resultSet.getString("me_name");
				float menuPrice = resultSet.getFloat("me_price");
				MenuDetail menuDetail = new MenuDetail();
				menuDetail.setMenuName(menuName);
				menuDetail.setMenuPrice(menuPrice);

				String restName = resultSet.getString("re_name");
				String restAddress = resultSet.getString("re_address");
				String restContact = resultSet.getString("re_contact");
				String restEmail = resultSet.getString("re_email");

				RestaurantDetail restaurant = new RestaurantDetail();

				restaurant.setRestaurantAddress(restAddress);
				restaurant.setRestaurantContact(restContact);
				restaurant.setRestaurantEmail(restEmail);

				restaurant.setRestaurantName(restName);

				RestaurantMenuDetail detail = new RestaurantMenuDetail();
                 detail.setMenuDetail(menuDetail);
                 detail.setRestaurantDetail(restaurant);
                 
                 System.out.println(detail);
                 list.add(detail);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("sql error", e);
			throw new ZomatoException(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("internal error", e);
			throw new ZomatoException(e.getMessage());
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
				throw new ZomatoException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new ZomatoException("contact to admin");

			}

		}

		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public int placeOrder(OrderDetail orderDetail) throws ZomatoException {
		ResultSet resultSet = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int customerNo = 0;
		String query="insert into orderdetail "
				+ "(or_re_fk,or_cu_fk,or_me_id,or_quantity,or_status,or_of_fk) values(?,?,?,?,?,?)";
		try {
			System.out.println(connection);
			preparedStatement = connection.prepareStatement(
					query,Statement.RETURN_GENERATED_KEYS

			);
			preparedStatement.setInt(1, orderDetail.getRestaurantDetail().getRestaurantId());
			preparedStatement.setInt(2,orderDetail.getCustomerDetail().getCustomerId());
			preparedStatement.setInt(3, orderDetail.getMenuDetail().getMenuId());
			preparedStatement.setInt(4, orderDetail.getOrderQuantity());
			preparedStatement.setString(5, orderDetail.getOrderStatus());
			preparedStatement.setInt(6, orderDetail.getOfferDetail().getOfferId());
			preparedStatement.executeUpdate();

			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {

				customerNo = resultSet.getInt(1);
				System.out.println(customerNo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("sql error", e);
			throw new ZomatoException(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("internal error", e);
			throw new ZomatoException(e.getMessage());
		}
//alter table orderdetail modify or_id int auto increment;
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
				throw new ZomatoException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new ZomatoException("  contact to admin");

			}

		}

		// TODO Auto-generated method stub
		return customerNo;
	}

	@Override
	public int doPayment(PaymentDetail paymentDetail) throws ZomatoException {
		ResultSet resultSet = null;
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		int customerNo = 0;
		String query="insert into payment "
				+ "(pa_type,pa_status,pa_or_fk,pa_cu_fk) values(?,?,?,?)";
		try {
			System.out.println(connection);
			preparedStatement = connection.prepareStatement(
					query,Statement.RETURN_GENERATED_KEYS

			);
			preparedStatement.setString(1, paymentDetail.getPaymentType());
			preparedStatement.setString(2,paymentDetail.getPaymentStatus());
			preparedStatement.setInt(3, paymentDetail.getOrderDetail().getOrderId());
			preparedStatement.setInt(4, paymentDetail.getCustomerDetail().getCustomerId());
			
			preparedStatement.executeUpdate();

			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {

				customerNo = resultSet.getInt(1);
				System.out.println(customerNo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.error("sql error", e);
			throw new ZomatoException(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("internal error", e);
			throw new ZomatoException(e.getMessage());
		}
//alter table orderdetail modify or_id int auto increment;
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
				throw new ZomatoException(" error while closing a resource contact to admin");

			} catch (Exception e) {
				// TODO: handle exception

				logger.error("internal error", e);
				throw new ZomatoException("  contact to admin");

			}

		}

		// TODO Auto-generated method stub
		return customerNo;
	}
	
	


}
