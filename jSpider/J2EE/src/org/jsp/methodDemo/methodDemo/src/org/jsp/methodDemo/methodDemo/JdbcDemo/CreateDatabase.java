package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) {
		String query ="create database jdbc_demo";
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "tiger");
			st=con.createStatement();
			boolean res=st.execute(query);
			System.out.println("DataBase Created");
			System.out.println(res);
		} catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
		}
		finally {
			
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connection Closed");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
					System.out.println("Statement Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}