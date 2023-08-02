class Program25{


    
    public static void Max_MinArray(int[] arr){
        int largestElement =arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largestElement){
                largestElement = arr[i];
                
            }
        }
        System.out.println("Maximum array elemnets is " +largestElement);


    }

    public static void main(String[] args) {
        //smallest and largest number in array
        
        int[] numbers = {8999,20,-10,2001};
         Max_MinArray(numbers);
        

        int SmallestNumber = numbers[0];
        int LargestNumber  = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>LargestNumber){

                LargestNumber = numbers[i];

            }
            else if(numbers[i]<SmallestNumber){

                 SmallestNumber = numbers[i];

            }
        }

        System.out.println("maximum number : "+LargestNumber);
        System.out.println("minimum number : "+SmallestNumber);

        
    }
    
}