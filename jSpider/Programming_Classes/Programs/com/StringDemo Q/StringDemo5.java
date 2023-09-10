package com;

public class StringDemo5 {
	public static void main(String[] args) {
		//count the hi in givern string 
		String s = "hghihghigiahigh i";
		s=s.toLowerCase();
		int c=0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)=='h' && s.charAt(i+1)=='i') {
				c++;
			}	
		}System.out.println(c);
		
	}

}
