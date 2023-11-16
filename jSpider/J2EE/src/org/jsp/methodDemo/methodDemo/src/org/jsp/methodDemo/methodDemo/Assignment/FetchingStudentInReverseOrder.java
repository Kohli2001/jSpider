package org.jsp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingStudentInReverseOrder {
		public static void main(String[] args) {
			String qry = "select * from student order by id desc;";
			Connection con = null;
			Statement st = null; 
			ResultSet rs = null;
		
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo?user=root&password=tiger");
				st=con.createStatement();
				rs=st.executeQuery(qry);
				
				while(rs.next()) {
					
					System.out.println("Student id "+rs.getInt("id"));
					System.out.println("Student name "+rs.getString("name"));
					System.out.println("Student  Age "+rs.getInt(3));
					System.out.println("Phone Number "+rs.getLong(4));
					System.out.println("Percentage "+rs.getDouble(5));
					System.out.println("===============================");
			}
		}
			catch(SQLException e) {
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


