package practice;
import java.util.*;
public class subTwoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st binary value");
		
		String b1 = sc.next();
		
		System.out.println("Enter 2nd binary value");
		
		String b2 = sc.next();
		
		//converting String to integer with base 2 bacause binary we took base 2 only
		
		int n1 = Integer.parseInt(b1, 2);
		int n2 = Integer.parseInt(b2, 2);
		
		int n3 = n1-n2;
		
		System.out.println("The substraction of given binary value is "+Integer.toBinaryString(n3) );
		

	}

}
