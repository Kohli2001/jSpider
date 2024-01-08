package org.btm.springannotationvalue.demo;

import org.springframework.stereotype.Component;

@Component(value = "munch")
public class Munch implements choclate{
	

	@Override
	public void eat() {
		System.out.println("Eating munch choclate");
	}
	
	

}
