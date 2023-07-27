class Program8{

     public static void  siCalculation(double amt, double rate, double time){


        double res = amt*rate*time;
        System.out.println("simple intrest of given data is " +res);

     } 
    public static void main(String[] args) {

        System.out.println("main method started");
      siCalculation(4000, 9, 4);

    
        System.out.println("main method End");
        
    }
}