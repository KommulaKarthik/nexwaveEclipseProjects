package com.virtusa.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public FileWriteDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		 FileOutputStream fileOutputStream=null;
		 BufferedOutputStream bufferedOutputStream = null;
		 
		 try {
			fileOutputStream=new FileOutputStream("d:\\sample.txt",true);
	bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
			//fileOutputStream.write(65);
			//fileOutputStream.write(66);
			//fileOutputStream.write(67);
			///fileOutputStream.write(68);
			//fileOutputStream.write(69);
			
	String text="my name is khan";
	
			
	bufferedOutputStream.write(text.getBytes());
			
			
			
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			 
	System.out.println("File is not avaialblr contact to admin");
		 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println("File internal problem contact to admin");
				
		}finally {
			
			if (bufferedOutputStream!=null) {
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					System.out.println("Error while closing the file");
					System.out.println(e.getMessage());
					
				
				
				
				}
			
			}
		}
		 
		
		
		
	}

	}
