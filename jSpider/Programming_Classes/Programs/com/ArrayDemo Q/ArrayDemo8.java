package com;

public class ArrayDemo8 {
	static boolean isPrime(int n) {
		int c=0;
		for(int i=1; i<=n; i++) {
			if (n%i==0) {
				c++;
				
			}
		}
		return c==2;
	}
	public static void main(String[] args) {
		int [] arr= {2,5,3,19,16,2};
		boolean flag=true;
		
		for(int i=1; i<arr.length; i++) {
		
			if(isPrime(i)){
			 flag = isPrime(arr[i]);
					
				}
				
			} 
		System.out.println(flag==true?"Prime Array":"Not Prime Array");
		}
		
		
		
		
	}


