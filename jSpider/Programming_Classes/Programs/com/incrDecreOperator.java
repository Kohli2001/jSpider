package com;

public class incrDecreOperator {
	public static void main (String[]args) {
	//Q1)
		int x=5;
		
		x = x++;
		x = x++;
		x = x++;
		x = x++;
		
		//System.out.println(x); // 0
		
   //Q2)
		int a= 1 , b=2, c=3;
		
		//int a = 1;
		
	//Q3)
		int d1 = a++;
		
		//System.out.println(d1);
		
		int d = a++ + b++ + c++ - a;
		
		//System.out.println(d);
		
	//Q4)
		int x1=0 , y1 =0 ;
		y1 = x1++ + ++x1 + x1++;
		System.out.println(x1);
		System.out.println(y1);
		
		
		
		
		
	}

}
