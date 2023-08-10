import java.util.Scanner;


class MainClass3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name");
        String ename = sc.nextLine();

        System.out.println("Enter employee Id");
        int eid = sc.nextInt();

        System.out.println("Enter employee Salary");

        Double esalary = sc.nextDouble();

        Employee e1 = new Employee(ename, eid, esalary);

        System.out.println("Employee Id: " +eid);
        System.out.println("Employee Name: " +ename);
        System.out.println("Employee Salary: " +esalary);
        
    }
}