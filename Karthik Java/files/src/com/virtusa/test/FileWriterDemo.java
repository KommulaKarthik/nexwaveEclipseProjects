package com.virtusa.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public FileWriterDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		try {
		
			
			fileWriter=new FileWriter("d:\\abc.txt",true);
		bufferedWriter=new BufferedWriter(fileWriter);
		
	    bufferedWriter.write("your name is khan");
		bufferedWriter.newLine();
		bufferedWriter.write("your name is khan");
		
		//bufferedWriter.write("My name is not khan");
		//fileWriter.write(67);
		//fileWriter.write(69);
		//fileWriter.write(68);
		//fileWriter.write(70);
		//fileWriter.write(71);
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(bufferedWriter!=null){
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					System.out.println("Some internal error with db");
				}
				
			}
			
			
			
		}
		
		
		
		
		
	}
	

}
