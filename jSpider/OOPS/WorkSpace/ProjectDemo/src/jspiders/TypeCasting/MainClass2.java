package TypeCasting;

public class MainClass2 {
	public static void main(String[] args) {
		
		Demo4 d1 =  (Demo4)new Demo5();
		//System.out.println(d1.y);
		
		Demo5 d2 = (Demo5)new Demo4();
		
		System.out.println(d2.x);
		
		
		
		
	}

}
