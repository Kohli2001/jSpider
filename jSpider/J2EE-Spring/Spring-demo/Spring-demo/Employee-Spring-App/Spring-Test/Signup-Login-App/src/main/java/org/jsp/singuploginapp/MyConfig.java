package org.jsp.singuploginapp;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = { "org.jsp.singuploginapp"})
public class MyConfig {

	@Bean
	private EntityManager getEntityManager() {

		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	

}
