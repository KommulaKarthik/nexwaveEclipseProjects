package com.virtusa.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	

	public FileRead() {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		
		try{
			fileInputStream = new FileInputStream("D:\\inputfile.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			byte arr[] = new byte[100];
			
			
			while((bufferedInputStream.read(arr))!=-1){
				//System.out.println(arr);
				
				for(int i= 0 ;i<arr.length;i++){
					System.out.println(""+(char)arr[i]);
				}
				System.out.println("Buffer is full");
			}
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("File not available try after some time");
		} catch (IOException e) {
			System.out.println("Some internal error try after som time");
		}finally{
			if(bufferedInputStream!=null){
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error while closing the file");
					System.out.println(e.getMessage());
				}
			}
			
		}

	}

}
