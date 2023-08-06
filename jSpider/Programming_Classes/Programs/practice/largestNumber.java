package practice;
import java.util.Scanner;



public class largestNumber {
	
	
	public static void largeNumber(int a, int b ,int c) {
		
		
		if (a>=b)  {
			System.out.println(a);
			
		}
		else if (b>=c) {
			
		
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("enter first number");
		int n1 = scanner.nextInt();
		
		System.out.println("enter second number");
		int n2 = scanner.nextInt();
		
		System.out.println("enter third number");
		int n3 = scanner.nextInt();
		
		largeNumber(n1,n2,n3);
		
//		if (n1>=n2) {
//			System.out.println(n1);
//			
//		}
//		else if (n2>=n3) {
//			System.out.println(n2);
//		}
//		else {
//			System.out.println(n3);
//		}

	}




}
