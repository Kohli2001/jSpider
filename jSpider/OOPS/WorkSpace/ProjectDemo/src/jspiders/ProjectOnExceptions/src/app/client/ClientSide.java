package jspider.client;
import jspider.server.InvalidAgeException;
import jspider.server.ServerSide;

public class ClientSide {
	
	final static private ServerSide c1 = new ServerSide();
	
	void sendData(User usr) {
		System.out.println("sending registration details to server");
		try {
			c1.receiveData(usr);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
