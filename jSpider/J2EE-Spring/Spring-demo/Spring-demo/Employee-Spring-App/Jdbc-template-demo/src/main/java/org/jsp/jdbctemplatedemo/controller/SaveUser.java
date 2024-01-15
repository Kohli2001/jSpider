package org.jsp.jdbctemplatedemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveUser {

	public static void main(String[] args) {
		String qry = "insert into User values(2,'kamlesh',887766,'kohli@2001')";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		int r = template.update(qry);
		System.out.println(r + " row inseted");
	}
}
