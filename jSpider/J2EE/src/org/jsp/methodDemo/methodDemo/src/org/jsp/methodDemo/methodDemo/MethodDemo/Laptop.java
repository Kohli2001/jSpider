package org.jsp.methodDemo;

public class Laptop {
	
	private String brand;
	private String storage;
	private String ram;
	private double price;
	
	public Laptop(String brand, String storage, String ram, double price) {
		
		
		this.brand = brand;
		this.storage = storage;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
