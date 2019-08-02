package com.virtusa.test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try{
			
			fileWriter = new FileWriter("d:\\sample.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			
			bufferedWriter.write("My name is Karthik");
			bufferedWriter.newLine();
			bufferedWriter.write("My name is Karthik");
			
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("File not available try after some time");
		} catch (IOException e) {
			System.out.println("Some internal error try after som time");
		}finally{
			if(bufferedWriter!=null){
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error while closing the file");
					System.out.println(e.getMessage());
				}
			}
			
		}

	}

}
