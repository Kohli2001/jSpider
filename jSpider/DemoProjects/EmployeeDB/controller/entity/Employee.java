package entity;

public class Employee {

	private int eId;
	private String eName;
	private String eDesignation;
	private double eSal;
	private long ePhone;
	private int eAge;

	public Employee(int eId, String eName, String eDesignation, double eSal, long ePhone, int eAge) {
		this.eId = eId;
		this.eName=eName;
		this.eDesignation = eDesignation;
		this.eSal = eSal;
		this.ePhone = ePhone;
		this.eAge = eAge;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}
	                               

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	public long getePhone() {
		return ePhone;
	}

	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eDesignation=" + eDesignation + ", eSal=" + eSal + ", ePhone=" + ePhone
				+ ", eAge=" + eAge + "]";
	}
	
	

}
