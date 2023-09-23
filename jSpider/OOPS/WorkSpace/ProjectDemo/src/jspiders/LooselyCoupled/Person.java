package looselyCoupled;

public class Person {
	
	Vehicle v1;
	
	void decideVehicle(Vehicle v1) {
		this.v1 = v1;
	}
	
	void travel() {
		
		if(v1!=null) {
			System.out.println("travelling.......");
			
			v1.start();
			v1.move();
			v1.stop();
		}
	}

}
