package com;

public class StringDemo12 {
	public static void main(String[] args) {
		String s1 = "ab56HJk##KKI";
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c>='A' && c<='Z') {
				//captital to small
				c+=32;	
			}
			else if(c>='a' && c<='z'){
				//samll  to capital
				c-=32;
				
			}
			System.out.print(c);
		}
		
	}

}
