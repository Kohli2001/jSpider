import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
         Signup signUp = new Signup();
        signUp.takeInput();

        Login login = new Login(signUp.getUsername(), signUp.getPassword());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username for login: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password for login: ");
        String inputPassword = scanner.nextLine();

        if (login.validate(inputUsername, inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
    
}
