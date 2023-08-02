import java.util.Arrays;
import java.util.Scanner;

class Program31{
    public static void main(String[] args) {
        // Write a Java program to test if an array contains a specific value

         Scanner sc = new Scanner(System.in);

        int[] arr1 = {90,210,30,40,10,11};
        System.out.println("enter the value u want to serach");
        int value = sc.nextInt();

        for (int element : arr1) {
            if(element==value){
                System.out.println("Yes! it contains This value " +value);
            }
            else if(element!=value){
                System.out.println("No! it does not contains search value");
                break;
            }
            
            
        }

    

        // String[] arr2 = {"Kamlesh", "Bipin","Raj", "Shippu"};
        

        // Arrays.sort(arr1);
        // for (int elements : arr1) {

        //      System.out.println(elements);

        // }
       

        
        



        
    }
    
}