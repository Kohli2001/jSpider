package org.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMultipleStudent {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		String qry = "insert into student values(?,?,?,?,?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
			pst=con.prepareStatement(qry);
			//1st inserting values into the table 
			pst.setInt(1, 17);
			pst.setString(2, "AB Devilliers");
			pst.setInt(3, 31);
			pst.setLong(4, 374476487);
			pst.setDouble(5, 100.0);
			pst.execute();
			
			//2nd inserting values into the table 
			pst.setInt(1, 10);
			pst.setString(2, "KL Rahul");
			pst.setInt(3, 28);
			pst.setLong(4, 3744764677l);
			pst.setDouble(5, 60.0);
			pst.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
					System.out.println("Connections closed...!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pst!=null) {
				try {
					pst.close();
					System.out.println("Prepared Satetments closed..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

		}
	}

}
