package org.jsp.manytooneuni.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(nullable = false)
	private String name, founder;
	
	@Column(nullable = false)
	private int year_of_estb;

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

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getYear_of_estb() {
		return year_of_estb;
	}

	public void setYear_of_estb(int year_of_estb) {
		this.year_of_estb = year_of_estb;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", founder=" + founder + ", year_of_estb=" + year_of_estb
				+ "]";
	}
	
	
	
	
	
	
	
}
