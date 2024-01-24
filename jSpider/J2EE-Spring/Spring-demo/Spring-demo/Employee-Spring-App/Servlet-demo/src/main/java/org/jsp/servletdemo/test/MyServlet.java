package org.jsp.servletdemo.test;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet  extends GenericServlet{
	
	
	public void service(ServletRequest req , ServletResponse resp ) {
		System.out.println("============Welcome to The servlet World=========");
	}

}
