package blocks;

public class StaticBlock2 {
	
	//anyhow it will execute static block first then only it will start executing main methods 
	
	static {
		System.out.println("static block 1");
		
	}
	static{
		System.out.println("sttsic block 2");
	}
	public static void main(String[] args) {
		System.out.println("main methods started");
	}
	
	static {
		System.out.println("ststic block 3");
	}
	static {
		System.out.println("static block 4");
	}

}
