package com;

public class StringDemo4 {
	public static void main(String[] args) {
		//count the vowels and consonents 
		String s = "helloZkamlesh";
			s=s.toLowerCase();
		int vow=0, cons=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vow++;
			}
			 else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {        
	                cons++;    
	            }  
		}
		System.out.println(vow);
		System.out.println(cons);
		
	}

}
