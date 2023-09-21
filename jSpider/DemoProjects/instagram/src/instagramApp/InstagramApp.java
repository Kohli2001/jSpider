package instagramApp;

import instagramService.LoginService;
import instagramServiceImpl.LoginServiceImpl;

public class InstagramApp extends LoginServiceImpl{
	public static void main(String[] args) {
		
		
		LoginService l1 = new LoginServiceImpl();
		
		l1.Login(96936312, "kkk@2001");
		
	}

}
