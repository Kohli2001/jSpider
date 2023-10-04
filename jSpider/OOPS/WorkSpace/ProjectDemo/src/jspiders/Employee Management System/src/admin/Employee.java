package admin;

public class Employee {
	
	private final int eId;
	private String eName;
	private double eSalary;
	private char eGender;
	private int eAge;
	
	
	public Employee(int eId, String eName, double eSalary, char eGender, int eAge) {

		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eGender = eGender;
		this.eAge = eAge;
	}


	public int geteId() {
		return eId;
	}

	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public double geteSalary() {
		return eSalary;
	}


	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}


	public char geteGender() {
		return eGender;
	}


	public void seteGender(char eGender) {
		this.eGender = eGender;
	}


	public int geteAge() {
		return eAge;
	}


	public void seteAge(int eAge) {
		this.eAge = eAge;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + eId + ", Name=" + eName + ", Salary=" + eSalary + ", Gender=" + eGender + ", Age="
				+ eAge + "]";
	}
	
	
	
	
	
			
	
	
	
	

}
