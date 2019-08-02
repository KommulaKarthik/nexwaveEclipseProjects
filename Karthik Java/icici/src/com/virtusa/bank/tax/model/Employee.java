package com.virtusa.bank.tax.model;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(float annualIncome) {
		super();
		this.annualIncome = annualIncome;
	}
	private long id;
	private String name;
	private int age;
	private String email;
	private float annualIncome;
	
	
	public Employee(long id, String name, int age, String email, float annualIncome) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.annualIncome = annualIncome;
	}
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(float annualIncome) {
		this.annualIncome = annualIncome;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String toString(){
		return name;
		
	}

}
