package polymorphism;

public class Demo1 {
	
	void wish() {
		System.out.println("Hi");
	}

}
 class Demo2 extends Demo1 {
	 
	 void wish() {
		 super.wish();
		 System.out.println("Bye");
	 }
	
}
