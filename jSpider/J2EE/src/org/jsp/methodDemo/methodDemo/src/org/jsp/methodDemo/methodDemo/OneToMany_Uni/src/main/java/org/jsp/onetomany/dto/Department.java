package org.jsp.onetomany.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String location;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> emps;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Employee> getEmps() {
		return emps;
	}


	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + ", emps=" + emps + "]";
	}
	
	
	
}
