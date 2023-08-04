package practice;


import java.util.Scanner;

public class fact {
	public static int fact(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact =fact*i;
		}
		
		return fact;
		 
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		
		System.out.println(fact(num));

		
	}

}
