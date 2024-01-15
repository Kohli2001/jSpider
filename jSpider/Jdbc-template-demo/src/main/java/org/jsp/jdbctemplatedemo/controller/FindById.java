package org.jsp.jdbctemplatedemo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FindById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to fetch the User");
		int id = sc.nextInt();
		String qry = "select * from User where id=?";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate temp = context.getBean(JdbcTemplate.class);
		User u = temp.query(qry, new Object[] { id }, new UserSingleSetExtractor());
		if(u!=null) {
		System.out.println(u);
		}
		else
			System.out.println("Invalid user Id");
	}
}

class UserSingleSetIdExtractor implements ResultSetExtractor<User> {

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		User u = new User();
		while (rs.next()) {
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setPhone(rs.getLong(3));
			u.setPassword(rs.getString(4));

		}
		return u;
	}


	}
