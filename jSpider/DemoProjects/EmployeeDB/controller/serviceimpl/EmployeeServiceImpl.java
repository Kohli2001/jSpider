package serviceimpl;

import java.util.ArrayList;
import java.util.Scanner;



import entity.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner ip = new Scanner(System.in);
	ArrayList<Employee> l1 = new ArrayList<Employee>();

	@Override
	public void addEmp() {
		System.out.println("++++++++++Enter Employee Details+++++++++++");
		System.out.println("Enter employee Id: ");
		int eId = ip.nextInt();
		System.out.println("Enter Employee Name: ");
		String eName = ip.next();
		System.out.println("Enter Employee Designation:");
		String eDesignation = ip.next();
		System.out.println("Enter Employee Sal: ");
		double eSal = ip.nextDouble();
		System.out.println("Enter Employee Phone No:");
		long ePhno = ip.nextLong();
		System.out.println("Enter Employee Age: ");
		int eAge = ip.nextInt();
		l1.add(new Employee(eId, eName, eDesignation, eSal, ePhno, eAge));
		System.out.println("Employee Added Sucessfully..!!!!!!");

	}


	@Override
	public void getAllEmp() {
		System.out.println("++++++++++Employee Details+++++++++++++");
		if (l1.size() == 0) { // l1.isEmpty()
			System.out.println("Iddiot there are no employees....!!");
		} else {
			for (Employee emp : l1) {
				System.out.println(emp);
			}
		}

	}

	@Override
	public void getEmpyByid() {
		System.out.println("Enter employee Id:- ");
		int e_Id = ip.nextInt();
		System.out.println("Searching Employee By Eid....!!!!");
		boolean flage = false;
		for (Employee ele : l1) {
			if (ele.geteId() == e_Id) {
				System.out.println(ele);
				flage = true;
				break;
			}
		}
		if (flage == false) {
			System.out.println("Eid Not Found");
		}

	}

	@Override
	public void findEmpByRangSal() {
		System.out.println("Enter Employee lowest range....!!!!");
		double l = ip.nextDouble();
		System.out.println("Enter Employee higest range.....");
		double h = ip.nextDouble();
		System.out.println("Searching Employee By Salary....!!!");
		boolean flage = false;
		for (Employee ele : l1) {
			if (ele.geteSal() >= l && ele.geteSal() <= h) {
				System.out.println(ele);
				flage = true;

			}
		}
		if (flage == false) {
			System.out.println("Employeee Not Found.......!!!!!!");
		}

	}

	@Override
	public void getEmpBySal() {
		System.out.println("Enter Employee Salary:- ");
		double esal = ip.nextDouble();
		System.out.println("Searching Employee By Salary....!!!!");
		boolean flage = false;
		for (Employee ele : l1) {
			if (ele.geteSal() == esal) {
				System.out.println(ele);
				flage = true;
				break;
			}
		}
		if (flage == false) {
			System.out.println("Not Found");
		}

	}

	@Override
	public void findEmpbyDesgn() {
		System.out.println("Enter Employee Desgnation:- ");
		String edesgnation = ip.next();
		System.out.println("Searching Employee By Desgnation....!!!!");
		boolean flage = false;
		for (Employee ele : l1) {
			if (ele.geteDesignation() == edesgnation) {
				System.out.println(ele);
				flage = true;
				break;
			}
		}
		if (flage == false) {
			System.out.println("Not Found");
		}

	}

	@Override
	public void findEmpByAge() {
		System.out.println("Enter Employee Age:- ");
		int eage = ip.nextInt();
		System.out.println("Searching Employee By Age....!!!!");
		boolean flage = false;
		for (Employee ele : l1) {
			if (ele.geteAge() == eage) {
				System.out.println(ele);
				flage = true;
				break;
			}
		}
		if (flage == false) {
			System.out.println("Not Found");
		}

	}

	@Override
	public void updateEmpByEid() {
		System.out.println("Enter Emplpoyee EID..");
		int eid = ip.nextInt();
		Employee e = null;
		for (Employee ele : l1) {
			if (ele.geteId() == eid) {
				e = ele;
				break;
			}
		}
		if (e != null) {
			System.out.println("===Menu for update===");
			System.out.println("1.Name\n2.Desgination\n3.Salary\n4.Phone no\n5.Age");
			System.out.println("Emnter Option..");
			int op = ip.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter Name:-");
				String name = ip.next();
				e.seteName(name);
				break;
			case 2:
				System.out.println("Enter Desgination.");
				String desg = ip.next();
				e.seteDesignation(desg);
				break;
			case 3:
				System.out.println("Enter Salary:- ");
				double esal = ip.nextDouble();
				e.seteSal(esal);
				break;
			case 4:
				System.out.println("Enter Phone no:-");
				long ephno = ip.nextLong();
				e.setePhone(ephno);
				break;
			case 5:
				System.out.println("Enter Age:-");
				int eage = ip.nextInt();
				e.seteAge(eage);
				break;
			default :
				System.out.println("Invalid option..");

			}

		} else {
			System.out.println("Eid Not Found");
		}

	}


	@Override
	public void removeEmpByEid() {
		boolean flage = false;
		System.out.println("Enter Employee EID:-");
		int eid = ip.nextInt();
		for(int i=0; i<l1.size(); i++) {
			if (eid==l1.get(i).geteId()) {
				l1.remove(i);
				System.out.println("Employee Removed....!!!");
				flage = true;
				break;
			}
		}
		if (flage == false) {
			System.out.println("Eid Not Found");
		}

		
		
	}

}
