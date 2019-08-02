package com.virtusa.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.virtusa.bank.app.BankMain;
import com.virtusa.bank.model.Account;

public class FileReaderDemo {

	public FileReaderDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("d:\\sampledata.txt");
			bufferedReader = new BufferedReader(fileReader);
			// List<Account> list=BankMain.processData(data);
			// System.out.println(list);
			List<Account> list = new LinkedList<>();

			String data = "";
			while ((data = bufferedReader.readLine()) != null) {

				System.out.println(data);
				// Vector<Account> list=new Vector<>();

				// for(int i=0;i<data.length;i++){
				// String temp=data[i];

				String arr[] = data.split(",");
				long accountNo = Long.parseLong(arr[0]);
				FileWriter fileWriter=new FileWriter(accountNo+".txt",true);
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				Account account1=null;
                try{
				
				float balance = Float.parseFloat(arr[1]);
				char transactionType = arr[2].charAt(0);
				float transactionAmount = Float.parseFloat(arr[3]);
				 account1 = new Account(accountNo, balance);
				account1.transaction(transactionType, transactionAmount);
				
				bufferedWriter.write("Your account number is "+account1.getAccountNumber());
				bufferedWriter.newLine();
				bufferedWriter.write("Your Trasaction Amount is "+transactionAmount);
				bufferedWriter.newLine();
				bufferedWriter.write("Your Trasaction type is "+transactionType);
				bufferedWriter.newLine();
				bufferedWriter.write("Your Balance is "+(account1.getAmount()-transactionAmount));
				bufferedWriter.newLine();
                }catch (FileNotFoundException e) {
					// TODO: handle exception
                	System.out.println(e.getMessage());
				}catch (Exception e) {
					// TODO: handle exception
				}
                finally {
					
					if(bufferedWriter!=null){
						bufferedWriter.close();
						
					}
					
					
				}
				
				
				list.add(account1);
				// }

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not avaialble try after some time");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("som internal problem, try after some time");

					// e.printStackTrace();
				}

			}

		}

	}

}
