package TypeCasting;

public class MainClass1 {
	public static void main(String[] args) {
		
		Demo3 d1 = new Demo3();
		
		Demo2 d2 = d1;
		
		Demo1 d3 = d1;
		 
		System.out.println("x values " +d1.x);
		d1.test();
		
		System.out.println("y values " +d2.y);
		d2.disp();
		System.out.println("z values " +d1.z);
		d1.vies();
		
	}

}
