class program2{
    public static void main(String[] args) {
        

        //Array Traversing using loops 

        int [] a1 = {1,2,3,4,5,6,7,8,9};

        System.out.println("Array Forward traverse");
        for(int i =0 ; i<a1.length; i++){
            
            System.out.print(a1[i] +" ");
        }
        System.out.println("\nArray Backward traverse");
        for(int j=a1.length-1; j>=0; j--){
            System.out.print(a1[j] +" ");

        }
    }

}