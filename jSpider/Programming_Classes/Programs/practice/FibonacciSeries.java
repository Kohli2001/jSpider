package practice;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter upto number to find Fibonacci Series");
		int upto = scanner.nextInt();
		
		 int n1 = 0;
		 int n2 = 1;
		 System.out.println(n1+" \n" +n2);
		 
		 for(int i =0 ; i<=upto; i++) {
			 
			  int nextNum = n1+n2;
			  System.out.println(nextNum + " ");
			  
			  n1 = n2;
			  n2=nextNum;
			  
		 }
		 
	

	}

}
