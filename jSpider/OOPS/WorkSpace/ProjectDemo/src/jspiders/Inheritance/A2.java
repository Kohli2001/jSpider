package inheritance;

public class A2 {
	A2(){
		this(16);
		
		System.out.println("A2 cons 1");
	}
	A2(int a){
		
		System.out.println("A2 const 2");
	}
}
class A3 extends A2{
	
	A3(){
		this(12,13);
		System.out.println("A3 cons 1");
	}
	A3(int a, int b){
		System.out.println("A3 cons 2");
	}
	
}
