package org.jsp.userapp.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class UserDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	//creating a non static block to initialize connection whenever the UserDao object created 
	
	{
		Properties p = new Properties();
		FileInputStream fin=null;
		try {
		fin=new  FileInputStream("C:\\Users\\hp\\Desktop\\jSpider\\J2EE\\LearningProperties\\JDBC.properties");
		p.load(fin);
		con=DriverManager.getConnection(p.getProperty("url"), p);
	}
		catch(IOException |SQLException e) {
			e.printStackTrace();
		}
	 finally {
		if (fin != null) {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	  }
	}
	//creating a method to insert the record to user table...
	public String saveUser(int id, String name, long phone, String email,String password) {
		String qry ="insert into user values(?,?,?,?,?);";
		try {
			pst=con.prepareStatement(qry);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setLong(3, phone);
			pst.setString(4, email);
			pst.setString(5, password);
			pst.executeUpdate();
			return "User Saved..!!";
		
		}
		catch(SQLException e) {
			return "Unable to save the user...";
		}
	}
	//creating a method to exit application or closing all the costly resources..
	
	public String exit() throws SQLException {
		if(con!=null) 
			con.close();
		if(pst!=null)
			pst.close();
		if(rs!=null)
			rs.close();
		
		return "Application Closed..!!!Thank You";
	}
}
