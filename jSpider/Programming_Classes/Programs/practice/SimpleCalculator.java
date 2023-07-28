package practice;
import java.util.Scanner;

public class SimpleCalculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Simple Calculator:
		// Write a program that takes two numbers as input and allows the user to perform 
		// basic arithmetic operations (addition, subtraction, multiplication, division) using Java operators.
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("enter second number");
		double num2 = scanner.nextDouble();
		
		// to add
		
		double add = num1+num2;
		//to sub
		
		double sub = num1-num2;
		//to multi
		double mul = num1*num2;
		
		//to divide
		double div = num1/num2;
		
	System.out.println("what operation You want to perform? \n 1 for add , sub for 2 , mul for 3 , div for 4 ");
	 int choice = scanner.nextInt();
		
		if (choice==1) {
			System.out.println("The saddition of given numbers = "+add);
		}
		else if (choice==2) {
			System.out.println("The subtraction of given numbers = "+sub);
		}
		else if (choice==3) {
			System.out.println("The multiplication of given numbers = "+mul);
			
		}
		else if (choice==4) {
			System.out.println("The division of given numbers = "+div);
		}
		else {
			System.out.println("Something went WRONG!");
		}
		
			
	

	}

}
}
