class Program30{
    static public void reverseArray(int[] arr){
       
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        
   
    }


    public static void main(String[] args) {
        int[] array={7,6,5,2,1};
        reverseArray(array);


        
    }
}