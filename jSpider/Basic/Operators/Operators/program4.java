//to find the Area , diameter  and circumference  of a Circle using given radius and pi values 

class program4{
    public static void main(String[] args) {
        final double pi = 3.14;
        double radius = 2.4;
        double area ,dia,  circum;

        dia = 2*radius;
        circum= 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("The radius of the circle is =" +radius);
        System.out.println("The diameter of the circle is =" +dia);
        System.out.println("The circumference of the circle is =" +circum);
        System.out.println("The Area of the circle is =" +area);
    }
}