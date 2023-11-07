package org.jsp.factoryDesignPattern;

public class OlaFactory {
	
	public OLA getOla(String type) {
		if(type.equalsIgnoreCase("prime")) {
			return new Prime();
		}
		else if(type.equalsIgnoreCase("mini")) {
			return new Mini();
		}
		else if(type.equalsIgnoreCase("Auto")) {
			return new Auto();
		}
		else {
			return null;
		}
	}

}
