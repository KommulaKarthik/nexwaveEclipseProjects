package com.virtusa.test;

import java.awt.BufferCapabilities.FlipContents;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public FileReadDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		BufferedInputStream bufferedInputStream=null;
		
		try {
			 fileInputStream=new FileInputStream("d:\\nio.txt");
		     bufferedInputStream=new BufferedInputStream(fileInputStream);
			 
			 
		byte[] arr=new byte[100]; 
			 
			int ch=0; 
		while(	(bufferedInputStream.read(arr))!=-1){
			//System.out.print(arr);
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print((char)arr[i]);
			}
			System.out.println("Buffer is full");
			
		}
			 
			 
	 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("File not available try after some time");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Some internal error try after some time");
			
			//	e.printStackTrace();
		}finally{
			if (bufferedInputStream!=null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					System.out.println("Error while closing the file");
					System.out.println(e.getMessage());
					
				
				
				
				}
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
