import java.util.Scanner;

class Program26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Registration form");

        String username="null";
        String password="null";
        String email = "null";
        long phone = 0;
        char gender='N';
    

        System.out.println("Type 'e' to complete the registration using Email \nType 'p' to complete the registration using phone number");

        char choose = sc.next().charAt(0);
        switch (choose) {
            case 'e':
            System.out.println("Complete your registration");

            System.out.println("Enter Username");
            username = sc.nextLine();

            System.out.println("Enter Email");
            email = sc.next();

            System.out.println("Enter Password");
            password = sc.next();

        
            System.out.println("Select Gender\n Male -M \nFemale - F");
            gender = sc.next().charAt(0);
                break;

            case 'p':
             System.out.println("Complete your registration");
            System.out.println("Enter Username");
            username = sc.next();
            System.out.println("Enter Password");
            password = sc.next();
            System.out.println("Enter Phone number");
            phone = sc.nextLong();
            System.out.println("Select Gender\n Male -M \nFemale - F");
            gender = sc.next().charAt(0);

                 break;

        
            default: System.out.println("Invalid Input");

            break;

        }
        System.out.println("Registration completed Successfully \n..............................");
        System.out.println("Username: " +username);
        System.out.println("Password: " +password);
        System.out.println("Email id: " +email);
        System.out.println("Gender: " +gender);
        System.out.println("Phone No: " +phone);
        
        sc.close();
    

    

    }

        
    
}
