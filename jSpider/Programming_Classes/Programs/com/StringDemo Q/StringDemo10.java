package com;

public class StringDemo10 {
	public static void main(String[] args) {
		String s1 = "h123e@#ll56o##";
		//segregating alpha,numeric,spcl and concating
		
		String alpha="",num="",spcl="";
		for(int i=0; i<s1.length(); i++) {
			
			char c= s1.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z') {
				alpha +=c;
			}
			else if (c>='0' && c<='9' ) {
				num+=c;
				
			}
			else {
				spcl +=c;
			}
		}
		System.out.println(alpha+num+spcl);
	}

}
