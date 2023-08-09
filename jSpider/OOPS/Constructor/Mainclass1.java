class Demo2{
    int x ;
   double y;

   Demo2(){
    System.out.println(" Running Demo1 constructor");
     x=10;
     y=3.5;

   }
}


class Mainclass1{
    public static void main(String[] args) {
        System.out.println("Main method started");



         Demo2 d1 = new Demo2();

        System.out.println("X value is " +d1.x);
        System.out.println("Y value is " +d1.y);

        System.out.println("Main method Ended");
    }
}