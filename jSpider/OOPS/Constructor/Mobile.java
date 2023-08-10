class Mobile{
    String model;
    String brand;
    final static String regno ="samsungA0012021";
    String color;
    double price;
    String os;

    Mobile(String model, String brand, String regno , String color, String os, double price){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.price = price;
    }


    void display(){

        System.out.println("Expected Result ");
        System.out.println("Model: "+model +" \nBrand: "+brand +" \nRegistration no: "+regno +"\n Color: "+color + " \n MobileOs: "+os +"\n Price Rs: "+price);
    }

}