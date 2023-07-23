package com;

public class conditionalPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//program to check given number is divisible by 3 and 5 or not ?
		
		int num = 54;
		char c ='Z';
		
		if(num%3==0 && num%5==0) {
			System.out.println("Given number is divisible");
		}
		else {
			System.out.println("Given number is not divisible");
		}
		
		System.out.println("==============================================");
		
		//program to check number is from 50 to 100 ? 
		
		if(num>=50 && num<=100) {
			System.out.println("the number lies from 50 to 100 ");
		}
		
		System.out.println("==============================================");
		
		// program to check given charcater is smaller or not 
		
		if(c>=97 && c<=122) {
			System.out.println("Yes its in small alphabet");
		}
		
		System.out.println("==============================================");
		
		if(c>=65 && c<=91) {
			System.out.println("Yes its in Capital alphabet");
		}
	}

}
