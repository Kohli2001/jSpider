package practice;
import java.util.*;
public class mulTwoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st binary number");
		
		String b1 = sc.next();
		
		System.out.println("Enter 2nd binary number");
		
		String b2 = sc.next();
		
		
		int n1 = Integer.parseInt(b1, 2);
		int n2 = Integer.parseInt(b2, 2);
		
		int n3 = n1*n2;
		
		System.out.println("The multiplication of two  binary is " +Integer.toBinaryString(n3));
		
	
		

	}

}
