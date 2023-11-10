package org.jsp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecodeByPhone {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student phone to delete");
		Long phone = sc.nextLong();
		String qry = "delete from student where phone=?";
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "tiger");
			pst=con.prepareStatement(qry);
			pst.setLong(1, phone);
			int r = pst.executeUpdate();
			System.out.println(r + " rows deleted..");
			
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
