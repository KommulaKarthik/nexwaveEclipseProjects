package com.virtusa.bank.model;

public class CreditCard {

	public CreditCard(String ccNo, double ccLimit, int activeStatus, double rewardPoints) {
		super();
		this.ccNo = ccNo;
		this.ccLimit = ccLimit;
		this.activeStatus = activeStatus;
		this.rewardPoints = rewardPoints;
	}

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	private String ccNo;
	private double ccLimit;
	public int activeStatus;
	private double rewardPoints;

	public String getCcNo() {
		return ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public double getCcLimit() {
		return ccLimit;
	}

	public void setCcLimit(double ccLimit) {
		this.ccLimit = ccLimit;
	}

	public int isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public double getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public void creditUsage(double amount) {
		if (amount <= ccLimit) {
			System.out.println("credit utilised: " + amount + " available credit " + ccLimit
					+ " credit points scored for transaction: " + (amount / 100));
			rewardPoints+=amount/100;
		} else {
			System.out.println(" unavailable credit limit!");
			System.exit(0);
		}
	}

}
