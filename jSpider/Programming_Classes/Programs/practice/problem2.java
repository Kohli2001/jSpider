package practice;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//2. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int avg = num1+num2+num3;
		System.out.println("Average of the given number is " +avg);
	}
	
	

}
