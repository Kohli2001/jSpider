package jspider.server;
import jspider.client.User;


public class ServerSide {
	
	private static final VerifyUserAge vua= new VerifyUserAge();
	public void receiveData(User usr) throws InvalidAgeException
	{
		System.out.println("Recieveing data from the Client");
		
		if(vua.validateAge(usr)!=true) {
			System.out.println("Registration Failed");
			throw new InvalidAgeException("Age should be greater 18");
			
		}
		else {
			System.out.println("Registration Success...");
			
			//write code to store use object in database.....
		}
	}
	

}
