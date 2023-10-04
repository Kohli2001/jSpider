package admin;

import repository.EmployeeDB;

public class Mainclass1 {
	public static void main(String[] args) {
		EmployeeDB db1 = new EmployeeDB(5);
		
		Employee e1 =  EmployeeCreation.create("kamlesh",12383923.00, 'm', 27);
		Employee e2 = EmployeeCreation.create("Ajay", 453770.00, 'm', 28);
		Employee e3 = EmployeeCreation.create("sukhit", 453770.00, 'm', 22);
		Employee e4 = EmployeeCreation.create("RAMESH", 7.00, 'f', 38);
		Employee e5 = EmployeeCreation.create("Akku", 702163164.00, 'f', 23);
		Employee e6 = EmployeeCreation.create("Ranu Mandal", 7.00, 'f', 38);
		Employee e7 = EmployeeCreation.create("Ajay", 79876545.00, 'm', 22);
		Employee e8 = EmployeeCreation.create("Raja", 13746275.00, 'm', 21);
		
		
		db1.addEmployee(e1);
		db1.addEmployee(e2);
		db1.addEmployee(e4);
		
		System.out.println("EmpId\tName\tSalary\tGender\tAge");
		System.out.println("------------------------------------------");
		db1.viewEmployeeRecords();
		
		System.out.println("=================================================");
		
		Employee e=db1.getEmployee(1004);
		System.out.println(e);
		
		
//		System.out.println(e1.geteId());
//		System.out.println(e2.geteId());
//		System.out.println(e3.geteId());
//		System.out.println(e4.geteId());
		
	}

}
