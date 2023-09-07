package objectCommunication;

public class MainClass6 {
	public static void main(String[] args) {
		Sample6 s1 = new Sample6();
		
		Demo6 ref1 = s1.test(100, 200);
		System.out.println(ref1.x);
		System.out.println(ref1.y);
	}

}
