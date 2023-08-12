import java.util.Scanner;

class MainClass2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name ");
        String name = sc.next();
        System.out.println("Enter your Id");
        String id = sc.next();
        System.out.println("Enter Purchase Product name ");
        String productName = sc.next();
        System.out.println("Enter Purchased quntity");
        int q = sc.nextInt();

        Customer c1 = new Customer(name, id, productName, q);
        c1.display();
        
    }
}