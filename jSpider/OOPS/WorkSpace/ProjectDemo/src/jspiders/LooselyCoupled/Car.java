package looselyCoupled;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("starting Car by key ");
		
	}

	@Override
	public void move() {
		System.out.println("chnage the gear and acceletors to move");
		
	}

	@Override
	public void stop() {
		System.out.println("chnage gear to neutral , and apply breks");
		
	}
	

}
