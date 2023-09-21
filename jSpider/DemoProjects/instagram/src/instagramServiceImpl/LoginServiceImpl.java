package instagramServiceImpl;

import instagramService.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public void Login(String username, String password) {
		if(username.equals("kamlesh2001") && password.equals("kkk@2001")) {
			System.out.println("Login Successfull.........");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}

	@Override
	public void Login(long phno, String password) {
		if(phno==9693631293l && password.equals("kkk@2001")) {
			System.out.println("Login Successfull.........");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}
	

}
