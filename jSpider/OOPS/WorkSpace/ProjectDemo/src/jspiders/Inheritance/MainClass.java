package inheritance;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Students name");
		String sname= sc.nextLine();
		System.out.println("Enter Students Age");
		int age = sc.nextInt();
		System.out.println("Enter Students Roll no");
		int roll = sc.nextInt();
		System.out.println("Enter Students Marks");
		double marks= sc.nextDouble();
		System.out.println("Enter Students College name");
		String college = sc.next();
		System.out.println("Enter Students Gender");
		char gender = sc.next().charAt(0);
		
		Student s1 = new Student(sname, gender,age,roll,college,marks);
		System.out.println("================Students Details=================");
		s1.details();
		
		System.out.println("====================================================");
		System.out.println("Enter Employee name");
		String ename= sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Employee Age");
		int eage = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Gender");
		char egender = sc.next().charAt(0);
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		System.out.println("Enter Employee Designation");
		String degi= sc.next();
		System.out.println("Enter Employee Salary");
		double esal= sc.nextDouble();
		System.out.println("Enter Employee Exprience");
		int exp= sc.nextInt();
		Employee e1 = new Employee(ename,egender,eage,id,exp,esal,degi);
		System.out.println("================Employee Details=================");
		e1.details();
		System.out.println("==================================================");
		
		
		System.out.println("Enter Person name");
		String pname= sc.nextLine();
		System.out.println("Enter Person Age");
		int page = sc.nextInt();
		System.out.println("Enter Person Gender");
		char pgender = sc.next().charAt(0);
		
		Person p1 = new Person(pname,pgender,page);
		System.out.println("============== Person Details=========================");
		p1.details();
		System.out.println("======================================================");
		
		
		
		

	}

}
