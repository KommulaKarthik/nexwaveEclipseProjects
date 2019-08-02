package com.virtusa.bank.model;

import com.virtusa.bank.exception.TooMuchDepositException;
import com.virtusa.bank.exception.TooMuchWithdrawlException;

public class Account implements Cloneable,Comparable<Account> {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + Float.floatToIntBits(transactionAmount);
		result = prime * result + transactionType;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

	public Account cloneAccount() throws CloneNotSupportedException{
		return (Account) this.clone();
		
	}
	private float amount;
	private char transactionType;
	private float transactionAmount;
	private long accountNumber;
	private boolean isPreveledgedAccount;
	
	public boolean isPreveledgedAccount() {
		return isPreveledgedAccount;
	}

	public void setPreveledgedAccount(boolean isPreveledgedAccount) {
		this.isPreveledgedAccount = isPreveledgedAccount;
	}

	public Account(float amount, long accountNumber) {
		super();
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

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

	public Account(float amount, char transactionType, float transactionAmount, long accountNumber) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.accountNumber = accountNumber;
	}

	

	public void transaction(float transactionAmount,char transactionType) throws TooMuchWithdrawlException, TooMuchDepositException{
		if(transactionType=='W' || transactionType=='w'){
		withdraw(transactionAmount);
		}
		else if(transactionType=='D' || transactionType=='d'){
		deposit(transactionAmount);
		}
		}

		public String toString(){

		return "Account Number--"+this.accountNumber+"Balance"+this.amount;
		}
		
		public void deposit(float transactionAmount) throws TooMuchDepositException{
			if(transactionAmount>10000){
			throw new TooMuchDepositException("TooMuchDepositException");
			}
			else{
			System.out.println("The balance amount before deposit is " +amount);
			amount=amount+transactionAmount;
			System.out.println("The balance amount after deposit is " +(amount+(2*amount)/100));
			}
			}

			public void withdraw(float transactionAmount) throws TooMuchWithdrawlException {
				float chargedAmount=10.0f;
			if(transactionAmount>amount){
				throw new TooMuchWithdrawlException("TooMuchWithdrawlException");
			
			}
			else{
			amount=amount-transactionAmount;
			
			System.out.println("The balance amount after withdrawl is " +amount);
			}
			}

			@Override
			public int compareTo(Account o) {
				// TODO Auto-generated method stub
				/*int status=0;
				boolean flag=this.accountNumber<o.getAccountNumber();
				boolean flag1=this.accountNumber>o.getAccountNumber();
				
				if(flag){
					status=1;
				}else if(flag1){
					status=-1;
				}*/
				Long account1=Long.valueOf(this.accountNumber);
				Long account2=Long.valueOf(o.accountNumber);
				
				
				
				return account2.compareTo(account1);
			}
	
	

}
