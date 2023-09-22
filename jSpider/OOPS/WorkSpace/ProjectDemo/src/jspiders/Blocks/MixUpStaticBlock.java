package blocks;

public class MixUpStaticBlock {
	int x=10;
	static int y=20;
	
	MixUpStaticBlock(){
		System.out.println("const 1.......");
	}
	
	{
		System.out.println("non static block ");
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static {
		int y=200;
		System.out.println("static block 1");
		System.out.println(y);
	}
	public static void main(String[] args) {
		System.out.println("main methods stated");
		new MixUpStaticBlock();
		System.out.println("main methods ended");
	}

}
