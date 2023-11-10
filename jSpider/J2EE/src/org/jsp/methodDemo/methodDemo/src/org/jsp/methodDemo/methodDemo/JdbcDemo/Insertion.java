package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {
	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		String qry = "Create database Try";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "tiger");
			st=con.createStatement();
			int r = st.executeUpdate(qry);
			System.out.println( r+ "row inserted..!");
			
		} catch (ClassNotFoundException |SQLException e) {
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
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
