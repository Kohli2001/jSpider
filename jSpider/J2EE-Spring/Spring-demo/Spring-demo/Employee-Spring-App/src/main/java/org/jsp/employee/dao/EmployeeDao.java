package org.jsp.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import java.util.List;

import org.jsp.employee.dto.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private EntityManager manager;

	public Employee saveEmployee(Employee e) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(e);
		transaction.begin();
		transaction.commit();
		return e;
	}

	public Employee updateEmployee(Employee e) {
		EntityTransaction transaction = manager.getTransaction();
		Employee empdb = manager.find(Employee.class, e.getId());
		if (empdb != null) {
			empdb.setName(e.getName());
			empdb.setEmail(e.getEmail());
			empdb.setDesig(e.getDesig());
			empdb.setPhone(e.getPhone());
			empdb.setPassword(e.getPassword());
			empdb.setSalary(e.getSalary());
			manager.persist(empdb);
			transaction.begin();
			transaction.commit();
			return empdb;
		}
		return null;
	}

	public Employee findEmpById(int id) {
		Employee e = manager.find(Employee.class, id);
		return  e;
	}

	public Employee verifyEmployee(long phone, String password) {
		Query q = manager.createQuery("select e from Employee e where e.phone=?1 and e.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		
		return (Employee) q.getSingleResult();
	}

	public Employee verifyEmployee(String email, String password) {
		Query q = manager.createQuery("select e from Employee e where e.email=?1 and e.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		
		return (Employee) q.getSingleResult();
	}

	public Employee verifyEmployee(int id, String password) {
		Query q = manager.createQuery("select e from Employee e where e.id=?1 and e.password=?2");
		q.setParameter(1, id);
		q.setParameter(2, password);
		
		return (Employee) q.getSingleResult();
	}

	public List<Employee> findEmpByDesg(String desig) {
		Query q = manager.createQuery("select e from Employee e where e.desig=?1");
		q.setParameter(1, desig);
		  List<Employee> emp = q.getResultList();
		  
		return emp;
	}

	public List<Employee> findEmpByName(String name) {
		Query q = manager.createQuery("select e from Employee e where e.name=?1");
		q.setParameter(1, name);
		  List<Employee> emp = q.getResultList();
		  
		return emp;
	}

	public List<Employee> findEmpBySalary(double salary) {
		Query q = manager.createQuery("select e from Employee e where e.salary=?1");
		q.setParameter(1, salary);
		  List<Employee> emp = q.getResultList();
		  
		return emp;
		
	}

	public List<Employee> filter(double salary1, double salary2) {
	    Query q = manager.createQuery("select e from Employee e where e.salary between ?1 and ?2");
	    q.setParameter(1, salary1);
	    q.setParameter(2, salary2);

	    return q.getResultList();
	}

}
