package repository;

import admin.Employee;

public class EmployeeDB {
	
	private Employee[] empdb;
	private int index=0;
	
	public EmployeeDB(int size) {
		empdb =new Employee[size];
	}
	
	public void addEmployee(Employee e) {
		if(index<empdb.length) {
			empdb[index++]=e;
		}
		else {
			System.out.println("Database is Full...");
		}
		
	}
	
	public void viewEmployeeRecords() {
		for(Employee e :empdb) {
			if(e!=null) {
				System.out.println(e.geteId()+"\t"+e.geteName()+"\t"+e.geteSalary()+"\t"+e.geteGender()+"\t"+e.geteAge());
			}
		}
	}
	
	public Employee getEmployee(int id) {
		Employee emp = null;
		for(Employee e : empdb) {
			if(e!=null && e.geteId()==id) {
				emp=e;
				System.out.println("Employee Found in DB");
				break;
			}
		}
		return emp;
	}

}
