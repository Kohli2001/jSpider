package inheritance;

public class A1 {
	A1(){
		this(10);
		System.out.println("Cons 1");
	}
	A1(int n){
		this("Hello");
		System.out.println("cons 2");
	}
	A1(int a , int b){
		
		System.out.println("Const 3");
	}
	A1(String n){
		this(10,20);
		System.out.println("const 4");
	}

}
