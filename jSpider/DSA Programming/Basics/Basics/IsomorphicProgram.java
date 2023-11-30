package org.dsa.basics;

public class IsomorphicProgram {
	
	static String countSeqFreq(String s) {
		s=s+" ";
		String ans="";
		int c=1;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				ans=ans+c;
				c=1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s1="aabcc1";
		String s2="xxyzz";
		if(s1.length()!=s2.length()) {
			System.out.println("Not a isomarphic");
		}
		else {
			System.out.println(countSeqFreq(s1).equals(countSeqFreq(s2))?"Isomarphic":"not a isomarphic");
			
		}
		
	}

}
