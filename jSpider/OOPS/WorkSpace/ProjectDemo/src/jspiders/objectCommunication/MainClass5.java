package objectCommunication;

public class MainClass5 {
public static void main(String[] args) {
		
		Sample5 s1 = new Sample5();
		
		Demo5 ref1 = s1.test();
		
		ref1.x=100;
		ref1.y=200;
		
		ref1=s1.test();
		System.out.println(ref1.x);
		System.out.println(ref1.y);
	}

}
