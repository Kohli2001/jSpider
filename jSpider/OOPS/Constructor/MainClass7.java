
import java.util.Scanner;
class MainClass7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'P' for registration with phone and 'E' through email");

        char option = sc.next().charAt(0);
        switch (option) {

                //  'p':
            case 'P':

            System.out.println("Start Registration with Phone number");


            System.out.println("Enter Username");
            String name = sc.nextLine();
            sc.nextLine();


            System.out.println("Enter Password");
            // sc.nextLine();

            String password = sc.nextLine();
            // sc.nextLine();

            System.out.println("Enter Phone number");
            long phone = sc.nextLong();

            System.out.println("Enter Your gender");
            char g = sc.next().charAt(0);

            //creating varibales
            UserAccount u1 = new UserAccount(name, password, phone, g);

            u1.display();
                         break;

                //  'e':
            case 'E':    
            System.out.println("Start Registration with Phone number");

            System.out.println("Enter Username");
            String name2 = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter Password");
            String pass = sc.nextLine();
            // sc.nextLine();


            System.out.println("Enter email id number");
            String email = sc.nextLine();

            System.out.println("Enter Your gender");
            char gender = sc.next().charAt(0);
            
            //creating 2nd user account...........

           UserAccount u2 = new UserAccount(name2, pass, email, gender);
            u2.display();        
            break;

            default:
            System.out.println("Ivalid input ");
            break;
        }
        
    }
}