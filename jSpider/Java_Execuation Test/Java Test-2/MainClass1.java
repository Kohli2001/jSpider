import java.util.Scanner;
class MainClass1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brand name");
        String brand_name =sc.next(); 
        System.out.println("Enter Engine Type");
        String engine_type =sc.next(); 
        System.out.println("Enter fuel Type");
        String fuel_type =sc.next(); 
        System.out.println("Enter seating Capacity name");
        int seating_cap =sc.nextInt(); 
        System.out.println("Enter Model name");
        String model_name =sc.next(); 

        Car c1 = new Car(brand_name, engine_type, fuel_type, seating_cap, model_name);
        c1.display();


    
    }
}