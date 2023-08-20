package DemoProjects;


public class Delivery_food {
	
	
	

}
class Pizza{
	
	String pizName;
	double pizzPrice=149.00;
	int    pizzItem;
	
	public Pizza(String pizName,int pizzItem) {
		this.pizName=pizName;
		this.pizzItem=pizzItem;
		// TODO Auto-generated constructor stub
	}
	
	double totalPrice(int n) {
		
		return pizzPrice*n;
	}
	
	void disp() {
		System.out.println("Confirmed Delivery");
		System.out.println("-------------------------------------------------");
		System.out.println("Pizza name : " +pizName);
		System.out.println("Pizza Price: " +pizzPrice);
		System.out.println("Total Item added : "+pizzItem);
		System.out.println("-------------------------------------------------");
		
		System.out.println("Total Fare: " +totalPrice(pizzItem));
		System.out.println("Thank You!! Visit Again....");
		
	}
}
class HomeFood{
	
	String foodName;
	double foodPrice =123.00;
	int    foodItem;
	
	public HomeFood(String foodName,int foodItem ) {
		this.foodName=foodName;
		this.foodItem=foodItem;
		
	}
	
    double totalPrice(int n) {
		
		return foodPrice*n;
	}
	
	void disp() {
		System.out.println("Confirmed Delivery");
		System.out.println("-------------------------------------------------");
		
		System.out.println("Food name : " +foodName);
		System.out.println("Food Price: " +foodPrice);
		System.out.println("Total Item added : "+foodItem);
		
	System.out.println("-------------------------------------------------");
		System.out.println("Total Fare: " +totalPrice(foodItem));
		System.out.println("Thank You!! Visit Again....");
		
	}
	
}
class FastFood{
	 
	
	String fast_foodName;
	double fast_foodPrice=99.00;
	int    fast_foodItem;
	
	
	public FastFood(String fast_foodName, int fast_foodItem) {
		this.fast_foodName = fast_foodName;
		this.fast_foodItem=fast_foodItem;
		
	}
	
      double totalPrice(int n) {
		
		return fast_foodPrice*n;
	}
	
	void disp() {
		System.out.println("Confirmed Delivery");
		System.out.println("-------------------------------------------------");
		System.out.println("Fast Food name : " +fast_foodName);
		System.out.println("Fast Food Price: " +fast_foodPrice);
		System.out.println("Total Item added : "+fast_foodItem);
		System.out.println("-------------------------------------------------");
		
		System.out.println("Total Fare: " +totalPrice(fast_foodItem));
		
	
		
		System.out.println("Thank You!! Visit Again....");
		
	}
}
//=======================================Codeby@3K=========================================================================
