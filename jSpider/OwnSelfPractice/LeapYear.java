
package OwnSelfPractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter any year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println("Given Year is A Leap Year ");

        }
        else{
            System.out.println("Sorry! Given Year is NOT a Leap Year");
        }
    }
    
}
