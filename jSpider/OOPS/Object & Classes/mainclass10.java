class Demo10{
    static int x = 100;
           int y = 200;
           

           void test(){
            System.out.println("non satic test()");
           }
           static void disp(){
            System.out.println("static disp()");
            

           }
}
class mainclass10{
    public static void main(String[] args) {

        System.out.println("main methods started");

        System.out.println("accesing static member");
        System.out.println(Demo10.x);
        Demo10.disp();

        Demo10 d1 = new Demo10();

      System.out.println("accesing non static member");
      System.out.println(d1.y);
      d1.test();

    


        System.out.println("main methods ended");

        
    }
}