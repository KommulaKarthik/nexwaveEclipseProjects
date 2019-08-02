package com.virtusa.bank.tax.app;

import com.virtusa.bank.tax.model.Address;
import com.virtusa.bank.tax.model.Employee;
import com.virtusa.bank.tax.model.TaxProcessor;

public class EmployeeMain {

	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		String[] data={"1,'Karthik',21,'karthik@gmail.com',600000.24f,'27-16/1','Beside Krupa Complex','Indira Nagar','Hyderabad',500058","2,'Ramesh',20,'ramesh@gmail.com',723090.54f,'25-17/12','Beside Arjun Apartment','L.B Nagar','Secunderabad',500057","3,'Mohan',25,'mohan@gmail.com',1200782.47f,'24-15/1','Beside Cinemax Mall','Moti Nagar','Vizag',500052","4,'Suresh',24,'suresh@gmail.com',845000.74f,'24-16/1','Beside Arjun Apartment','NTr Nagar','Guntur',500068","5,'Rajesh',22,'rajesh@gmail.com',957600.38f,'24-15/1','Beside Taj Deccan','MB Nagar','Vijayawada',500074","6,'Aryan',27,'aryan@gmail.com',248000.84f,'23-14/1','Beside Hotel Anand','Jawahar Nagar','Nellore',500038"};
		for(int i=0;i<data.length;i++){
		String temp=data[i];
		String arr[]=temp.split(",");

		double tAmount;
		long id1=Long.parseLong(arr[0]);
		String name1=arr[1];
		int age1=Integer.parseInt(arr[2]);
		String email1=arr[3];
		float annualIncome1=Float.parseFloat(arr[4]);
		String addressLine1=arr[5];
		String addressLine2=arr[6];
		String street1=arr[7];
		String city1=arr[8];
		long pincode1=Long.parseLong(arr[9]);

		Address address = new Address(addressLine1,addressLine2,street1,city1,pincode1);
		Employee employee1 = new Employee(id1,name1,age1,email1,annualIncome1);
		Employee employee2 = new Employee(annualIncome1);
		TaxProcessor taxProcessor = new TaxProcessor();
		tAmount=taxProcessor.processTax(employee2);
		System.out.println("Tax Amount to be paid is " +tAmount);
		for(int j=0;j<arr.length;j++){
		System.out.println(arr[j]);

		}
}

	}
}
