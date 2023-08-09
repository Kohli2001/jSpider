class Demo4{
    int x = 10;
    void test(){

    }

}
class MainClass3{
    
    public static void main(String[] args) {

        System.out.println(new Demo1().x);
         new  Demo4().x = 200;
        System.out.println(new Demo1().x); //we can not print reilizaliazed value without storing into any variable
        // System.out.println(Demo4.x);
    }
}