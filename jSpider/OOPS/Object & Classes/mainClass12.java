import java.util.Scanner;
class Pen{

    String brand;
    double price;
    String color;

}
class mainClass12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Pen p1 = new Pen();
         System.out.println("Enter pen brand");
        p1.brand= sc.nextLine();
        

        System.out.println("Enter pen price");
        p1.price = sc.nextDouble();

        System.out.println("Enter color of pen");

        p1.color = sc.next();

        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.color);


        Pen p2 = new Pen();

        System.out.println();
        
    }
    
}