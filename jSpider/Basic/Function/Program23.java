import java.util.Arrays;

class Program23{

    public static void FindMaxElement(int[] arr){
         Arrays.sort(arr);
        for (int elements: arr) {
            System.out.println(elements);
           
            
        }
      
    }
    public static void main(String[] args) {

        // to find the max element in the array 

        int[]arrNumbers = {7,2,5,6,8,9};

       
        FindMaxElement(arrNumbers);



        
        

    }
}