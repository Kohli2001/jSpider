package org.jsp.manytomanybi.controller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomanybi.dto.Batch;
import org.jsp.manytomanybi.dto.Student;


public class SaveBatchAndStudents {

	public static void main(String[] args) {
		Batch b1 = new Batch();
		b1.setBatch_code("A1");
		b1.setSubject("Advanced Java");
		b1.setTrainer("keshava Sir");

		Batch b2 = new Batch();
		b2.setBatch_code("A2");
		b2.setSubject("Hibernate");
		b2.setTrainer("Sathish Sir");

		Batch b3 = new Batch();
		b3.setBatch_code("A3");
		b3.setSubject("SQL");
		b3.setTrainer("Swetha Maam");

		Student s1 = new Student();
		s1.setName("Niraj");
		s1.setEmail("nirajkumar@123gmai.com");
		s1.setPerc(60.0);
		s1.setPhone(6282458043l);
		s1.setYop(2023);

		Student s2 = new Student();
		s2.setName("Sukhir");
		s2.setEmail("sukhitkumar@123gmai.com");
		s2.setPerc(66.0);
		s2.setPhone(6282457654l);
		s2.setYop(2023);

		Student s3 = new Student();
		s3.setName("Kamlesh");
		s3.setEmail("kumarkumarkohli@123gmai.com");
		s3.setPerc(63.0);
		s3.setPhone(9693631293l);
		s3.setYop(2023);

		List<Student> forb1 = new ArrayList<Student>(Arrays.asList(s1, s2, s3));
		List<Student> forb2 = new ArrayList<Student>(Arrays.asList(s1, s3));
		List<Student> forb3 = new ArrayList<Student>(Arrays.asList(s2, s3));

		b1.setStudents(forb1);
		b2.setStudents(forb2);
		b3.setStudents(forb3);
		
		List<Batch> fors1= new ArrayList<Batch>(Arrays.asList(b1,b2,b3));
		List<Batch> fors2= new ArrayList<Batch>(Arrays.asList(b1, b3));
		List<Batch> fors3= new ArrayList<Batch>(Arrays.asList(b2,b3));
		
		s1.setBatches(fors1);
		s2.setBatches(fors2);
		s3.setBatches(fors3);
		
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);

		transaction.begin();
		transaction.commit();
		
		System.out.println("Student and Batch has been saved........");

	}
}
