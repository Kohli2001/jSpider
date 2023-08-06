package practice;

import java.util.Scanner;
public class posiNeg {
	
	public static void PoNeZro (int num) {
		

		if (num>0) {
			System.out.println("Number is positive");
			
		}
		else if (num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("zero");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		
		int num = scanner.nextInt();
		PoNeZro(num);
		
			
		

	}

}
