package twoDArray;

import java.util.Iterator;
import java.util.Scanner;

public class TwroDarrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("taking input from user mention size first");
		int size1 = sc.nextInt();
		int size2= sc.nextInt();
		//creating 2d array
		
		int[] outer= new int[size1];
		int[] inner= new int[size2];
		
		for(int i=0; i<outer.length; i++) {
			outer[i]=sc.nextInt();
		}
		for(int i=0; i<inner.length; i++) {
			inner[i]=sc.nextInt();
		}
		
	}

}
