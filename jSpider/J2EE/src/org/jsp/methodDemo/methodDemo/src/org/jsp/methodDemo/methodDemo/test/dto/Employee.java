package org.jsp.test.dto;

public class Employee {
	private int eId;
	private String eName;
	private String eDesignation;
	private double eSalary;
	private long ePhone;
	private String eEmail;
	private String ePassword;
	
	
	
	public Employee() {
		
	}
	
	public Employee(int eId, String eName, String eDesignation, double eSalary, long ePhone, String eEmail,
			String ePassword) {
		
		this.eId = eId;
		this.eName = eName;
		this.eDesignation = eDesignation;
		this.eSalary = eSalary;
		this.ePhone = ePhone;
		this.eEmail = eEmail;
		this.ePassword = ePassword;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
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
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public long getePhone() {
		return ePhone;
	}
	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	
	
	
		

}
