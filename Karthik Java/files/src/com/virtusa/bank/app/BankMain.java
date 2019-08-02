package com.virtusa.bank.app;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.virtusa.bank.model.Account;

public class BankMain {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Account> getData(){
		String[] data={"100001,50000,d,1000","100002,60000,d,2000"
				,"100001,50000,w,1000","100002,50000,w,1000","100004,650000,d,1000"};
		List<Account>	list	=BankMain.processData(data);
				System.out.println(list);
		
		return list;
	}
	

	public static List<Account> processData(String data[]){
		List<Account> list=new LinkedList<>();
		//Vector<Account> list=new Vector<>();
		
		for(int i=0;i<data.length;i++){
			String temp=data[i];
			String arr[]=  temp.split(",");
			long accountNo=Long.parseLong(arr[0]);
			float balance=Float.parseFloat(arr[1]);
			char transactionType=arr[2].charAt(0);        
			float transactionAmount=Float.parseFloat(arr[3]);
			Account account1=new Account(accountNo,balance);
			account1.transaction(transactionType,transactionAmount);
			 list.add(account1);
			}

		return list;
	
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Account account=new Account(123456789L,345000);
		
		System.out.println(account.hashCode());
		Account bansalAccount=new Account(123456780L,345000);
		Account nischayAccount=new Account(123456789L,345000);
		
		
	boolean same=	bansalAccount.equals(nischayAccount);
		System.out.println("Same or not"+same);
		
	Account account2=	(Account) account.cloneAccount();
	System.out.println(account2);
		System.out.println(account);
		account.transaction('w',1000);
		account.transaction('d',10000);

		String[] data={"100001,50000,d,1000","100002,60000,d,2000","100001,50000,w,1000","100002,50000,w,1000","100004,650000,d,1000"};
List<Account>	list=BankMain.processData(data);
		System.out.println(list);
		
		
		// split

    /*    Account accountArr[]=new Account[data.length];
        
		for(int i=0;i<data.length;i++){
		String temp=data[i];
		String arr[]=  temp.split(",");
		long accountNo=Long.parseLong(arr[0]);
		float balance=Float.parseFloat(arr[1]);
		char transactionType=arr[2].charAt(0);        
		float transactionAmount=Float.parseFloat(arr[3]);
		Account account1=new Account(accountNo,balance);
		account1.transaction(transactionType,transactionAmount);

		  accountArr[i]=account1;

		}

		System.out.println(accountArr);
		System.out.println("Before sorting");
		for (int i = 0; i < accountArr.length; i++) {
			System.out.println(accountArr[i]);
		}
		//4458458708
		Arrays.sort(accountArr);
		
		System.out.println("After sorting");
		for (int i = 0; i < accountArr.length; i++) {
			System.out.println(accountArr[i]);
		}

*/	}

}
