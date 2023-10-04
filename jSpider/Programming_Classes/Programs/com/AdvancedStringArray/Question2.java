package preScreeningTest;

import java.util.Scanner;

public class Question2 {
	 // Helper method to check if S is divisible by X
       static boolean isDivisible(int S, int X) {
        int remainder = 0;
        for (int i = S; i > 0; i--) {
            remainder = (remainder * 10 + 1) % X;
        }
        return remainder == 0;
    }
       
       // Helper method to print a lucky number with 'S' 8's followed by 'S' 6's
	    static void printLuckyNumber(int S) {
	        for (int i = 0; i < S; i++) {
	            System.out.print(i < S / 2 ? '8' : '6');
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		     int numCases = sc.nextInt();
		        for (int i = 0; i < numCases; i++) {
		            int X = sc.nextInt();
		            int S = 1;
		            while (S <= 200) {
		                if (isDivisible(S, X)) {
		                    printLuckyNumber(S);
		                    break;
		                }
		                S++;
		            }

		            if (S > 200) {
		                System.out.println("-1");
		            }
		        }

		    }


}
