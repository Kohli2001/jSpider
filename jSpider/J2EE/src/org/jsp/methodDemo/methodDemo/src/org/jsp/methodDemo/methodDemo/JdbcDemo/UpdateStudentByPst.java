package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudentByPst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id to update");
		int id = sc.nextInt();
		System.out.println("Enter student name,age,phone,percentage to update");
		String name = sc.next();
		int age = sc.nextInt();
		Long phone = sc.nextLong();
		double perc = sc.nextDouble();
		
		String qry = "update student set name=?,age=?,phone=?,perc=? where id=?";
		
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
			pst=con.prepareStatement(qry);
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setLong(3, phone);
			pst.setDouble(4, perc);
			pst.setInt(5, id);
			int r = pst.executeUpdate();
			System.out.println(r+ "rows updated!");
			
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
