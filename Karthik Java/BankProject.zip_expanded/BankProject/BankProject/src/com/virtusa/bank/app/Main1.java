package com.virtusa.bank.app;

import com.virtusa.bank.model.BankAccount;

public class Main1 {

	public static void main(String[] args) {
		String[] data = { "1001,5000,d,1000", "1002,6000,d,2000", "1001,5000,w,1000", "1002,4000,w,1000" };
		for (int i = 0; i < data.length; i++) {
			System.out.println();
			String[] temp = data[i].split(",");
			String accNo = temp[0];
			double balance = Double.parseDouble(temp[1]);
			char type = temp[2].charAt(0);
			double amount = Double.parseDouble(temp[3]);
			System.out.println(" For tnx " + (i + 1) + " Account no (" + accNo + ")");
			BankAccount acc = new BankAccount(accNo, balance);
			acc.transaction(type, amount);

		}

	}
}
