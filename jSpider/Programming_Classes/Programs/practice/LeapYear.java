package practice;
import java.util.Scanner;;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("enter a Year");
		int year = sc.nextInt();
		
		if (year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("Given number is A leap Year");
			
		}
		else {
			System.out.println("Given year is not a leap year");
		}

	}

}
}
