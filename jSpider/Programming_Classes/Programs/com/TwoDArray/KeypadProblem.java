package twoDArray;

import java.util.Scanner;

public class KeypadProblem {
	static int Keypad(String ipString) {
        int[] keypadnum = {2, 2, 2, 3, 3, 3, 4, 4, 4,5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        int sum = 0;
	        ipString = ipString.toLowerCase(); 
	        char [] arr=ipString.toCharArray();
	        for (char c : arr) {
	            if (c >= 'a' && c <= 'z') {  
	                int keyvalue = c -'a'; 
	                sum += keypadnum[keyvalue];  
	            } 
	            else if (c == ' ') {
	                sum += 0;  
	            }
	            else if (c =='*'||c=='#') {
	                sum += 1;  
	            }
	        }
	        return sum;
	   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a String");
		String ipString = sc.nextLine();
		int preskey=Keypad(ipString);
		System.out.println(preskey);
	}
}


