class program5{
    public static void main(String[] args) {
        // create an array with integer  values write a program to find the sum of the integer


        //method 1


        int []arr1 = {10,20,30,40,50};
        int sum =0 ;
    //     for(int i=0 ; i<arr1.length; i++){
    //     sum+=arr1[i];

    //    }
    //    System.out.println(sum);


    // method2

    for(int n : arr1){

        sum+=arr1[n];

        System.out.println(n);
    }
        
    }
}