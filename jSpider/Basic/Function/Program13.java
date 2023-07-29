class Program13{


    // print the (a+b)^2 = a2 +b2+ 2ab  using fundtions

    public static int square(int n){
        return n*n;
    }


    public static void main(String[] args) {

        int a = 5 , b=2;
        int res = square(a)+square(b)+2*a*b; // its using both assigning and calculating the respectively using function parameter
                                            //Hence function parameter can be use  directely in expression as well . 



        int res2 = square(a)+square(b)-2*a*b;

        System.out.println(" (a+b)^2 = "+res); 
        System.out.println(" (a-b)^2 = "+res2); 

        int res3 = square(res2);
        System.out.println("printing square of the square()function ");

        System.out.println(res3);

 System.out.println("----------------------------");

        int res4 = res3++;

        System.out.println(res3++); //increamented value will be print
        
        res3++;

        System.out.println(res4); //assigned values will be printed value will be print

        System.out.println(res3++);





        
    }
}