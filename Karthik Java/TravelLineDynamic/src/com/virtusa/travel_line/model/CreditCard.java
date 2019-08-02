package com.virtusa.travel_line.model;

import java.sql.Date;

public class CreditCard {

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	private int creditCardNumber;
	private String creditCardHolderName;
	private int cvvNumber;
	private Date expiryDate;
	private double balance;
	public CreditCard(int creditCardNumber, String creditCardHolderName, int cvvNumber, Date expiryDate,
			double balance) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditCardHolderName = creditCardHolderName;
		this.cvvNumber = cvvNumber;
		this.expiryDate = expiryDate;
		this.balance = balance;
	}
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCreditCardHolderName() {
		return creditCardHolderName;
	}
	public void setCreditCardHolderName(String creditCardHolderName) {
		this.creditCardHolderName = creditCardHolderName;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((creditCardHolderName == null) ? 0 : creditCardHolderName.hashCode());
		result = prime * result + creditCardNumber;
		result = prime * result + cvvNumber;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (creditCardHolderName == null) {
			if (other.creditCardHolderName != null)
				return false;
		} else if (!creditCardHolderName.equals(other.creditCardHolderName))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (cvvNumber != other.cvvNumber)
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", creditCardHolderName=" + creditCardHolderName
				+ ", cvvNumber=" + cvvNumber + ", expiryDate=" + expiryDate + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
	

}
