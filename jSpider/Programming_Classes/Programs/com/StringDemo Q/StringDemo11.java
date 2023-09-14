package com;

public class StringDemo11 {
	public static void main(String[] args) {
		String s1="a3b4a2d3";
		
		for(int i=0; i<s1.length(); i=i+2) {
				char c=s1.charAt(i);
				int n=s1.charAt(i+1)-48;
				for(int j=1; j<=n; j++) {
					System.out.print(c);
					
				}	
//				System.out.print(c);
//				System.out.print(n);
		}
		
	}

}
