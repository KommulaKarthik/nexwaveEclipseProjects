package com.virtusa.bank.model;

public class BankAccount implements Cloneable {

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public String accNo = "";
	private double balance;
	public String holderName = "";

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
		if (amount <= 40000) {
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

	public void transaction(char type,
			double amount)/* 1 = withdraw, 2= deposit */ {
		System.out.println("for Account no: " + accNo + " Available balance is: " + balance);
		if (type == 'w' || type == 'W')
			withdraw(amount);
		else if (type == 'd' || type == 'D')
			deposit(amount);
	}
	
	/*public BankAccount cloneAccount()  {
		return (BankAccount)BankAccount.clone();
	}*/

}
