package org.jsp.timestamp.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.timestamp.dto.User;
import org.jsp.timestamp.dto.UserId;

public class FindUserByPrimaryKey {

	public static void main(String[] args) {
		UserId id = new UserId();
		id.setEmail("kamlesh@gmail.com");
		id.setPhone(1239);
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		User u=  manager.find(User.class, id);
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.err.println("Invalid primary key(Email or Password)");
		}
		
	}
}
