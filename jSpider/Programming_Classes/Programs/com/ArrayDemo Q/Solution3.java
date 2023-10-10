package programmingTest;

import java.util.Scanner;

public class Solution3 {
	    
	    static boolean isContain(String s){
	        s=s.toLowerCase();
	        char[] arr= s.toCharArray();
	        int a=0, e=0, i=0, u=0, o=0;
	        for(int j=0; j<arr.length; j++){
	        	switch (arr[j]) {
	                case 'a':
	                    a++;
	                break;
	                case 'e':
	                    e++;
	                   break;
	                case 'i':
	                    i++;
	                   break;
	                case 'o':
	                    o++;
	                   break;
	                case 'u':
	                    u++;
	                   break;
	            }
	            
	        }
	        return a>=1&&e>=1&&i>=1&&o>=1&&u>=1;
	            
	        }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        if(isContain(s)){
	            System.out.println("valid string");
	        }
	        else{
	            System.out.println("invalid string");
	        }
	        
	        
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
	}

