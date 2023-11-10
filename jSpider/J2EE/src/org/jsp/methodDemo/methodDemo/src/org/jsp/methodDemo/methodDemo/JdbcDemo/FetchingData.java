package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingData {

	public static void main(String[] args) {
		
		
		String dql = "select * from student";
		String dml= "insert into student values(7,'Shashi',22,9631363565,98.2)";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo?user=root& password=tiger");
			st=con.createStatement();
			
			System.out.println(st.execute(dml)); //false
			System.out.println(st.getResultSet()); //null
			
			
			
			System.out.println(st.execute(dql));  //true
			System.out.println(st.getResultSet()); //object referance 
			
		} catch (ClassNotFoundException|SQLException e) {
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
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
