package com.virtusa.bank.model;

public class BankAccount implements Cloneable {

	public String accNo = "";
	private double balance;
	public String holderName = "";
	CreditCard cc;
	public char accType;
	private int  privilage;

	public BankAccount(String accNo, double balance, String holderName, CreditCard cc, char accType, int privilage) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.holderName = holderName;
		this.cc = cc;
		this.accType = accType;
		this.privilage = privilage;
		if(accType == 'c') {
			cc.activeStatus=1;
		}
	}

	public BankAccount(String accNo, double balance, String holderName, CreditCard cc, char accType) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.holderName = holderName;
		this.cc = cc;
		this.accType = accType;
		if (accType == 'c') {
			cc.activeStatus = 1;
			
		} 
	}

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public BankAccount(String accNo, double balance, String holderName) {
		this.accNo = accNo;
		this.balance = balance;
		this.holderName = holderName;
	}

	public BankAccount(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private void deposit(double amount) {
		if (amount >= 100000) {
			System.out.println("2% interest added to your account on deposit of 100,000 updated balance: " + balance);
		} else if (amount <= 40000) {
			balance += amount;
			System.out.println(amount + " reupees deposited, updated balance is " + balance);
		} else {
			System.out.println("Cannot deposit more than 40,000 at a time, try entering a lesser figure ");
			System.exit(0);
		}
	}

	private void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdrawed sucessfully, updated balance is " + balance);
		} else
			System.out.println(" Insufficient funds in your account ");
	}

	public void transaction(char type, double amount)/* 1 = withdraw, 2= deposit */ {
		System.out.println("for Account no: " + accNo + " Available balance is: " + balance);
		if (type == 'w' || type == 'W')
			withdraw(amount);
		else if (type == 'd' || type == 'D')
			deposit(amount);
	}

	public int getPrivilage() {
		return privilage;
	}

	public void setPrivilage(int privilage) {
		this.privilage = privilage;
	}

	/*
	 * public BankAccount cloneAccount() { return
	 * (BankAccount)BankAccount.clone(); }
	 */

}
