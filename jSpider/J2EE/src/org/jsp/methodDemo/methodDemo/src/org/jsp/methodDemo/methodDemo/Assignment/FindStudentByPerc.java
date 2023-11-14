package org.jsp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FindStudentByPerc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pst= null;
		ResultSet rs = null;
		System.out.println("Enter student percentage to fetch records");
		double perc = sc.nextDouble();
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root","tiger");
			pst=con.prepareStatement("select * from student where perc=?");
			pst.setDouble(1, perc);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				System.out.println("Student id: "+rs.getInt("id"));
				System.out.println("Stduent name "+rs.getString("name"));
				System.out.println("Age"+rs.getInt("age"));
				System.out.println("Phone Number"+rs.getLong("phone"));
				System.out.println("Percentage "+rs.getDouble("perc"));
				System.out.println("------------------------------------");
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection closed..");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pst!=null) {
				try {
					pst.close();
					System.out.println("Statements closed..");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(rs!=null) {
				try {
					rs.close();
					System.out.println("result set closed...");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}

	
	}
	

}
