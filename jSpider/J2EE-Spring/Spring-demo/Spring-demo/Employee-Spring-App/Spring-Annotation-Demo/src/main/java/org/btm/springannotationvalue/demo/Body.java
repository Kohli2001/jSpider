package org.btm.springannotationvalue.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Body {

	
	@Autowired
	@Qualifier(value = "dairymilk")
	private choclate ch;

	public choclate getCh() {
		return ch;
	}

	public void setCh(choclate ch) {
		this.ch = ch;
	}
	
	
}
