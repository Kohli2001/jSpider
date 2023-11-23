package org.dsa.basics.bstprogrammingTest;


public class Programm7 {
	
	public static void main(String[] args) {
		String s1=  "apple";
		String s2= "Banana";

		String s3 = s1.toLowerCase()+s2.toLowerCase();
		System.out.println(s3);
		for(int i=0; i<s3.length(); i++) {
			char c= s3.charAt(i);
			for(int j=0; j<s3.length(); j++) {
				char c2= s3.charAt(j);
			}
		}
	}
	

}
