package practice;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Write a Java program to print an American flag on the screen.
		
		System.out.println("* * * * * *  =============================");
		System.out.println(" * * * * *   ============================");
		System.out.println("* * * * * *  =============================");
		System.out.println(" * * * * *   =============================");
		System.out.println("* * * * * *  =============================");
		System.out.println(" * * * * *   =============================");
		System.out.println("* * * * * *  =============================");
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("===========================================");

		
//		Write a Java program to swap two variables.
		
		int a  = 10;
		int b = 5;
		
		//before swaping 
		System.out.println("before swaping");
		System.out.println("A= "+a+ " B= "+ b);
		
		//after swaping
		System.out.println("after swaping");
		
		b=a+b-(a=b);
		System.out.println("A= "+a+ " B= "+ b);
		
	}

}
