package org.jsp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class InsertingUsers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		System.out.println("Enter Your name");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Phone number");
		long phone =sc.nextLong();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Create Password");
		String pass =  sc.next();
		
		Properties p = new Properties();
		Connection con = null;
		PreparedStatement pst=null;
		FileInputStream fin=null;
		String qry = "insert into user values(?,?,?,?,?)";
		
		try {
			fin=new FileInputStream("C:\\Users\\hp\\Desktop\\jSpider\\J2EE\\LearningProperties\\JDBC.properties");
			p.load(fin);
			con=DriverManager.getConnection(p.getProperty("url"), p);
			pst=con.prepareStatement(qry);
			pst.setInt(1,id);
			pst.setString(2, name);
			pst.setLong(3, phone);
			pst.setString(4, email);
			pst.setString(5, pass);
			int r =pst.executeUpdate();
			System.out.println(r+ " rows Inserted");
			
		}
		catch(IOException|SQLException  e) {
			e.printStackTrace();
		}
		finally {
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(pst!=null) {
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(fin!=null) {
					try {
						fin.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
		}
	}

}
