package com;

public class charWithAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		char c1 = '1';
//		char c2 = '8';
		
		
		
		//Logic ---->>>> '0' = ASCII VALUE OF 0 -48-48 = 0 similary
		//...............'1' = ASCII VALUE OF 1 -49-48 = 1 similary
		//'.............. '2'= ASCII VALUE OF 2 -50-48 = 2 similary
		//................'1'= ASCII VALUE OF 3 -51-48 = 3 similary 
		
//		System.out.println((c1-'0')+(c2-48));  // 9 
		
		// HENCE  anything----->>>>>>>>>>. (char numeric input) - ('0' or  48) = int numeric values as output .
		
		char c = 'A';
		
		
				//Logic-- ---->>>'A' = ASCII VALUE OF A=65  
				//...............'a' = ASCII VALUE OF a =97  // diffrence if 97-65 = 32
		
				//HENCE........... A+=32 is equal to the a 
				
		c+=32;  // short hand operator  
		
//		c+c=32;  // ERRO 
		
		char c1 = 'a';
		
		c1-=32;
		
		// new concept 
		
		char c3 = '\n'; 
		
		
		
		
		
		System.out.println(c1);  // A
		System.out.println(c3);// A
		System.out.println(c);  // a
		
		
		
		
		
		

	}

}
