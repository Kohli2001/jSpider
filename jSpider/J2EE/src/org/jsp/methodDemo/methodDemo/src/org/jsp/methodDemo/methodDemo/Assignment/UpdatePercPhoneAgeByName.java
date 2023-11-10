package org.jsp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePercPhoneAgeByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name to update");
		String name = sc.next();
		System.out.println("Enter percetage,phone and Age to update");
		double perc = sc.nextDouble();
		Long phone = sc.nextLong();
		int age = sc.nextInt();
		Connection con = null;
		PreparedStatement pst = null;
		
		String qry = "update student set perc=?,phone=?, age=? where name =?";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
			pst=con.prepareStatement(qry);
			pst.setDouble(1, perc);
			pst.setLong(2,phone);
			pst.setInt(3, age);
			pst.setString(4, name);
			pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connections closed...!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pst!=null) {
				try {
					pst.close();
					System.out.println("Prepared Satetments closed..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

		}
	}


}
