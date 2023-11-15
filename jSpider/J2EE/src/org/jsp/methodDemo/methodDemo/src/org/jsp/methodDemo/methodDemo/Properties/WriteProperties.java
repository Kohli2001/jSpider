package org.jsp.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	
	public static void main(String[] args) {
		
		Properties p = new Properties();
		FileOutputStream fout= null;
		p.setProperty("driverClass", "com.mysql.cj.jdbc.Driver");
		p.setProperty("url", "jdbc:mysql://localhost:3306/jdbc_demo");
		p.setProperty("user", "root");
		p.setProperty("password", "tiger");
		
		try {
			fout= new FileOutputStream("C:\\Users\\hp\\Desktop\\jSpider\\J2EE\\LearningProperties\\JDBC.properties");
			p.store(fout, "adding file into jdbc properties");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
