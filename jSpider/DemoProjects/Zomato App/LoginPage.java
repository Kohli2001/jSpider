package DemoProjects;

public class LoginPage {
	String username;
	String password;
	
	
//	SignUpPage check = new SignUpPage(username, password);
	
	boolean match(String username, String password) {
			if (this.username==username && this.password ==password) {
			
			System.out.println("Login successfully...............");
			return  true;
			
		}
		System.out.println("Login failed due: to Inavlid username or password....Try Again!!");
		return false;
	}

}

//=======================================Codeby@3K=========================================================================

