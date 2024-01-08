package org.btm.springannotationvalue.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan (basePackages = "org.btm.springannotationvalue.demo")
public class Myconfiguration {

	@Bean
	@Primary
	public List<String> getList(){
		return new ArrayList<String>(Arrays.asList("kamlesh","Mohan","Krishna"));
	}
	@Bean
	public List<String> get2ndList(){
		return new ArrayList<String>(Arrays.asList("Hritik", "BIg b", "hrk"));
		
	}
}
