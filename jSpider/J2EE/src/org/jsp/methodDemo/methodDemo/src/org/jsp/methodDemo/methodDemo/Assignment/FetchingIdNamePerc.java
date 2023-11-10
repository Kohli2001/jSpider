package org.jsp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingIdNamePerc {
	public static void main(String[] args) {
	
	String qry = "select id,name,perc from student";
	
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
		st=con.createStatement();
		rs=st.executeQuery(qry);
		
		while(rs.next()) {
			System.out.println("Student Id: " +rs.getInt("id"));
			System.out.println("Student Name: " +rs.getString("name"));
			System.out.println("Percentage :" +rs.getDouble("perc"));
			
			System.out.println("==============================");
		}
	}
	catch(SQLException e) {
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


