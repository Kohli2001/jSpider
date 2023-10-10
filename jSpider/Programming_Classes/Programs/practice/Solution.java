package programmingTest;

import java.util.Scanner;

public class Solution {
	    static void sort(int[] arr){
	        for(int i=0; i<arr.length; i++){
	            for(int j=i+1; j<arr.length; j++){
	                if(arr[i]>arr[j]){
	                    int temp = arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        for(int i=0; i<arr.length; i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        sort(arr);
	        int sum=0;

	        for(int i=0; i<arr.length-1; i++){
	            sum=sum+arr[i];
	        }
	        if(sum==arr[arr.length-1]){
	            System.out.println("happy group");
	        }
	        else{
	        	System.out.println("not a happy group");
	        }
	        
	        
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
	}

