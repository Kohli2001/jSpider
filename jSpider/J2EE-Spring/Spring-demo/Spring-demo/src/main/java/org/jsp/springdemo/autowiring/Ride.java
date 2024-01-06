package org.jsp.springdemo.autowiring;

public class Ride {

	private Vehicle v;

	public Ride() {

	}

	public Ride(Vehicle v) {
		super();
		this.v = v;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

}
