package cabPackage;

public class CabApp {
	public static void main(String[] args) {
		
		Cab c1 = new Cab("KA5002","9876543422","SUV","Yellow","MaxSize","x-axis","south","y-axis");
		
		System.out.println("====================Pickup Location========================");
		
		System.out.println("Pickup location: "+c1.getPickup().getDirection());
		System.out.println("Pickup location: "+c1.getPickup().getLatitude());
		System.out.println("Pickup location: "+c1.getPickup().getLongitude());
		
		System.out.println("====================Drop location===========================");
		c1.getDrop().setDirection("north");
		c1.getDrop().setLatitude("XY-axis");
		c1.getDrop().setLongitude("y-axis");
		
		System.out.println("Drop Location: "+c1.getDrop().getDirection());
		System.out.println("Drop Location: "+c1.getDrop().getLatitude());
		System.out.println("Drop Location: "+c1.getDrop().getLongitude());
		
	}

}
