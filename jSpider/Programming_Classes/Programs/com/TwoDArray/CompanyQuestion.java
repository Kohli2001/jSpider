package twoDArray;

import java.util.Scanner;

public class CompanyQuestion {
	
public static void main(String[] args) {
		String[] arr= {" ","*#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int simpleSum=0,buttonPressSum=0,complexSum=0;
		String s2="";
		String string="kamlesh";
		for(int i=0;i<string.length();i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr[j].length();k++) {
					if(string.charAt(i)==arr[j].charAt(k)) {
						simpleSum=simpleSum+j;
						String s3 ="";
						for(int m=0;m<=k;m++) {
							s2=s2+j;
							s3=s3+j;
							buttonPressSum=buttonPressSum+j;
						}
						s2=s2+" ";
						complexSum=complexSum+Integer.parseInt(s3);
					
					}
				}
			}
		}
				System.out.println("Button Press Pattern : "+s2);
				System.out.println("Simple Sum of button press : "+simpleSum);
				System.out.println("Button Press All Times Sum : "+buttonPressSum);
				System.out.println("Sum of  Button Press Pattern : "+ complexSum);
		}
}
	
	

