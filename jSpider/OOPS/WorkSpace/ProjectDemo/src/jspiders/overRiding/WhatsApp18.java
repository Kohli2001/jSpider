package overRiding;

public class WhatsApp18 extends WhatsApp16{
	
	void notification() {
		super.notification();
		System.out.println("Double Tick");
		
	}
	void message() {
		super.message();
		System.out.println("Image msg");
	}
	void call() {
		System.out.println("Voice call");
	}
	

}
