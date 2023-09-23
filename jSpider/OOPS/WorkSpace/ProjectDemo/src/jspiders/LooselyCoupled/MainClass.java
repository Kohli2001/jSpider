package looselyCoupled;

public class MainClass {
	public static void main(String[] args) {
		
		Garage g1 = new Garage();
		
		Person p1 = new Person();
		p1.decideVehicle(g1.getVehicle(2));
		p1.travel();
	}

}
