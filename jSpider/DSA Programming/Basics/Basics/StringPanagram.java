package org.dsa.basics;

import java.util.HashSet;
import java.util.Scanner;

public class StringPanagram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1=scanner.next();
		s1=s1.toLowerCase();
		HashSet s2 = new HashSet();
		
		for(int i=0; i<s1.length(); i++) {
			int c= s1.charAt(i);
			if(c>='a' && c<='z') {
				s2.add(s1.charAt(i));
			}
		}
		if(s2.size()==26) {
			System.out.println("String Panagram");
		}
		else {
			System.out.println("Not a String Panagram");
		}
	}

}
