package jspiders.p3;

public class MainClass1 {
	public static void main(String[] args) {
		
		System.out.println("================= TRUCK =====================");
		Truck t1 = new Truck();
		System.out.println(t1.name="Mahindra");
		System.out.println(t1.color="Red");
		System.out.println(t1.price=359800000.00);
		
		t1.startEngine();
		t1.stopEngine();
		
		System.out.println("================== CAR ====================");
		Car c1 = new Car();
		System.out.println(c1.name="Rolls-Royls");
		System.out.println(c1.color="White");
		System.out.println(c1.price=987654323456789098765432345678.00);
		c1.startEngine();
		c1.stopEngine();
		
		System.out.println("================= BIKE =====================");
		Bike b1 = new Bike();
		System.out.println(b1.name="Z900");
		System.out.println(b1.color="Blue");
		System.out.println(b1.price=1250000);
		
		b1.startEngine();
		b1.stopEngine();
		
	}

}
