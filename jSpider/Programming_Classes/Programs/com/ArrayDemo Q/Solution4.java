package programmingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size<3){
            System.out.println("Invalid Array size");
        }
        else{
            int[] arr = new int[size];
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i : arr) {
				System.out.println(i);
			}
            int min=0 , max=0;
            for(int i=0; i<3; i++){
                min=min+arr[i];
            }
            for(int i=arr.length-1; i>arr.length-4; i--){
                max=max+arr[i];
            }
            
            System.out.println(min);
            System.out.println(max);
            System.out.println(max-min);
            
            
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

}
