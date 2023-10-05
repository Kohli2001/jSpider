package advancedArrayString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TotalPalindromInFile {
	
	static boolean isPalindrome(String s) {
		String s1="";
		for(int i=s.length()-1; i>=0; i--) {
			s1=s1+s.charAt(i);
			
		}
		return s1.equals(s);
		
	}

	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("data.txt");
		BufferedReader bf= new BufferedReader(f1);
		String s1="";
		int w=0;
		while((s1=bf.readLine())!=null){
			String[] arr=s1.split(" ");
			for(String ele:arr) {
				if(isPalindrome(ele)) 
					System.out.println(ele);
				
			}
			w++;
			
			
		}
		
		
		
	}
}
