package overRiding;

public class WhatsApp20  extends WhatsApp18{
	
	void notification() {
		super.notification();
		System.out.println("Blue Tick");
	}
	void message() {
		super.message();
		System.out.println("Video msg");
	}
	
	void call() {
		super.call();
		System.out.println("Video Call");
	}
	void status() {
		System.out.println("15 sec");
	}

}
