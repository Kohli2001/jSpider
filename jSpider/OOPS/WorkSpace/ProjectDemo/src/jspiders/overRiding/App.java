package overRiding;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhatsApp20 w1 = new WhatsApp20();
		System.out.println("=========Notification=======");
		w1.notification();
		System.out.println("=========Message=======");
		w1.message();
		System.out.println("=========Calls type=======");
		w1.call();
		System.out.println("=========status duration=======");
		w1.status();

	}

}
