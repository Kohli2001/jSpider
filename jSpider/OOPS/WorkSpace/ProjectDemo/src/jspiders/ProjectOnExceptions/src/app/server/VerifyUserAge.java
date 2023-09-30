package jspider.server;

import jspider.client.User;

public class VerifyUserAge {
	
	boolean validateAge(User usr) {
		boolean result=false;
		if(usr.getAge()>=18) {
			result =true;
		}
		return result;
	}

}
