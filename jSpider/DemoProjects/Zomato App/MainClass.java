package DemoProjects;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========Zomato App==========");
		
//		while(true) {
			System.out.println("Please Enter \n1.Signup\n2.Login");
			int op = sc.nextInt();
			if (op==1) {
				System.out.println("Press\n 1.To Signup with Phone number\n 2.To Signup with Email id\n 3.Exit App");
				int ans  = sc.nextInt();
				switch (ans) {
				case 1:{
					
					System.out.println("Signup started Using Phone Number");
					System.out.println("Enter Username");
					String name = sc.next();
					System.out.println("Create Password");
					String pass = sc.next();
					System.out.println("Enter Phone Number");
					long phone = sc.nextLong();
					
					SignUpPage u1 = new SignUpPage(name, pass, phone);
					u1.detailsP();
					
						break;
						
				}	
					case 2:{
						
					System.out.println("Signup started Using Email Id");
					System.out.println("Enter Username");
					String name = sc.next();
					System.out.println("Create Password");
					String pass = sc.next();
					System.out.println("Enter Email id");
					String email = sc.next();
					
					SignUpPage u2 =new SignUpPage(name, email, pass);
					u2.detailsE();				
					
						break;
					}	
					case 3:
						System.out.println("Application Closed!");
						System.exit(0);
						
				default:
					System.out.println("Please choose valid way to signup");
					
					break;
				  }
									
			  }

			else if (op==2) {
				System.out.println("Please Provide correct informations");
				
				System.out.println("Enter username");
				String userName = sc.next();
				System.out.println("Enter Password");
				String password = sc.next();
				
//				SignUpPage c1 = new SignUpPage(userName,password);
				
				LoginPage l1 = new LoginPage();
				
				l1.match(userName, password);
				
				
				
			}
							
			}
				

	}

//}

