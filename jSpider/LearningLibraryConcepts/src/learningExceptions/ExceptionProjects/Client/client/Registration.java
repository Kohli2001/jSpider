package jspider.client;

public class Registration {
	
	final private static ClientSide sc = new ClientSide();
	
	public void submit(String name, long phonenum, String email, String password, int age) {
		System.out.println("Registrating and submitting user data to server");
		User u1 = new User(name,phonenum,email,password,age);
		sc.sendData(u1);
	}

}
