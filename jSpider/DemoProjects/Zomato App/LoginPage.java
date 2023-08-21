package DemoProjects;

public class LoginPage {
    String username;
    String password;

    public LoginPage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean match(SignUpPage signUpPage) {
        if (this.username.equals(signUpPage.getUsername()) && this.password.equals(signUpPage.getPassword())) {
            System.out.println("Login successful...........");
            return true;
        }
        System.out.println("Login failed due to Invalid username or password....Try Again!!");
        return false;
    }
}



//=======================================Codeby@3K=========================================================================



