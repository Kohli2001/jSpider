package jspiders.p3;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee(3101, "Kamlesh" , 25000.00);
		
		System.out.println("Employee Id: "+e1.getId());
		System.out.println( "Employee Name: "+e1.getName());
		System.out.println("Employee Salary:  "+e1.getSalary());
		
		System.out.println("modifying the private variables using setter");
		
		e1.setSalary(35000.00);
		System.out.println("Employee Salary:  "+e1.getSalary());
		

	}

}
