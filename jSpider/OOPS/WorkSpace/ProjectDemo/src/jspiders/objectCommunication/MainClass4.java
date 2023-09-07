package objectCommunication;

public class MainClass4 {
	public static void main(String[] args) {
		
		Sample4 s1 = new Sample4();
		Demo4 ref1 = s1.test();
		
		System.out.println(ref1.x);
		System.out.println(ref1.y);
	}

}
