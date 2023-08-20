package DemoProjects;

public class SignUpPage {
	
	String Username;
	String email;
	String password;
	long phone;
	
	public SignUpPage(String Username, String email, String password) {
		this.Username = Username;
		this.email = email;
		this.password= password;
		// TODO Auto-generated constructor stub
	}
	public SignUpPage(String username, String password, long phone ) {
		this.Username=username;
		this.password=password;
		this.phone = phone;
		
		// TODO Auto-generated constructor stub
	}
	public SignUpPage(String Username,String password) {
		this.Username=Username;
		this.password=password;
		// TODO Auto-generated constructor stub
	}
	
	void detailsP() {
		System.out.println("========Signup Successfully done using below details=========");
		System.out.println("UserName : " +Username);
		System.out.println("Password : " +password);
		System.out.println("Phone no : " +phone);
		while(true) {
		Menu m1 = new Menu();
        m1.MenuDetails();
		}
		
		
	}
	void detailsE() {
		System.out.println("========Signup Successfully done using below details=========");
		System.out.println("UserName : " +Username);
		System.out.println("Password : " +password);
		System.out.println("Email Id : " +email);
		while(true) {
		Menu m1 = new Menu();
        m1.MenuDetails();
		}
		
	}
	
	

}
//=======================================Codeby@3K=========================================================================
