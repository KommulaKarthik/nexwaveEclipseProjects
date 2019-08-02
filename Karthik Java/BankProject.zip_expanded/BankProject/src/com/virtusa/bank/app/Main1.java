package com.virtusa.bank.app;

import com.virtusa.bank.model.Address;
import com.virtusa.bank.model.BankAccount;
import com.virtusa.bank.model.CreditCard;
import com.virtusa.bank.model.EmployeeTax;

public class Main1 {

	public static void transaction(String accNo, char type, double amount) {
		BankAccount acc= new BankAccount(accNo,amount);
		acc.transaction(type, amount);
		
	}
	
	public static void main(String[] args) {
		Address addr = new Address("kwality heights", "motinagar", "pr nagar", "hyderabad", 500018);
		CreditCard cc = new CreditCard("123456789", 50000, 0, 0);
		BankAccount acc = new BankAccount("BNK123456", 10000, "krishna", cc, 'c');
		EmployeeTax emp1 = new EmployeeTax(1001, "Krishna", 65, 500000, "krishna@gmail.com", addr, acc);
		//transaction(acc.accNo, 'd', 100000);
		//cc.creditUsage(10000);
		System.out.println(emp1.taxCalc(emp1.age, emp1.getAnnualIncome()));
	}

}
