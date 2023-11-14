package ControllApp;

import java.util.Scanner;

import service.HotelService;
import serviceImpl.HotelServiceImpl;

public class HotelApp {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		HotelService h1 = new HotelServiceImpl();
		System.out.println("===========Welcome To Management System=========");
		while(true) {
			System.out.println("==========Menu===========");
			System.out.println("1.Room Details\n2.AvailableRoom\n3.Allocated Room\n4.Checkout\n5.All Customer details\n6.find customer by Id\n7Exit");
			System.out.println("Enter the Option");
			int op = ip.nextInt();
			switch(op) {
			case 1: h1.roomInfo();break;
			case 2: h1.availableRoom(); break;
			case 3: h1.allocateRoom(); break;
			case 4: h1.checkout(); break;
			case 5: h1.findAllCustomer(); break;
			case 6:	h1.getCustomerById(); break;
			case 7: 
				System.out.println("Thank you for visit");
				System.exit(0);
			default: 
				System.out.println("Invalid option");
			}
			
		
			
		}
	}
}
