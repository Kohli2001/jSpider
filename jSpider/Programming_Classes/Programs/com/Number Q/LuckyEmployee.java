package com;

import java.util.Scanner;

public class LuckyEmployee {
	
	static String isPrime(int n) {
		int c=0;
		for(int i =1; i<=n; i++) {
			if(n%i==0) {
				c++;
			}
				
		}
		return c==2?"Lucky Employee":"UnLucky Employee";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		int c=0 , r=0 ,sum=0, count=0, empid=id;
			while(id!=0) {
				r=id%10;
				count++;
				if (count<=4) {
					sum+=r;	
				}
				id=id/10;
			}	
				if (count>=6) {
					System.out.println(isPrime(sum));	
				}
				else {
					System.out.println("Minimum Length of id should be 6 digit");
				}
				
				
			}
			
		}
		
		
	

//}
