class Demo9{
    int a =10;
    int b = 20;

}
class mainclass8{
    public static void main(String[] args) {
        Demo9 d1 = new Demo9();
        Demo9 d2 = d1;
        d2.a = 100;
        d2.b = 200;
        System.out.println("a value using d1 is "+d1.a);
        System.out.println("b value using d1 is "+d1.b);
        System.out.println("d1 value using d1 is "+d1);
        System.out.println("d2 value using d1 is "+d2);
    }
}