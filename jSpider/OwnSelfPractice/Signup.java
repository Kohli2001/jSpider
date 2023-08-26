
import java.util.Scanner;
public class Signup {
    private String username;
    private String password;

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for signup and 2. for login");
        int op = scanner.nextInt();
        if(op==1){
        System.out.print("Enter username: ");
        username = scanner.next();
        System.out.print("Enter password: ");
        password = scanner.next();
        System.out.println("Signup succesfully done");
        dis();
        }
        else if(op==2){
         Login l = new Login(username, password);

        }

        
       
    }

    void dis(){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

