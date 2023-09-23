package looselyCoupled;

public class Garage {
	Car c1 = new Car();
	Bike b1 = new Bike();
	Bicycle b2 = new Bicycle();
	
	
	Vehicle getVehicle(int vType) {
		Vehicle v1 = null;
		
		
		switch(vType) {
		case 1: v1 = c1;
		break;
		
		case 2: v1 = b1;
		break;
		
		case 3: v1=b2;
		break;
		
		default :
			System.out.println("no Such vehicle");
		}
		return v1;
	}
	
	

}
