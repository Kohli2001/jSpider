package org.jsp.methodDemo;

public class PrintLaptopDetails {
	
	static void printDetails(Laptop p) {
		System.out.println("brand: "+p.getBrand());
		System.out.println("Storage: " +p.getStorage());
		System.out.println("RAM "+p.getRam());
		System.out.println("Price " +p.getPrice());
	}
	public static void main(String[] args) {
		Laptop l1 = new Laptop("hp", "512 SSD", "8Gb", 450000.00);
		Laptop l2 = new Laptop("Dell", "512 SSD", "16Gb", 550000.00);
		
		printDetails(l1);
		System.out.println("================================");
		printDetails(l2);
	}

}
