package org.jsp.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomany.dto.Department;
import org.jsp.onetomany.dto.Employee;

public class SaveDeptAndEmps {

	public static void main(String[] args) {
		Department d = new Department();
		d.setName("Development");
		d.setLocation("Jspider BTM Layout, Banagalore");

		Employee e1 = new Employee();
		e1.setName("Kamlesh Kumar Kohli");
		e1.setDesg("Software Developer");
		e1.setSalary(4500000.00);

		Employee e2 = new Employee();
		e2.setName("Sukhit Kumar");
		e2.setDesg("Software Tester");
		e2.setSalary(3500000.00);

		Employee e3 = new Employee();
		e3.setName("Raja Kumar");
		e3.setDesg("SQL Developer");
		e3.setSalary(3500000.00);

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		d.setEmps(emps);

		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(d);
		t.begin();
		t.commit();
		System.out.println("Employee saved in the Database");

	}

}
