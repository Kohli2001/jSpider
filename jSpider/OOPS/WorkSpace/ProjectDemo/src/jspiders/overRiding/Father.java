package overRiding;

public class Father extends GrandFather{
	
	@Override
	void house() {
		System.out.println("3 BHK");
	}
	void computer() {
		System.out.println("8 GB Ram");
	}
}
