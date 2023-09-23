package looselyCoupled;

public class Bicycle implements Vehicle {

	@Override
	public void start() {
		System.out.println("starting Bicycle using peddling");
		
	}

	@Override
	public void move() {
		System.out.println("doing paddling to move..........");
		
	}

	@Override
	public void stop() {
		System.out.println("stop peddling and apply breaks to stop......");
		
	}
	

}
