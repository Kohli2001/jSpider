package programmingTest;

import java.util.Scanner;

public class Solution2 {
	static boolean isPrime(Integer n){
	    int c=0;
	    
	    for(int i=1; i<=n; i++){
	        if(n%i==0){
	            c++;
	        }
	    }
	        return c==2;
	   }

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        char c = sc.next().charAt(0);
	        char [] arr = s.toCharArray();
	        int done=0;
	        for(int i=0; i<arr.length; i++){
	            if(c==arr[i]){
	                if(isPrime(i)){
	                    done++;
	                }
	                    
	                }
	            
	        }
	        System.out.println(done==1?"Unique element":"not a Unique element");

}
}
