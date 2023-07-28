package practice;
import java.util.*;

public class factorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Factorial Calculation: 
//	Write a Java program to calculate the factorial of a given number using the for loop and the * operator.
		
//	n*(n-1)*---1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
//		
//		int num = scanner.nextInt();
//		long fact = 1;
//	
//		for (int i = 0; i <=num; i++) {
//			
//			if (num==0 || num==1) {
//				System.out.println("Factorial is 1");
//				
//			}
//			
//				fact*=i;
//				
//		}
//		System.out.println("factorial of the functions is "+fact);
		
		
	
		        int number = scanner.nextInt();
		        scanner.close();

		        long factorial = 1;

		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }

		        System.out.println("Factorial of " + number + " is: " + factorial);
		    }
		

	}


