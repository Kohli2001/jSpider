package org.jsp.springstudentapp.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.springstudentapp.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
	private EntityManager manager;

	@Override
	public void saveStudent(Student s) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(s);
		transaction.begin();
		transaction.commit();
	}

	@Override
	public Student updateStudent(Student s) {
		Student stDb = manager.find(Student.class, s.getId());
		if(stDb!=null) {
		stDb.setName(s.getName());
		stDb.setAge(s.getAge());
		stDb.setDob(s.getDob());
		stDb.setEmail(s.getEmail());
		stDb.setMarks(s.getMarks());
		stDb.setPassword(s.getPassword());
		manager.persist(stDb);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		return stDb;
		}
		else {
			return null;
		}
	}

	@Override
	public void deleteStudent(int id) {
		Student s = manager.find(Student.class, id);
		if(s!=null) {
			manager.remove(s);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			System.out.println("student With Id:" + id + "Deleted!");
		}
		else {
			System.err.println("Invalid Id: as no Student present with this ID: "+id);
		}
	}

	@Override
	public Student findById(int id) {
		Student st = manager.find(Student.class, id);
		return st;
	}

	@Override
	public Student findByEmail(String email) {
		Query q = manager.createQuery("select s from Student s where s.email=?1");
		q.setParameter(1, email);
		return (Student) q.getSingleResult();
	}

	@Override
	public List<Student> findByName(String name) {
		Query q = manager.createQuery("select s from Student s where s.name=?1");
		q.setParameter(1, name);
		return q.getResultList();
	}

	@Override
	public List<Student> findByAge(int age) {
		Query q = manager.createQuery("select s from Student s where s.age=?1");
		q.setParameter(1, age);
		return q.getResultList();
	}

	@Override
	public List<Student> findByBod(LocalDate dob) {
		Query q = manager.createQuery("select s from Student s where s.dob=?1");
		q.setParameter(1, dob);
		return q.getResultList();
	}

	@Override
	public Student verify(String email, String password) {
		Query q = manager.createQuery("select s from Student s where s.email=?1 and s.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		return (Student) q.getSingleResult();
	}

	@Override
	public Student verify(int id, String Password) {
		Query q = manager.createQuery("select s from Student s where s.id=?1 and s.password=?2");
		q.setParameter(1, id);
		q.setParameter(2, Password);
		return (Student) q.getSingleResult();
	}

}
