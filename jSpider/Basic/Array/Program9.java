import java.util.Scanner;
class Program9{
    public static void main(String[] args) {


        // Write a Java program to copy an array by iterating the array.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arraySize = sc.nextInt();
    
        int [] arr1 = new int[arraySize];
        System.out.println("enter the array elements");

        for(int i=0; i<arraySize; i++){
            arr1[i]= sc.nextInt();
        }
    System.out.println("Entered elemts are ");
    System.out.println("------------------------------------");
        
        for(int elements: arr1){
             System.out.print(elements + " ");

        }

        // for(int elements: arr1){
            

        // }
    }
}