package org.jsp.springannotation.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"org.jsp.springannotation.demo"})
public class SessionFactoryConfiguration {
	
	@Bean
	public List<String> getList(){
		return new ArrayList<String>(Arrays.asList("user.hbm.xml", "merchant.hbm.xml"));
		
	}
	@Bean
	@Primary
	public Properties getHibernareProperties() {
		Properties p = new Properties();
		p.setProperty("hbm2ddl.auto", "update");
		p.setProperty("show_sql", "true");
		p.setProperty("format_sql", "true");
		p.setProperty("dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		return p;
	}
	
	
	
	
	
}
