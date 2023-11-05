package org.jsp.methodDemo;

public class PrintDetails {
	
	static void printDetails(Person p) {
		System.out.println("name: " +p.getName() );
		System.out.println("Age: "+p.getAge());
		System.out.println("Gender "+p.getGender());
		System.out.println("Phone "+p.getPhone());
		
	}
	
	public static void main(String[] args) {
		Person p = new Person(23, "kamlesh", "male", 343544647);
		printDetails(p);
	}

}
