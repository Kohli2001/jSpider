package DemoProjects;

import java.util.Scanner;

public class Dining_Food {

}


class Food_Reastaurant{
	Scanner sc = new Scanner(System.in);
	
	void RestaurantsFood(){
		
		System.out.println("Do You want to Order food from This Reastaurants??\n1.Yes\n2.No");
		int  choice = sc.nextInt();
		if (choice==1) {
			System.out.println("Press\n1.Veg\n2.Non-Veg");
			int ch = sc.nextInt();
			if (ch==1) {
				System.out.println("************Vegeterian Categories*****************");
				System.out.println("1.Fast Food\n2.Homies Food\n3.Pizza");
				System.out.println("........Please Select from mention above........");
				int select = sc.nextInt();
				if (select==1) {
					Menu m3 = new Menu();
					m3.Fast_food_MenuDetails();
					
				}
				else if (select==2) {
					Menu m3 = new Menu();
					m3.Home_Food_MenuDetails();
				}
				else if (select==3) {
					Menu m3 = new Menu();
					m3.pizza_MenuDelivery();
					
				}
			}
			else if (ch==2) {
				System.out.println("************Non-Vegeterian Categories*****************");
				System.out.println("1.Fast Food\n2.Homies Food\n3.Pizza");
				System.out.println("........Please Select from mention above........");
				int select = sc.nextInt();
				if (select==1) {
					Menu m3 = new Menu();
					m3.Fast_food_MenuDetails();
					
				}
				else if (select==2) {
					Menu m3 = new Menu();
					m3.Home_Food_MenuDetails();
				}
				else if (select==3) {
					Menu m3 = new Menu();
					m3.pizza_MenuDelivery();
					
				}
					
				}
				
			}
			
			
//	}	
		else if (choice==2) {
			System.out.println("Okay Thank you!..Visit Again");
				
		}
	}
	
}
//Near by Restaurants classes/list 
class UltimatePunjabi{
	double price= 1560.00;
	String location="BTM Layout,jp Nagar,5th Cross ,2nd Building";
	String rating=" 3.3/5 ";
	String status="Open";
	
	void details() {
		
		System.out.println("Price /2 person:" +price);
		System.out.println("Location: " +location);
		System.out.println("Rating: " +rating);
		System.out.println("Currentely : "+status);
		
		System.out.println("=============================================");
		Food_Reastaurant f1= new Food_Reastaurant();
		f1.RestaurantsFood();
		
	}
	
}
class LittiTwist{
	
	double price= 2500.00;
	String location="BTM Layout,jp Nagar,18th Cross, Front Building";
	String rating=" 3.8/5 ";
	String status="Open";
	
       void details() {
		
		System.out.println("Price /2 person:" +price);
		System.out.println("Location: " +location);
		System.out.println("Rating: " +rating);
		System.out.println("Currentely : "+status);
		
		System.out.println("=============================================");
		Food_Reastaurant f1= new Food_Reastaurant();
		f1.RestaurantsFood();
	}
}
class KhmerKitchen{
	double price= 3500.00;
	String location="Banarghatta road ,jp Nagar,3rd  Cross, luxury delux apartments ";
	String rating=" 4.0/5 ";
	String status="Open";
	
	
	
	 void details() {
			
			System.out.println("Price /2 person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
	
}
class NarmalaHouse{
	double price= 4500.00;
	String location="Banarghatta road ,jp Nagar,13th Cross, Royal Heritage Building ";
	String rating=" 4.3/5 ";
	String status="Off";
	
	 void details() {
			
			System.out.println("Price /2 person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			System.out.println("Ohhhh!! Sorry Its Closed Right Now");
//			Food_Reastaurant f1= new Food_Reastaurant();
//			f1.RestaurantsFood();
		}
	
}

//famous Restaurants list or classes 

class CasaPiclosa{
	
	double price= 6500.00;
	String location="MG road ,9th Cross, Royal Heritage Building ";
	String rating=" 4.3/5 ";
	String status="Open Now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
	
}
class EmpireRestaurant{
	double price= 15000.00;
	String location="MG road ,3rd Cross, Royal Classic Heritage ";
	String rating=" 4.7/5 ";
	String status="Open Now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
	
}
class TaproomByshocklate{
	
	double price= 27000.00;
	String location="Diagonal Road , Bangalore ,India";
	String rating=" 4.7/5 ";
	String status="Open Now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
	
	 }
	 
}

class DelightRestaurant{
	
	double price= 27950.00;
	String location="Pan Asian , 3rd Floor , 222 vittal , Bangalore";
	String rating=" 4.7/5 ";
	String status="closed";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			System.out.println("Ohhhh!! Sorry Its Closed Right Now");
		}
	
	
}
//Top rated restaurants list 

//LE ARABIA Restaurant\n2.AB's Restaurant\n3.Spice Terrace\n4.24@43 Restaurant

class  LeArabia{

	double price= 27950.00;
	String location="no 15 , Bannerghatta Main Rd , Bangalore";
	String rating=" 4.0/5 ";
	String status="Open Now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
	
}
class ABs{

	double price= 39990.00;
	String location="2nd Floor CPR Tower, 100 feet Ring Rd,  Bangalore";
	String rating=" 4.3/5 ";
	String status="Open now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
}
class SpiceTerrace{
	
	double price= 49990.00;
	String location="North Indian, 24JW Marriott bengaluru 1, Vittal Mall";
	String rating=" 4.6/5 ";
	String status="Open now";
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
			Food_Reastaurant f1= new Food_Reastaurant();
			f1.RestaurantsFood();
		}
	 
}
class Karavelli{
	double price= 39560.00;
	String location="Vivanta , 66 , Residency Rd ,bangeluru";
	String rating=" 4.6/5 ";
	String status="closed";
	
	
	 void details() {
			
			System.out.println("Price per person:" +price);
			System.out.println("Location: " +location);
			System.out.println("Rating: " +rating);
			System.out.println("Currentely : "+status);
			
			System.out.println("=============================================");
//			Food_Reastaurant f1= new Food_Reastaurant();
//			f1.RestaurantsFood();
			System.out.println("Ohhhh!! Sorry Its Closed Right Now");
			
		}
	
}
//=======================================Codeby@3K=========================================================================
