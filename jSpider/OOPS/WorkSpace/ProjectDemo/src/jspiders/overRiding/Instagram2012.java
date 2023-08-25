package overRiding;

public class Instagram2012 extends Instagram2010 {
	
	void netorking() {
		super.netorking();
		System.out.println("Unlimited");
	}
	void post() {
		super.post();
		System.out.println("Video Sharing");
		
	}
	void message() {
		super.message();
		System.out.println("Direct Messeging");
	}
	void filter() {
		System.out.println("Photos filtering");
	}

}
