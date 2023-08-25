package overRiding;

public class Instagram2018 extends Instagram2016 {
	
	void Stories() {
		System.out.println("15 sec ");
	}
	void live() {
		System.out.println("One to many");
	}
	void message() {
		super.message();
		System.out.println("Video chat ");
	}
	void stickers() {
		System.out.println(" Stories received interactive question stickers");
	}
	

}
