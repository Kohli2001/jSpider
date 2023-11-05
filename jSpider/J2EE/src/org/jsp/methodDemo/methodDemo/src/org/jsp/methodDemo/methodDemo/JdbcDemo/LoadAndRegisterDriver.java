package org.jsp.jdbcdemo;

public class LoadAndRegisterDriver {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //pass the fully quilifiedClassname --> packagename.classname
			System.out.println("Driver Class Loaded and Registered:");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
