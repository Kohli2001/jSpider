package practice;

import java.util.Scanner;

public class CheckvowelConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a charater");
		char c = scanner.next().charAt(0);
		
		if (c=='A' || c=='a' || c=='E'||c=='e' || c=='I' || c=='i'|| c=='o' || c=='O'|| c=='U'||c=='u') {
			System.out.println("The given character is vowel");
			
		}
		else if ((c>='A' && c<='Z' )|| (c>='a' && c<='z')) {
			System.out.println("the given character is consonant");
			
		} 
		else {
			System.out.println("plsease enter valid charater");
		}
			
		

	}

}
