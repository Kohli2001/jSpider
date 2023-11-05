package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudents {
public static void main(String[] args) {
	String query="insert into student values(4,'sukhit',24,96313635467,68.2)";
	Connection con = null;
	Statement st= null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
		st=con.createStatement();
		int r = st.executeUpdate(query);
		System.out.println(r +"row inserted!..");
	} catch (ClassNotFoundException|SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(con!=null) {
			try {
				con.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
				System.out.println("statement closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}
