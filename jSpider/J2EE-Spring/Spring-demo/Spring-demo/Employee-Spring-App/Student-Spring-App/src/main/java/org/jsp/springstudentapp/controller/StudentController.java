package org.jsp.springstudentapp.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.jsp.springstudentapp.StudentConfig;
import org.jsp.springstudentapp.dao.StudentDaoImp;
import org.jsp.springstudentapp.dto.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentController {
	
	private static Scanner sc = new Scanner(System.in);
	private static StudentDaoImp dao;
	
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		 dao = context.getBean(StudentDaoImp.class);
	}
	
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
		System.out.println("===================Welcome To Spring Student App==============");
		System.out.println("----------------------------------------------------------");
		System.out.println(
				"1.Save Student\n2.Update Student\n3.Find Student By Roll No\n4.Verify Student By email and Password"
						+ "\n5.Verify Student By Id and Password\n6.Find Student By DOB\n7.Find student By Age"
						+ "\n8.Find Student By name\n9.Find Student By Email\n10.Delete Student\n11.Exit ");
		System.out.println("--------------------Enter Your Choice------------------");
		switch (sc.nextInt()) {
		case 1:
			save();
			break;
		case 2:
			update();
			break;
		case 3:
			findById();
			break;
		case 4:
			verifyByEmail();
			break;
		case 5:
			verifyById();
			break;
		case 6:
			findByDob();
			break;
		case 7:
			findByAge();
			break;
		case 8:
			findByName();
			break;
		case 9:
			findByEmail();
			break;
		case 10:
			delete();
			break;
		case 11:
			flag=false;
			System.exit(0);
			
		default:
			System.out.println("Invalid Choice...Pls Wakeup and open Your Eyes");
			break;
		}
	}
	}
	
	static void save() {
		System.out.println("Enter the Student name, age,DOB(YYYY-MM-DD),Email id ,Marks and Password to save the Student ");
		Student s = new Student();
		s.setName(sc.next());
		s.setAge(sc.nextInt());
		s.setDob(LocalDate.parse(sc.next()));
		s.setEmail(sc.next());
		s.setMarks(sc.nextDouble());
		s.setPassword(sc.next());
		dao.saveStudent(s);
		System.out.println("Student Registered Successfully with Roll No: "+s.getId());
	}
	static void update() {
		System.out.println("Enter the Student Id to update");
		int id = sc.nextInt();
		System.out.println("Enter the Student name, age,DOB(YYYY-MM-DD),Email id ,Marks and Password to Update the Student ");
		Student s = new Student();
		s.setId(id);
		s.setName(sc.next());
		s.setAge(sc.nextInt());
		s.setDob(LocalDate.parse(sc.next()));
		s.setEmail(sc.next());
		s.setMarks(sc.nextDouble());
		s.setPassword(sc.next());
		Student st = dao.updateStudent(s);
		if(st!=null) {
			System.out.println("Student With id: " +st.getId()+" Updated succesfully..!");
		}
		else {
			System.err.println("Cna't Update due to Invalid Id ");
		}
		
	}
	static void delete() {
		System.out.println("Enter the Student Id to Delete the Student");
		int id = sc.nextInt();
		dao.deleteStudent(id);
		
	}
	static void findById() {
		System.out.println("Enter the Student Id to find the Student Details");
		int id = sc.nextInt();
		Student s = dao.findById(id);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.err.println("Invalid Entered Id !");
		}
		
	}
	static void findByAge() {
		System.out.println("Enter the Student age to find the Student Details");
		int age = sc.nextInt();
		List<Student> students = dao.findByAge(age);
		if(students!=null) {
			System.out.println(students);
		}
		else {
			System.err.println("Invalid Entered Age !");
		}
	}
	static void findByName() {
		System.out.println("Enter the Student Name to find the Student Details");
		String name =sc.next();
		List<Student> students = dao.findByName(name);
		if(students!=null) {
			System.out.println(students);
		}
		else {
			System.err.println("Invalid Entered Name !");
		
		}
	}
	static void findByDob() {
		System.out.println("Enter the Student DOB(YYYY-MM-DD) to find the Student Details");
		String dob = sc.next();
		List<Student> students = dao.findByBod(LocalDate.parse(dob));
		if(students!=null) {
			System.err.println(students);
		}
		else {
			System.err.println("Invalid Entered Id !");
		}
	}
	static void findByEmail() {
		System.out.println("Enter the Student Email ID to find the Student Details");
		String email = sc.next();
		Student s = dao.findByEmail(email);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.err.println("Invalid Entered Email Id !");
		}
	}
	static void verifyById() {
		System.out.println("Enter the Student Id And Pssword to Verify the Student");
		int id = sc.nextInt();
		String password = sc.next();
		Student s = dao.verify(id, password);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.err.println("Invalid Credential! Id  or Passoword!");
		}
	}
	static void verifyByEmail() {
		System.out.println("Enter the Student Email Id And Pssword to Verify the Student");
		String email = sc.next();
		String password = sc.next();
		Student s = dao.verify(email, password);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.err.println("Invalid Credential! Email Id  or Passoword!");
		}
	}

}
