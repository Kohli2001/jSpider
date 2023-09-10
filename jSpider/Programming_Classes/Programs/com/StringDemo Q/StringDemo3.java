package com;

import java.util.Scanner;

public class StringDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int alpha=0, num=0, spcl=0;
		for(int i=0 ; i<s.length(); i++) {
			char c = s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				alpha++;
			}
			else if (c>='0' && c<='9') {
				num++;
			}
			else {
				spcl++;
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spcl);
		
		
	}

}
