package inheritance;

public class Employee extends Person {
	int id;
	double exp;
	double salary;
	String designation;
	
	
	
	public Employee(String name, char gender, int age, int id, double exp, double salary, String designation) {
		super(name, gender, age);
		this.id = id;
		this.exp = exp;
		this.salary = salary;
		this.designation = designation;
	}



	void details() {
		
		System.out.println("Name:" +name+ "\nGender: "+gender+"\nAge: "+age+ "\nId:" +id+"\nExprience" +exp+ "\nSalary:" +salary
				+"Desigation:"+designation);
		
	}
	
	
	

}
