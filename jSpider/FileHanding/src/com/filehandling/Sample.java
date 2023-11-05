package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		File obj = new File("myFile.txt");
		Scanner sc = new Scanner(System.in);
		
		//create a file 
		try {
			obj.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//Write a file
		try {
			FileWriter write = new FileWriter(obj);
			
			System.out.println("Write your msg");
			String msg = sc.nextLine();
			write.write(msg);
			System.out.println(msg);
			write.close();
			System.out.println("Writing closed!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Read a file 
//		try {
//			Scanner sc1 = new Scanner(obj);
//			while(sc1.hasNext()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//				
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//delete the file
		
		if(obj.delete()) {
			System.out.println("File deleted..!");
		}
		else {
			System.out.println("Problem while deleting..");
		}
		
		System.out.println("Name of file " +obj.getName());
		System.out.println("Location/Path: " +obj.getAbsolutePath());
		System.out.println("length " +obj.length());
//		System.out.println();
	}
}
