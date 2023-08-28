package overLoading;

public class FaceBook {
	
	void login(long phno, String pass) {
		if(phno==123456789 && pass=="abc@123") {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}
	void login(String email,String pass) {
		if(email=="abc@gmail.com"&&pass=="abc@123") {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Invalide Credentials");
		}
	}

}
