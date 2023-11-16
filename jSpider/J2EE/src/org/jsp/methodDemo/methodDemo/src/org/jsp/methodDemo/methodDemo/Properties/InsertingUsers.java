package org.jsp.properties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class InsertingUsers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = sc.nextLine();
		System.out.println("Enter Phone number");
		long phone =sc.nextLong();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Create Password");
		String pass =  sc.next();
		
		int i=1;
		Connection con = null;
		PreparedStatement pst=null;
		String qry = "insert into user values(i++,?,?,?,?)";
	}

}
