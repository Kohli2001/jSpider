package preScreeningTest;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sizes");
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        sc.nextLine();
        
        for (int i = 0; i < rows; i++) {
            String[] row = sc.nextLine().split(" ");
            int sum = 0;
            
            for (int j = 0; j < cols; j++) {
                int decimalValue = Integer.parseInt(row[j],2);
                
                sum += decimalValue;
            }
            System.out.println(sum);
        }
            
           
        }
    }

	

        

