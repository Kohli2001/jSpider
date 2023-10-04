package admin;

public class EmployeeCreation {
	
	private static int initId=1001;
	
	public static Employee create( String eName, double eSalary, char eGender, int eAge) {
		
		Employee e1 = new Employee(initId++, eName, eSalary, eGender, eAge);
		
		return e1;
	}

}

//it has single task or single responsibility.....................


