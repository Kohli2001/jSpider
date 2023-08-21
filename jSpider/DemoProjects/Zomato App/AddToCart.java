package DemoProjects;
import java.util.Scanner;

public class AddToCart {
	
	int foodItem=0;
//	double totalPrice=0.0;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	void nextOrder() {
		System.out.println("Do You Want More??\n1.Yes\n2.No");
		int ans = sc.nextInt();
		if (ans==1) {
			Food_Reastaurant f1 = new Food_Reastaurant();
			f1.RestaurantsFood();
			}
		else if (ans==2) {
			System.out.println("Thanks.....");
			
		}
			
		}
	
	 void addToCart(int additionalItems) {
			foodItem += additionalItems; // Increment the item count
			
//			totalPrice += foodPrice * additionalItems; // Update the total price
		}
		
	}
	
	


