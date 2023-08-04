class Demo2{
    static int x = 20;
    static double y = 40;

    static void disp(){
        System.out.println("Running disp() methods");
    }


}
class Demo3{
    
     static void test(){
        System.out.println("Running test() in dem3");
        Demo2.x = 200;
        // System.out.println(Demo2.x);
     }
}

