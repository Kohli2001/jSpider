package preScreeningTest;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				int numsize = sc.nextInt();
				int[] arr1= new int[numsize];
				
				for(int i=0;i<numsize;i++) {
					arr1[i]=sc.nextInt();
				}
				
				int c=0;
				for(int i=0;i<numsize-1;i++) {
					if(arr1[i]+arr1[i+1]>0) {
						c++;
					}
				}
				
				System.out.println(c);
			}
		
	}

