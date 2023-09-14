package Association;

public class MainClass4 {
	public static void main(String[] args) {
		
		Sample4 s1 = new Sample4();
		
		System.out.println(s1.d1.x);
		s1.d1.disp();
		
		s1.d1.x=200;
		
		s1=new Sample4();
		System.out.println(s1.d1.x);
		
	}

}
