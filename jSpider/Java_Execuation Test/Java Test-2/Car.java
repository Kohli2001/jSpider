class Car{
    String brand;
    String engineType;
    String fuelType;
    int seating_capacity;
    String model;
   

    Car(String brand, String engineType, String fuelType,int seating_capacity, String model){
        this.brand=brand;
        this.engineType=engineType;
        this.fuelType=fuelType;
        this.seating_capacity = seating_capacity;
        this.model = model;
        
        
        

    }
    void display(){
        System.out.println("Brand of Car : "+brand);
        System.out.println("Engine Type of Car : "+engineType);
        System.out.println("Fuel Type of Car : "+fuelType);
        System.out.println("Seating Capacity of Car : "+seating_capacity);
        System.out.println("Model of Car : "+model);

       
    }
    
    
}