package DemoProjects;
import java.util.Scanner;

public class Menu {
	//public static void main(String[] args) {
	
	void MenuDetails() {
		
	  Scanner sc = new Scanner(System.in);
		
		System.out.println("=========Menu========");
		System.out.println("Enter \n1.Delivery Food\n2.Dining Food\n3.Exit");
		int  op = sc.nextInt();
		
		if(op==1) {
		
			System.out.println("......Delivery Foods Categories.....");
			System.out.println("1.Fast Food\n2.Home Food\n3.Pizza");
			int ans = sc.nextInt();
			
			switch (ans) {
			case 1:{
				System.out.println("=========Choosed Category <Fast Food>==========");
				System.out.println("Enter choice of fast food?");
				String name = sc.next();
				System.out.println("Enter total number plate you Want!");
				int item = sc.nextInt();
				FastFood oder1 = new FastFood(name, item);
				oder1.totalPrice(item);
				oder1.disp();
						break;
			}
			case 2:{
				System.out.println("=========Choosed Category <Home Food>==========");
				System.out.println("What You wish to Eat??");
				String name = sc.next();
				System.out.println("Enter total number plate you Want!");
				int item = sc.nextInt();
				HomeFood order1 = new HomeFood(name, item);
				order1.totalPrice(item);
				order1.disp();
				break;
			}
			
			case 3:{
				System.out.println("=========Choosed Category <Pizza>==========");
				System.out.println("What Kind of Pizza you wish to Eat??");
				String name = sc.next();
				System.out.println("Enter total number pizza you Want!");
				int item = sc.nextInt();
				Pizza order1 = new Pizza(name, item);
				order1.totalPrice(item);
				order1.disp();
				break;
			}

			default:
				System.out.println("Invalid Categories....Choose Again!!");
				
				break;
			}
			
		}
		
		else if (op==2) {
			System.out.println("......Dining Foods Categories.....");
			
			System.out.println("Press \n1.Near By Restaurants\n2.Famous Restaurants\n3.Top rated Reataurants");
			
			int ans = sc.nextInt();
			switch (ans) {
			case 1:{
				System.out.println("========Near By Restuarants List===========");
				System.out.println("Choose From below metions \n1.Ultimate Punjabi\n2.Litti Twist\n3.Khmer Kitchen\n4.Narmala House");
				int choose = sc.nextInt();
				if(choose==1) {
					System.out.println("===========Welcome to Ultimate Punjabi=======");
					System.out.println("-------------------------------------------------------");
					UltimatePunjabi c1 = new UltimatePunjabi();
					c1.details();
					
				}
				else if (choose==2) {
					System.out.println("===========Welcome to Litti Twist=======");
					System.out.println("-------------------------------------------------------");
					LittiTwist c1 = new LittiTwist();
					c1.details();
					
				}
				else if(choose==3) {
					System.out.println("===========Welcome to Khmer Kitchen=======");
					System.out.println("-------------------------------------------------------");
					KhmerKitchen c1 = new KhmerKitchen();
					c1.details();
					
				}
				else if(choose==4) {
					System.out.println("===========Welcome to Narmala House=======");
					System.out.println("-------------------------------------------------------");
					NarmalaHouse c1 = new NarmalaHouse();
					c1.details();
					
				}
				else {
					System.out.println("Please select Within given Restaurants");
				}
				
				break;
			}
			case 2:{
				System.out.println("========Famous Restuarants List===========");
				System.out.println("Choose From below metions \n1.Casa Piclosa\n2.Empire Restaurant\n3.Taproom Byshocklate \n4.Delight Restaurant");
				
				int choose = sc.nextInt();
				if(choose==1) {
					System.out.println("===========Welcome to Casa Piclosa=======");
					System.out.println("-------------------------------------------------------");
					CasaPiclosa c1 = new CasaPiclosa();
					c1.details();
					
				}
				else if (choose==2) {
					System.out.println("===========Welcome to Empire Restaurant=======");
					System.out.println("-------------------------------------------------------");
					EmpireRestaurant c1 = new EmpireRestaurant();
					c1.details();
					
				}
				else if (choose==3) {
					System.out.println("===========Welcome to Taproom Byshocklate =======");
					System.out.println("-------------------------------------------------------");
					TaproomByshocklate c1 = new TaproomByshocklate();
					c1.details();
					
				}
				else if (choose==4) {
					System.out.println("===========Welcome to Delight Restaurant =======");
					System.out.println("-------------------------------------------------------");
					DelightRestaurant c1 = new DelightRestaurant();
					c1.details();
					
				}
				else {
					System.out.println("Please select Within given Restaurants");
				}
				break;
			}
			case 3:{
				System.out.println("========Top Rated Restuarants List===========");
				System.out.println("Choose From below metions \n1.LE ARABIA Restaurant\n2.AB's Restaurant\n3.Spice Terrace\n4.Karavelli Restaurant");
				int choose = sc.nextInt();
				if (choose==1) {
					System.out.println("===========Welcome to LE ARABIA Restaurants=======");
					System.out.println("-------------------------------------------------------");
					LeArabia c1 = new LeArabia();
					c1.details();
						
				}
				else if (choose==2) {
					System.out.println("===========Welcome to AB'S Restaurants=======");
					System.out.println("-------------------------------------------------------");
					ABs c1 = new ABs();
					c1.details();
					
				}
				else if (choose==3) {
					System.out.println("===========Welcome to Spice Terrace =======");
					System.out.println("-------------------------------------------------------");
					SpiceTerrace c1 = new SpiceTerrace();
					c1.details();
					
				}
				else if (choose==4) {
					System.out.println("===========Welcome to Karavelli Restaurant ========");
					System.out.println("-------------------------------------------------------");
					Karavelli c1 = new Karavelli();
					c1.details();
				}	
				break;
			}
				
				

			default:
				System.out.println("Soryy!...Please choose category correctly");
				break;
			}
			
			
		}
		else if (op==3) {
			System.out.println("Application Closed");
			System.exit(0);
			
			
		}
		
	}	

}


//=======================================Codeby@3K=========================================================================
