package practice;
import java.util.Scanner;





public class NthFabonacci {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		int n1 =0 , n2=1, n3=0;
		System.out.println("Enter upto number");
		int num = sc.nextInt();
		
		if (num==1) {
			System.out.println(n1);
			
		}
		else if (n1==2) {
			System.out.println(n2);
			
		}
		else {
		System.out.print(n1+ " "+n2);
		for(int i=3; i<=num; i++) {
				
			
		    n3=n1+n2;
			n1=n2;
			n2=n3; 
			
		 System.out.print(n2 +" ");
		}
		
		}
		
		
	}
	}

}
