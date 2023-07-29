class Program13{


    // print the (a+b)^2 = a2 +b2+ 2ab  using fundtions

    public static int square(int n){
        return n*n;
    }


    public static void main(String[] args) {

        int a = 5 , b=2;
        int res = square(a)+square(b)+2*a*b;
        System.out.println("Hence  (a+b)^2 = "+res);
        
    }
}