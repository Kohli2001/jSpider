package objectCommunication;

public class MainClass3 {
	public static void main(String[] args) {
		
		Sample3 s1 = new Sample3();
		Demo3 ref1 = new Demo3();
		
		   s1.test(ref1, 50, 75);
		   
		   System.out.println(ref1.x);
		   System.out.println(ref1.y);
		   
	}

}
