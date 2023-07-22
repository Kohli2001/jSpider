package com;

public class uraryOperatorwithAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte b = 127;
		
//		b++;
		System.out.println(b++);  // it always print assigned values 
		System.out.println(b);    // after assigned it gives u the increments values 
		
		
		System.out.println("====================================");
		
		double d = 8.7;
		System.out.println(d++); //8.7
		System.out.println(d); //9.7
		
		System.out.println("====================================");
		
		long l = 9223372036854775807l;
		
		System.out.println(l++);  //9223372036854775807l
		System.out.println(l);   //-9223372036854775808
		
		System.out.println("====================================");
		
		int i = 2147483647;
		System.out.println(i++);   //2147483647
		System.out.println(i);	  //-2147483648
	   

		

	}

}
