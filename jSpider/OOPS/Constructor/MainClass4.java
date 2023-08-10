
import java.util.Scanner;;

class MainClass4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice to Buy a Mobile Phone");

        System.out.println("Enter Company/Brand name ");
        String brandName = sc.nextLine();

        System.out.println("Enter Model name ");
        String modelName = sc.nextLine();

        System.out.println("Enter Operating System name ");
        String os = sc.nextLine();

        System.out.println("Enter Color  name ");
        String color = sc.nextLine();

        System.out.println("Enter your Budget name ");
        double price = sc.nextDouble();

        Mobile m1 = new Mobile(modelName, brandName, modelName, color, os, price);
        m1.display();




        
    }
}