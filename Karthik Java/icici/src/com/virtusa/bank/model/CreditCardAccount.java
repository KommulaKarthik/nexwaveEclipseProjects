package com.virtusa.bank.model;

public class CreditCardAccount extends Account  {

	public CreditCardAccount() {
		// TODO Auto-generated constructor stub
	}
	private long creditCardNumber;
	private String creditCardHolderName;
	private boolean creditCardStatus;
	private int totalRewardPoints;
	private float limitAmount;
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCreditCardHolderName() {
		return creditCardHolderName;
	}
	public void setCreditCardHolderName(String creditCardHolderName) {
		this.creditCardHolderName = creditCardHolderName;
	}
	public boolean isCreditCardStatus() {
		return creditCardStatus;
	}
	public void setCreditCardStatus(boolean creditCardStatus) {
		this.creditCardStatus = creditCardStatus;
	}
	public int getTotalRewardPoints() {
		return totalRewardPoints;
	}
	public void setTotalRewardPoints(int totalRewardPoints) {
		this.totalRewardPoints = totalRewardPoints;
	}
	public float getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(float limitAmount) {
		this.limitAmount = limitAmount;
	}
	public CreditCardAccount(long creditCardNumber, String creditCardHolderName, boolean creditCardStatus,
			int totalRewardPoints, float limitAmount) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditCardHolderName = creditCardHolderName;
		this.creditCardStatus = creditCardStatus;
		this.totalRewardPoints = totalRewardPoints;
		this.limitAmount = limitAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((creditCardHolderName == null) ? 0 : creditCardHolderName.hashCode());
		result = prime * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + (creditCardStatus ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(limitAmount);
		result = prime * result + totalRewardPoints;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCardAccount other = (CreditCardAccount) obj;
		if (creditCardHolderName == null) {
			if (other.creditCardHolderName != null)
				return false;
		} else if (!creditCardHolderName.equals(other.creditCardHolderName))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (creditCardStatus != other.creditCardStatus)
			return false;
		if (Float.floatToIntBits(limitAmount) != Float.floatToIntBits(other.limitAmount))
			return false;
		if (totalRewardPoints != other.totalRewardPoints)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CreditCardAccount [creditCardNumber=" + creditCardNumber + ", creditCardHolderName="
				+ creditCardHolderName + ", creditCardStatus=" + creditCardStatus + ", rewardPoints=" + totalRewardPoints
				+ ", limitAmount=" + limitAmount + "]";
	}
	
	

}
