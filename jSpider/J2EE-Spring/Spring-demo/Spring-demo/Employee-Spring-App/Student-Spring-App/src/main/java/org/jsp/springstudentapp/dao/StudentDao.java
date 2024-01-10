package org.jsp.springstudentapp.dao;

import java.time.LocalDate;
import java.util.List;

import org.jsp.springstudentapp.dto.Student;

public interface StudentDao {

	//all the methods are by default public  abstract and data member are public static final int m = 200;

	void saveStudent(Student s );

	Student updateStudent(Student s);

	void deleteStudent(int id);

	Student findById(int id);

	Student findByEmail(String email);

	List<Student> findByName(String name);

	List<Student> findByAge(int age);

	List<Student> findByBod(LocalDate dob);
	
	Student verify(String email, String password);
	
	Student verify(int id, String Password);
	
	

}
