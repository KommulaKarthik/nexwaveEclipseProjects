package com.virtusa.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.bank.model.Account;

public class FileReaderDemo {

	
	static Logger logger = Logger.getLogger(FileReaderDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fileReader = null;
		BufferedReader bufferedReader =null;
		
		
		try{
			
			fileReader = new FileReader("d:\\sampledata.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			List<Account> list = new LinkedList<Account>();
			logger.info("List is created");
			String data=" ";
			while((data=bufferedReader.readLine())!=null){
				System.out.println(data);
				
				Account account1=null;
				String arr[]=data.split(",");
				long accountNumber1=Long.parseLong(arr[0]);
				FileWriter fileWriter = new FileWriter(accountNumber1+".txt",true);
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				try{
				
				float balance=Float.parseFloat(arr[1]);
				char transactionType1=arr[2].charAt(0);
				float transactionAmount1=Float.parseFloat(arr[3]);

				account1= new Account(balance,accountNumber1);
				account1.transaction(transactionAmount1, transactionType1);
				
				logger.info("Writing started");
				bufferedWriter.write("Your account number is "+account1.getAccountNumber());
				bufferedWriter.newLine();
				bufferedWriter.write("Your Trasaction Amount is "+transactionAmount1);
				bufferedWriter.newLine();
				bufferedWriter.write("Your Trasaction type is "+transactionType1);
				bufferedWriter.newLine();
				bufferedWriter.write("Your Balance is "+(account1.getAmount()-transactionAmount1));
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
					
					
					
					// }
				list.add(account1);

				}
			
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("File not available try after some time");
			logger.error("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bufferedReader!=null){
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Some internal error try after some time");
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
