package overRiding;

public class Son extends Father {
	
	@Override
	void house() {
//		System.out.println("================Overriding the Fathers house==========");
		System.out.println("Duplex House");
		
	}
	void laptop() {
		System.out.println("Macbook");
	}
	void computer() {
		System.out.println("16 Gb Ram");
	}

}
