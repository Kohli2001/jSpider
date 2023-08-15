package com;
import java.util.Scanner;

public class loo9 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter any number for counting");
		int n = scanner.nextInt();
		// TODO Auto-generated method stub
		for(int i =1 ; i <=10; i++) {
			System.out.println( n+"X"+i+ "= " +n*i);
		}

	}

}
