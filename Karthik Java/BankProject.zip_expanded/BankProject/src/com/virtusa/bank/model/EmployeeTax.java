package com.virtusa.bank.model;

public class EmployeeTax {
	public EmployeeTax(long empId, String empName, int age, double annualIncome, String email, Address addr, BankAccount acc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.annualIncome = annualIncome;
		this.email = email;
		this.addr = addr;
		this.acc = acc;
	}

	public long empId;
	public String empName;
	public int age;
	private double annualIncome;
	public String email;

	Address addr;
	BankAccount acc;

	public double getAnnualIncome() {
		return annualIncome;
	}

	public EmployeeTax(long empId, String empName, int age, double annualIncome, String email, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.annualIncome = annualIncome;
		this.email = email;
		this.addr = addr;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double taxCalc(int age, double annualIncome) {
		if(age<60)
			return taxCalculator(annualIncome);
		else 
			return taxCalcAbove60(annualIncome);
	}
	
	
	public double taxCalculator(double annualIncome) {
		double totalTax = 0;
		//this.annualIncome = annualIncome;
		if (annualIncome <= 250000)
			totalTax = 0;
		else if (250001 <= annualIncome && annualIncome <= 500000) {
			double temp = annualIncome - 250000;
			// System.out.println(temp);
			totalTax = temp * 5 / 100;
		} else if (500001 <= annualIncome && annualIncome <= 1000000) {
			double temp = annualIncome - 500000;
			// System.out.println(temp);
			totalTax = 12500 + (temp * 20 / 100);
		} else if (annualIncome > 1000000) {
			double temp = annualIncome - 1000000;
			// System.out.println(temp);
			totalTax = 112500 + (temp * 30 / 100);
		}
		return totalTax;

	}
	
	public double taxCalcAbove60(double annualIncome) {
		double sum;
		if(annualIncome<=300000)
			sum=0;
		else if(300000<annualIncome && annualIncome<=500000) 
			sum=annualIncome*5/100;
		else if(500000<annualIncome && annualIncome<=1000000)
			sum=10000+((annualIncome-500000)*20/100);
		else 
			sum=110000+((annualIncome-1000000)*30/100);
		
		return sum;
	}

	@Override
	public String toString() {
		return "EmployeeTax [empId=" + empId + ", empName=" + empName + ", age=" + age + ", annualIncome="
				+ annualIncome + ", email=" + email + ", addr=" + addr + taxCalculator(annualIncome) + "]";
	}
}
