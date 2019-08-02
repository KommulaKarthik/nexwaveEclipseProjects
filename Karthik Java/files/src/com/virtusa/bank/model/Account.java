package com.virtusa.bank.model;

public class Account implements Cloneable,Comparable<Account> {

	public Account() {
		// TODO Auto-generated constructor stub
	}


	
	
	@Override
	public int hashCode() {
		
		return (int) accountNumber;
	}




	@Override
	public boolean equals(Object obj) {
	
		Account other = (Account) obj;
		if (accountNumber == other.accountNumber)
			return true;
		else
			return false;
	
	}




	public Account cloneAccount() throws CloneNotSupportedException {
	return	(Account) this.clone();
		
	}
	
	
	public void transaction(char transactionType, float transactionAmount) {
		if (transactionType == 'W' || transactionType == 'w') {

			withdraw(transactionAmount);
		}
		if (transactionType == 'D' || transactionType == 'd') {
			deposit(transactionAmount);
		}
	}

	private void deposit(float transactionAmount) {
		System.out.println("" + accountNumber + "has balance amount  before deposit is " + amount);
		amount = amount + transactionAmount;
		System.out.println("" + accountNumber + "has balance amount  After deposit is " + amount);
	}

	private void withdraw(float transactionAmount) {
		System.out.println("" + accountNumber + "has balance amount  before withdrawal is " + amount);
		amount = amount - transactionAmount;
		System.out.println("" + accountNumber + "has balance amount  After withdrawal  is " + amount);
	}

	public Account(long accountNumber, float amount) {
		super();
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [amount=" + amount + ", accountNumber=" + accountNumber + "]";
	}

	public Account(float amount, char transactionType, long accountNumber) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
		this.accountNumber = accountNumber;
	}

	public Account(float amount, char transactionType, float transactionAmount, long accountNumber) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.accountNumber = accountNumber;
	}

	private float amount;
	private char transactionType;
	private float transactionAmount;
	private long accountNumber;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public char getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(char transactionType) {
		this.transactionType = transactionType;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}




	@Override
	public int compareTo(Account o) {
		/*int status=0;
		boolean flag=this.accountNumber<o.getAccountNumber();
		boolean flag2=this.accountNumber>o.getAccountNumber();
		
		if(flag){
			status=1;
		}else if(flag2){
			
			status=-1;
		}
*/		
	Long acc1=	Long.valueOf(this.accountNumber);
	
	Long acc2=	Long.valueOf(o.accountNumber);
			
		return acc2.compareTo(acc1);
		//return status;
		//return 0;
	}

}
