import java.util.Scanner;

class MainClass3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P to enroll with phone and E to enroll with Email");
        char choice = sc.next().charAt(0);
        
        switch (choice) {
            case 'p':
            case 'P':

            System.out.println("Start enrollment with phone ");
            System.out.println("Enter name ");
            String name = sc.next();
            System.out.println("Enter Degree");
            String degree = sc.next();
            System.out.println("enter your phone number");
            long phone = sc.nextLong();

            JspiderEnrollment e1 = new JspiderEnrollment(name, degree, phone);
            e1.displayP();                
                break;

            case 'E':    
            case 'e':    

            System.out.println("Start enrollment with phone ");
            System.out.println("Enter name ");
            String Sname = sc.next();
            System.out.println("Enter Degree");
            String Sdegree = sc.next();
            System.out.println("Enter your email id");
            String email = sc.next();

           JspiderEnrollment e2 = new JspiderEnrollment(Sname, Sdegree, email);
           e2.displayE();
                            
                break;

        
            default:
            System.out.println("Invalide Input");
                break;
        }
        
    }
}