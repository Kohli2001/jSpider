package blocks;

public class NonstaticBlock1 {
	
	//non static block will excute only when object will create 
	
	{
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main methods started ");
		
		new NonstaticBlock1();
		
		
		
	}

}
