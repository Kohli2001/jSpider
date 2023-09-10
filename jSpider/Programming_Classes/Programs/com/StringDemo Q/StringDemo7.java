package com;

public class StringDemo7 {
	public static void main(String[] args) {
		String s1 = "PHP Exercises acd Python Exercises";
		s1=s1.toLowerCase();
		int c=0;
		//String find="and";
		for(int i=0; i<s1.length()-2; i++) {
			if(s1.charAt(i)=='a'&& s1.charAt(i+1)=='n' && s1.charAt(i+2)=='d') {
				c++;
			}
		}
		System.out.println(c==1?"Yes":"No");
		
	}

}
