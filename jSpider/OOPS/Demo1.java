class Demo1{
    static int x = 10;
    static double y = 4.3;

    static void test(){
        System.out.println("running test() method in demo1 class ");

    }
}
class MainClass{
    public static void main(String[] args) {
        //printing the static member of demo 1 class

        System.out.println(Demo1.x); 
        System.out.println(Demo1.y);
        Demo1.test();

        //re-initializing thr static variables
        System.out.println("after reinitializating the satatic variables and methods");

        Demo1.x=2023;
        Demo1.y =45.33;


        System.out.println(Demo1.x);
        System.out.println(Demo1.y);

       

    }
}