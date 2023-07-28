class Program10{

    public static void f1(){
        System.out.println("f1 running ");
        f2();
        System.out.println("ending the f1 methods");
    }
    public static void main(String[] args) {
        System.out.println("main method is running");
        f1();
        System.out.println("ending the main method");

        
    }
    public static void  f2(){
            System.out.println("f2 is running ");

            
        }
        
}