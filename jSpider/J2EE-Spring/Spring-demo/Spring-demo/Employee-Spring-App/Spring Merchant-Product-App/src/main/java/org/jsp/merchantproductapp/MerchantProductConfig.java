package org.jsp.merchantproductapp;

import javax.persistence.EntityManager;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"org.jsp.merchantproductapp"})
public class MerchantProductConfig {

	@Bean
	public EntityManager geEntityManager() {
		
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	
	
}
