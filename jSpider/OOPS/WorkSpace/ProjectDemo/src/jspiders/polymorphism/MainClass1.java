package polymorphism;

public class MainClass1 {
	public static void main(String[] args) {
		
		Demo1 d1;
		d1=new Demo2();
		d1.wish();

System.out.println("=========================================");

Demo1 d2 = new Demo1();
d2.wish();


	}

}
