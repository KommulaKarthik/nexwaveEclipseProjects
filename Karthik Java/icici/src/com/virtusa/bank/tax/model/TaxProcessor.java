package com.virtusa.bank.tax.model;

public class TaxProcessor {
	double taxAmount;

	public TaxProcessor() {
		// TODO Auto-generated constructor stub
	}
	public double processTax(Employee employee){
		if(employee.getAnnualIncome()==250000){
			taxAmount=0.0;
			
		}
		else if(employee.getAnnualIncome()>=250001 && employee.getAnnualIncome()<=500000){
			taxAmount=5*(employee.getAnnualIncome()-250000)/100;
		}
		else if(employee.getAnnualIncome()>=500001 && employee.getAnnualIncome()<=1000000){
			taxAmount=12500+(20*(employee.getAnnualIncome()-500000)/100);
		}
		else if(employee.getAnnualIncome()>=1000001 && employee.getAnnualIncome()<=500000){
			taxAmount=112500+(30*(employee.getAnnualIncome()-1000000)/100);
		}
		return taxAmount;
		
		
		
		
	}

}
