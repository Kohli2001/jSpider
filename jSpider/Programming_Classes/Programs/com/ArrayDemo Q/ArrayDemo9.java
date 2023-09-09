package com;

public class ArrayDemo9 {
	    public static void main(String[] args) {
//	        int arr [] = {6, 13 , 15, 7, 24, 16,24, 47, 12, 7};
//	    	 int arr [] = {10, 7 , 3, 12, 7, 16,21, 23, 24, 15};
	    	 int arr [] = {7,3,6,11,17,19,20};
	    	 
	        int sum = 0, c= 0,target=25;
	        
	        for(int i = 0; i<arr.length; i++){
	            if(arr[i]%2==0){
	                sum = sum + i;
	                c++;
	                }
	            
	                if(sum>=target){
	                	break;
	                       
	                }
	               
	            }
	        //System.out.println(c);
	        System.out.println(sum>=target?c:-1);
	        
	        }
	    
	       

	    }
	    
	


