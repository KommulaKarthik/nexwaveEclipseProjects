package com.virtusa.bank.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.virtusa.bank.exception.TooMuchDepositException;
import com.virtusa.bank.exception.TooMuchWithdrawlException;
import com.virtusa.bank.model.Account;

public class BankMain extends Object {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Account account= new Account(123456789L,3450);
		//Account bansalAccount= new Account(123456780L,345000);
		//Account nischayAccount= new Account(123456789L,345000);
		//boolean same=bansalAccount.equals(bansalAccount);
		//System.out.println("Same or not " +same);
		
		//Account account2=(Account)account.cloneAccount();
		//System.out.println(account2);
		//System.out.println(account);
		
		
			

		String[] data={"100001,50000,d,1000","100002,60000,d,2000","100001,50000,w,1000","100002,60000,w,2000","100004,650000,d,1000"};
		List<Account> list = BankMain.processData(data);
		System.out.println(list);
	}
	
	public static List getData(){
		String[] data={"100001,50000,d,1000","100002,60000,d,2000","100001,50000,w,1000","100002,60000,w,2000","100004,650000,d,1000"};
		List<Account> list = BankMain.processData(data);
		System.out.println(list);
		
		return list;
		
	}
		//split
		/*try{
		for(int i=0;i<data.length;i++){
		String temp=data[i];
		String arr[]=temp.split(",");
		long accountNumber1=Long.parseLong(arr[0]);
		float balance=Float.parseFloat(arr[1]);
		char transactionType1=arr[2].charAt(0);
		float transactionAmount1=Float.parseFloat(arr[3]);

		Account account1= new Account(balance,accountNumber1);
		Account[] accountArr= new Account[data.length];
		accountArr[i]=account;
		
		System.out.println(accountArr);
		System.out.println("Before sorting");
		for(int i1=0;i1<accountArr.length;i1++){
			System.out.println(accountArr[i1]);
			
		}
		//Arrays.sort(accountArr);
		ArrayList<Account> list = new ArrayList<Account>();
		list.add(account);
		
		Iterator<Account> iterator = list.iterator();
		while(iterator.hasNext()){
			Account newAccount = iterator.next();
			System.out.println(newAccount);
		}
		
		System.out.println("After sorting");
		for(int i1=0;i1<accountArr.length;i1++){
			System.out.println(accountArr[i1]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);

			}
			}

		
		//account1.transaction(transactionAmount1,transactionType1);
        account.transaction(2000000,'w');
		account.transaction(10000,'d');
		}catch(TooMuchDepositException td){
			System.out.println("Exception deposit " + td.getMessage());
			
		}catch(TooMuchWithdrawlException tw){
			System.out.println("Exception withdrawl " + tw.getMessage());
		}
		
			
		
		
		
	}

	@Override
	public String toString() {
		return "BankMain [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}*/
	static List<Account> processData(String[] data){
		List<Account> list = new Vector<Account>();
		for(int i=0;i<data.length;i++){
			String temp=data[i];
			String arr[]=temp.split(",");
			long accountNumber1=Long.parseLong(arr[0]);
			float balance=Float.parseFloat(arr[1]);
			char transactionType1=arr[2].charAt(0);
			float transactionAmount1=Float.parseFloat(arr[3]);

			Account account= new Account(balance,accountNumber1);
			Account[] accountArr= new Account[data.length];
			list.add(account);
		    System.out.println();
		
		
		
	}
		return list;

}
}
	
