import java.util.Scanner;;
class Circle{
    double radius;
    static final double pi = 3.14;

    void findArea(){
        double area = pi*radius*radius;
        System.out.println("Area of circle :"+area);

    }
    void findCircumference(){
        double circum = 2*pi*radius;
         System.out.println("circumference of circle :"+circum);


    }
    void findDiameter(){
        double dia= 2*radius;
         System.out.println("diameter of circle :"+dia);


    }
}

class mainClass11{
    public static void main(String[] args) {
         Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        c1.radius = sc.nextDouble();
        c1.findArea();
        c1.findCircumference();
        c1.findDiameter();


        
    }
}