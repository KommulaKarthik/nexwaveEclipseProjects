package com.virtusa.bank.app;

import com.virtusa.bank.model.Address;
import com.virtusa.bank.model.EmployeeTax;

public class MainTax {

	public static void main(String[] args) {
		String[] data = {
				"1001,krishna,25,300000,krishnateja@gmail.com,kwalityheights,motinagar,PRnagar,hyderabad,500018",
				"1002,saikiran,24,1000000,saikiran@gmail.com,market,bowenpally,secunderabad,hyderabad,500024" };
		for (int i = 0; i < data.length; i++) {
			String[] temp = data[i].split(",");
			long empId = Long.parseLong(temp[0]);
			String empName = temp[1];
			int age = Integer.parseInt(temp[2]);
			double annualIncome = Double.parseDouble(temp[3]);
			String email = temp[4];

			String addressLine1 = temp[5];
			String addressLine2 = temp[6];
			String locality = temp[7];
			String city = temp[8];
			long pincode = Long.parseLong(temp[9]);

			Address addr = new Address(addressLine1, addressLine2, locality, city, pincode);
			EmployeeTax emp = new EmployeeTax(empId, empName, age, annualIncome, email, addr);
			System.out.println();
			System.out.println();
			System.out.println(emp);
			System.out.println(" For empId: " + empId + "Tax is: ");
			System.out.println(emp.taxCalculator(annualIncome));
		}
	}

}
