class program3{
    public static void main(String[] args) {
        //to find circle Area, diameter , and circumference 

        final double pi=3.14;
        double radius = 4;
        double area , circum, dia ;

        dia = 2*radius;
        circum = 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("Radius of the circle :" + radius);        
        System.out.println("Diameter of the circle :" + dia);        
        System.out.println("circumference of the circle :" + circum);        
        System.out.println("Area of the circle :" + area);        

    }

}