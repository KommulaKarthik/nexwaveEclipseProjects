package com.virtusa.calculator.app;

import com.virtusa.calculator.Calculator;

public class Main {
	public static void main(String args[]){
		int a=10,b=0,result=0;
		int arr[] = new int[10];
		arr[0]=10;
		int brr[][] = new int[2][5];
		brr[0][0]=1;
		brr[0][1]=1;
		brr[0][2]=1;
		brr[0][3]=1;
		brr[0][4]=1;
		
		brr[1][0]=1;
		brr[1][1]=1;
		brr[1][2]=1;
		brr[1][3]=1;
		brr[1][4]=1;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<5;j++){
				System.out.println(brr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(arr[0]);
		Calculator calculator = new Calculator();
		//try{
		result=calculator.division(a, b);
		//}catch(ArithmeticException ae){
			//System.out.println(ae.getMessage());
		//}
		System.out.println("Division is " + result);
	}

}
