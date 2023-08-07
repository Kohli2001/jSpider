package com;
import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		   System.out.println("Enter your Gender");
		   
		   char gender = scanner.next().charAt(0);
		   
		   System.out.println("Enter Your Age");
		   int age = scanner.nextInt();
		   
		   if (gender=='M') {
			   if (age<21) {
				   System.out.println("Happy Life.......!!1");
				
			}
			 else {
				System.out.println("RIP with Life Partner..........!!!");
			}
			   
		}
		   else if (gender=='F') {
			   if (age<18) {
				   System.out.println("Sad Life......!!!");
				
			}
			   else {
				System.out.println("Happly enjoyment with Life partner........!!!!");
			}
			
		}
		   
		   else {
			System.out.println("Invalid Input");
		}
		   

	}

}
