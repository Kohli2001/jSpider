package inheritance;

public class Person {
	String name;
	char gender;
	int age;
	
	public Person(String name, char gender, int age) {
		
//		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void details() {
		System.out.println("Name:" +name+ "\nGender: "+gender+"Age: "+age);
		
	}
	
	
	
	
	

}
