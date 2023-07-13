class program4{
    public static void main(String[] args) {
        // create a integer array with values and write a program to print even numbers 

        int [] arr1  = {2,3,4,5,6};

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]%2==0){
                System.out.println(arr1[i]);
            }
            
        }
    }
}