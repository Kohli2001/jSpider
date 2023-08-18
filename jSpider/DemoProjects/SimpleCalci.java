package DemoProjects;

import java.util.Scanner;

public class SimpleCalci {
	
	static int  add(int a, int b) {
		return a+b;
	}
	static int  sub(int a, int b) {
		return a-b;
	}
	static int  mul(int a, int b) {
		return a*b;
	}
	static int  div(int a, int b) {
		return a/b;
	}
	static int  mod(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============Simple Calci=================");
		
		while(true) {
			System.out.println("==============Menu========");
			System.out.println("1.add\n2.sub\n3.mul\n4.Div\n5.mod\n6.Exit");
			System.out.println("Enter the option");
			int op = sc.nextInt();
			int  n1= 0,n2=0;
			if (op>=1&&op<=5) {
				System.out.println("==Enter the value for n1");
				 n1 =sc.nextInt(); 
				 System.out.println("==Enter the value for n2");
				 n2 = sc.nextInt();
				
			}
			switch (op) {
			case 1:System.out.println("add "+add(n1, n2)); 
				  break;
				
			case 2:
				System.out.println("Sub " +sub(n1, n2)); 
				  break;
			case 3:
				System.out.println("Mul " +mul(n1, n2)); 
				  break;
			case 4:
				System.out.println("Div " +div(n1, n2)); 
				  break;
			case 5:
				System.out.println("Mod " +mod(n1, n2)); 
				  break;
			case 6:
				System.out.println(".........Thank you visit Again.............");
				System.exit(0);
				
			default:
				System.out.println("====Invalid options");
			}
		}
		
		

	}

}
