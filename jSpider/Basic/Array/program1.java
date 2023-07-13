class program1{
    public static void main(String[] args) {



        //1st way of using Array

        // int [] a1 = {67,99,56,4,35};


        //System.out.println(a1[0]); // it will print the value whihc present at index 1
        // so if i want to print all the values in one line or one shot then we need to use for loop or for ech loop in array .

        // for(int i=0 ; i<=4; i++){
        //     System.out.print(a1[i] +" ");

        // }

        // 2nd way of using Array 


    int[] arr1 ; 
    arr1 = new int[5];


    // System.out.println(arr1[0]); // it iwll print 0  as default value of int dataTYPE


    // set the values in array 

    arr1[0] = 99;
    arr1[1] = 84;
    arr1[2] = 24;
    arr1[3] = 64;
    // arr1[5] = 98;

// ..................................................

// System.out.println(arr1[0]); // given single index output as 99  

//.....................................................

for(int n  :arr1){
    System.out.print(n +" ");
}
    
    }
}