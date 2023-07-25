class Program6{

    public static double mod(double a , double b){

        double mode =  a%b;


        return mode;  // why it is not giving error actually by default its taking 0.0 in double datatye i put 0 only 
    }
    public static void main(String[] args) {
        System.out.println(mod(5, 2));
        
    }
}