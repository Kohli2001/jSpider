  class Demo5{
    int p = 10;
    void test(){
        System.out.println("Running test()");
    }
        
 }
    class MainClass4{
        public static void main(String[] args) {
              System.out.println("staring Main methods");

              Demo5 d5 = new Demo5();

            System.out.println("P value is " +d5.p);
            d5.test();

            System.out.println("Ending Main methods");
        }
    }

  
