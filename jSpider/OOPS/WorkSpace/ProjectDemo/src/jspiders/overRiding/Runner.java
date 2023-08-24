package overRiding;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Son s1 = new Son();
		s1.house();
		s1.computer();
		s1.laptop();
		
		System.out.println("===========Father======");
		Father f1 = new Father();
		f1.computer();
		f1.house();
	}

}
