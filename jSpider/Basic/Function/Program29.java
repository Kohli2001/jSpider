import java.lang.reflect.Array;
import java.util.Arrays;

class Program29{

    public static void PositiveInteger(int[] po){

        for (int elements : po) {
            if(elements<0){
                System.out.println(elements);
            }
            
            }
            for (int element : po) {
                if(element>0){
                System.out.println(element);

            
        }
                
            }
            
            
            
    }

    public static void main(String[] args) {
        int[] arr = {2,4,-1,7,-8,-4,-2,};
        PositiveInteger(arr);


        //write a java program to arrange the elements of an array of integers show that all negative integer appear before all positive number >>>-1-2-3-3-4 1234
        
    }
}