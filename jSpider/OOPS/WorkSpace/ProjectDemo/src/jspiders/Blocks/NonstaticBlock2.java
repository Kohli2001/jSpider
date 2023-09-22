package blocks;

public class NonstaticBlock2 {
	
	//as many time we created a new objcet of that many times it get execuated 
	
	{
		System.out.println("non static block 1");
	}
	{
		System.out.println("non static block 2");
	}
	{
		System.out.println("non static block 3");
	}
	public static void main(String[] args) {
		System.out.println("main methods started ");
		new NonstaticBlock2();
		System.out.println("=======================================");
		new NonstaticBlock2();
	}
	{
		System.out.println("non static block 4");
		
	}

}
