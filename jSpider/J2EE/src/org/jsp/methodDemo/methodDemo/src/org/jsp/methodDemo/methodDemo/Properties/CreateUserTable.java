package org.jsp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CreateUserTable {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String qry = "create table User(id int not null ,"
				+ "name varchar(45) not null ,"
				+ "phone bigint(20) not null unique,"
				+ "email varchar(45) not null unique,"
				+ "password varchar(45) not null,"
				+ "primary key(id))";
		Properties p = new Properties();
		FileInputStream fin = null;
		
		try {
			
			fin=new FileInputStream("C:\\Users\\hp\\Desktop\\jSpider\\J2EE\\LearningProperties\\JDBC.properties");
			p.load(fin);
			Class.forName(p.getProperty("driverClass"));
			con=DriverManager.getConnection(p.getProperty("url"), p);
			st=con.createStatement();
			st.execute(qry);
		}
		catch(SQLException|IOException |ClassNotFoundException e) {
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
				if(st!=null) {
					try {
						st.close();
						System.out.println("Statements closed..");
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
				if(fin!=null) {
					try {
						fin.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		
			}
	}
}

