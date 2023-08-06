class Demo7{
    int a = 10;
}
class mainclass6{
    public static void main(String[] args) {
        System.out.println("main method start");

        Demo7 d1 = new Demo7();
        Demo7 d2 = new Demo7();
        System.out.println("value of a " +d1.a);


        System.out.println("address of d1" +d1);
        System.out.println("address of d2" +d2);


        System.out.println("main method end");
    }
}