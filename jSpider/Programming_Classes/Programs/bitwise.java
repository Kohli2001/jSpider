package practice;
import java.util.*;

public class bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		
		
		
		System.out.println("the number is divisible by 2 " +(n>>1));
		System.out.println("the number is divisible by 4 " +(n>>2));
		System.out.println("the number is divisible by 8 " +(n>>3));

		
		
	

	}

}
