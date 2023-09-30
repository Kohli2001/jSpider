package advancedArrayString;

import java.util.Arrays;

public class FindAddedString {
	public static void main(String[] args) {

//		//Q. compare two given string and find the extra element present in the given String 
		String s1 = "abcd";
		String s2 = "abcde";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s3=""; String s4="";
		for(int i=0;i<c1.length;i++) {
			s3=s3+c1[i];
			s4=s4+c2[i];	
		}
		if(s3.equals(s4)) {
			for(int i=c1.length;i<c2.length;i++) {
				System.out.print(c2[i]);
			}
		}
			
		
	}
}
