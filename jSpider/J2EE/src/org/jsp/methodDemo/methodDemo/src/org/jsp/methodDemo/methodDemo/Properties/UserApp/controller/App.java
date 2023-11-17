package org.jsp.userapp.controller;

import java.sql.SQLException;
import java.util.Scanner;
import org.jsp.userapp.dao.UserDao;

public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDao dao = new UserDao();
		boolean flag = true;
		while(flag) {
			System.out.println("========Please select your choice==========");
			System.out.println("1.Save User");
			System.out.println("2.Update User");
			System.out.println("3.Verify User by email and password");
			System.out.println("4.Verify User by phone and password");
			System.out.println("5.Find user By Id");
			System.out.println("6.delete User By Id");
			System.out.println("7.Exit");
			
			switch (sc.nextInt()) {
			
			case 1:{
				System.out.println("Enter the use id,name,phone,email and password to save user");
				int id = sc.nextInt();
				String name = sc.nextLine();
				long phone = sc.nextLong();
				String email = sc.next();
				String password = sc.next();
				String message = dao.saveUser(id, name, phone, email, password);
				System.out.println(message);
				break;
			}
			case 7: {
				flag = false;
				try {
					System.out.println(dao.exit());
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
			default:
				System.out.println("Invalid choice...Open Your Eyes please!!!");
				break;
			}
			
			
		}
	}

}
