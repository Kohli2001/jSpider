package inheritance;

public class A {

	A(){
		this(10);
		System.out.println("constructor 1");
	}
	A(int a){
		this(2,10.0);
		System.out.println("Constructor 2");
	}
	A(int a, double b){
		
		System.out.println("Constructor 3");
	}
}




