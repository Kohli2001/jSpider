package overLoading;

public class FacebookApp {
	public static void main(String[] args) {
		FaceBook f1 = new FaceBook();
		f1.login(123456789, "abc@123");
		f1.login(123456789, "abgsc");
		
		f1.login("abc@gmail.com", "abc@123");
	}

}
