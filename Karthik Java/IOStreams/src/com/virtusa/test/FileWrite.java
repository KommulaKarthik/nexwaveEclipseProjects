package com.virtusa.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	

	public FileWrite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		
		try{
			fileOutputStream = new FileOutputStream("D:\\outputfile.txt");
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			//fileOutputStream.write(65);
			//fileOutputStream.write(66);
			//fileOutputStream.write(67);
			//fileOutputStream.write(68);
			
			
			String text = " my name is karthik";
			
			bufferedOutputStream.write(text.getBytes());
			
			
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("File not available try after some time");
		} catch (IOException e) {
			System.out.println("Some internal error try after som time");
		}finally{
			if(bufferedOutputStream!=null){
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error while closing the file");
					System.out.println(e.getMessage());
				}
			}
			
		}


	}

}
