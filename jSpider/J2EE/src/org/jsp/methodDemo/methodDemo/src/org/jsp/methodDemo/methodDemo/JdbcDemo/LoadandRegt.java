package org.jsp.jdbcdemo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class LoadandRegt {
	public static void main(String[] args) {
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver class loaded and Registereed");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
