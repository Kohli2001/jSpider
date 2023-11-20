package org.dsa.basics;

public class StringProblem {
	
	static void sort(char [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String s="hellohibye";
		s=s.toLowerCase();
		String v="";
		String con="";
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v=v+s.charAt(i);
				char[] arr=v.toCharArray();
				sort(arr);
		}
		else {     
				con=con+s.charAt(i);
	            char[] arr1=con.toCharArray();
	            sort(arr1);         
	        } 
		}
		String res = con+v;
		System.out.println(res);
		
	}
}
