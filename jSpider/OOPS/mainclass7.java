class Demo8{
    int p = 100;
    int q = 200;

}

class mainclass7{
    public static void main(String[] args) {
        
        System.out.println("main method started");

        Demo8 d1 = new Demo8();
        d1.p = 500;
        d1.q = 600;

        d1= new Demo8();
        System.out.println("d1 is referning to the memory location "+d1);
        System.out.println("p value is  "+d1.p);
        System.out.println("q value is  "+d1.q);
        
        System.out.println("main method ended");
    }
}