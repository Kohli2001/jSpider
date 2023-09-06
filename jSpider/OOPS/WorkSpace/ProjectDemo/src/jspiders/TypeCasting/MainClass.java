package TypeCasting;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.square(5));
		System.out.println((int)c1.square(5.0));
	}

}
