class Demo6{
    int p = 10;
    int q = 20;

}
class mainclass5{
    public static void main(String[] args) {
        System.out.println("main method start");

        Demo6 d1 = new Demo6();
        Demo6 d2 = new Demo6();
        System.out.println("first object p value is "+d1.p);
        System.out.println("first object q value is "+d1.q);
        System.out.println("second object p value is "+d2.p);
        System.out.println("second object q value is "+d2.q);



        System.out.println("modifying p and q values");

         d1.p = 100;
         d1.q= 200;


        //  modifying in one object can not be affect in other objects in non static

        System.out.println("first object p value is "+d1.p);
        System.out.println("first object q value is "+d1.q);
        System.out.println("second object p value is "+d2.p);
        System.out.println("second object q value is "+d2.q);



        





        
        
        
                
        
        System.out.println("main method ended");

        
        
    }
}
