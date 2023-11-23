package org.jsp.test.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.jsp.test.dto.Employee;

public class CreateTable {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst =null;
		FileInputStream fin= null;
		Properties p = new Properties();
		String qry = "create table Employee(id int not null, name varchar(45) not null, designation varchar(45) not null, salary decimal not null, email varchar(50) not null  unique, phone bigint(20) not null unique , password varchar(13) not null)";
		
		
		try {
			fin = new FileInputStream("C:\\Users\\hp\\Desktop\\Test\\JDBC file\\JDBC.properties");
			p.load(fin);
			Class.forName(p.getProperty("driverClass"));
			con=DriverManager.getConnection(p.getProperty("url"), p);
			pst=con.prepareStatement(qry);
			pst.execute();
			System.out.println("Table has created...!!");
		} catch (IOException |SQLException |ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


//-------------------------



//----------------------------

