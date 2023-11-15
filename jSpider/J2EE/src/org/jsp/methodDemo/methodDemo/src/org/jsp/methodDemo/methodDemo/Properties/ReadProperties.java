package org.jsp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		Properties p = new Properties();
		FileInputStream fin = null;
		
		try {
			fin=new FileInputStream("C:\\Users\\hp\\Desktop\\jSpider\\J2EE\\LearningProperties\\JDBC.properties");
			p.load(fin);
			
			System.out.println(p.getProperty("driverclass"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
