package inheritance;

public class Student extends Person {
	
	 int rollno;
	 String collegename;
	 double marks;
	public Student(String name, char gender, int age, int rollno, String collegename, double marks) {
		super(name, gender, age);
		this.rollno = rollno;
		this.collegename = collegename;
		this.marks = marks;
		
	}
	 
	 void details() {
				
		System.out.println("Name:" +name+ "\nGender: "+gender+"\nAge: "+age+ "\nRoll No:" +rollno+"\nCollege Name: " +collegename+ "\nMarks:" +marks);
				
			
	 }
	 
	

}
