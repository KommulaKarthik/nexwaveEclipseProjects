package com.virtusa.calculator;

public class Calculator {
	public int division(int a,int b){
		int c=0;
		try{
			c=a/b;
			System.out.println("The division is done?");
		}catch(ArithmeticException e){
			
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Finally done");
		}
		return c;
	}

}
