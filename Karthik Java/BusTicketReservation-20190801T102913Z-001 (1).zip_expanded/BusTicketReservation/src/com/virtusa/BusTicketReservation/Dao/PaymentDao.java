package com.virtusa.BusTicketReservation.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.CreditCard;
import com.virtusa.BusTicketReservation.service.IPayment;
import com.virtusa.BusTicketReservation.util.ConnectionUtil;

public class PaymentDao implements IPayment {

	public PaymentDao() {
		// TODO Auto-generated constructor stub
	}
		Logger logger = Logger.getLogger("PaymentDao");

		@Override
		public int makePayment(CreditCard creditCard) throws TravelLineException {

			Connection connection = ConnectionUtil.getConnection();
			PreparedStatement stmt;

			int ret = 0;
			try {
				stmt = connection.prepareStatement(
						"INSERT INTO creditcard(holderName,cardNo,cvv,expiryDate) VALUES(?,?,?,?)",

						java.sql.Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, creditCard.getCreditCardHolderName());
				stmt.setInt(2, creditCard.getCreditCardNumber());
				stmt.setInt(3, creditCard.getCvvNumber());
				stmt.setDate(4, Date.valueOf(creditCard.getExpiryDate()));
				ret=stmt.executeUpdate();
				if (ret>0) 
				{
					ret = 1;
				}
			} catch (SQLException e) {
				throw new TravelLineException("Some internal error with SQL" + e.getLocalizedMessage());
			}

			return ret;
		}


	@Override
	public String cancelPayment() throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

}
