import java.util.Scanner;

public class StringDemo13 {
    public static void main(String[] args) {
//         Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

Scanner sc = new Scanner(System.in);
String s = sc.next();

String s1 ="";
s1=s1+s.substring(0, 0)
s1= s1+s.replace("@gmail.com", "");
System.out.println(s1);
    }
    
}
