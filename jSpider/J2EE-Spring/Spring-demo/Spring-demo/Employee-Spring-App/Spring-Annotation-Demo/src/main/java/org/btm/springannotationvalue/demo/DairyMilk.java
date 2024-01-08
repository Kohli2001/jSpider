package org.btm.springannotationvalue.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "dairymilk") 
@Primary
public class DairyMilk implements choclate{

	@Override
	public void eat() {
		System.out.println("eating dairymilk choclate");
	}
	

}
