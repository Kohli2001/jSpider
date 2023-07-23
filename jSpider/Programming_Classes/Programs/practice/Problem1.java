package practice;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.Write a Java program to print the area and perimeter of a circle.
		final double pi = 3.14;
		double dia , area,peri, r , l, w;
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the radius of the circle");
		
	
		
		 //r = sc.nextDouble();
		System.out.println("enter the height of the rectangle");
		 l=sc.nextDouble();
		 
		System.out.println("enter the width of the rectangle");
		 w=sc.nextDouble();
		 //logic for circle
		 
//		 dia= 2*pi*r;
//		 area=pi*r*r;
//		 
		 //logic for rectangle 
		 
	        area = l*w;
	        peri=2*(l+w);
	        
		 
//		 System.out.println("area of the given radius circle is " +area);
//		 System.out.println("diameter of the given radius circle is " +dia);
		 
		 
		 
//		 2.Write a Java program to print the area and perimeter of a rectangle.
		 
		 System.out.println("area of the given is rectangle " +area);
		 System.out.println("perimeter of the given rectangle is " +peri);
		 
		 
		 
		

	        

	}

}
