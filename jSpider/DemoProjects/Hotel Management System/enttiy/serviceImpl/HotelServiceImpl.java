package serviceImpl;
import java.util.LinkedHashMap;
import java.util.Scanner;
import dao.HotelRepo;
import enttiy.Address;
import enttiy.Customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService, HotelRepo{
	Scanner sc = new Scanner(System.in);
	{
		for(int i = 1; i<=10; i++) {
			cm.put(i, null);
		}
//		cm.put(7, new Customer(null, 0, 0, null, null, null));
		for(int i = 1; i<=8; i++) {
			sm.put(i, null);
		}
		for(int i = 1; i<=5; i++) {
			dm.put(i, null);
		}
	}
	@Override
	public void roomInfo() {
		System.out.println("=============Classic Rooms=============");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: No");
		System.out.println("Tv: NO");
		System.out.println("WiFi: No");
		System.out.println("Price: 2000 Rs");
		System.out.println("=============Standard Rooms=============");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: No");
		System.out.println("Tv: Yes");
		System.out.println("WiFi: No");
		System.out.println("Price: 2500 Rs");
		System.out.println("=============Deluxe Rooms=============");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: Yes");
		System.out.println("Tv: Yes");
		System.out.println("WiFi: Yes");
		System.out.println("Price: 3500 Rs");
	}
	
	public void checkRoom(LinkedHashMap<Integer,Customer> l1) {
		boolean flag = false;
		for(Integer ele : l1.keySet()) {
			if(l1.get(ele)==null) {
				System.out.print(ele+" ");
			}
		}
		System.out.println();
		if(flag==false) {
			System.out.println("No Rooms Are Available");
		}
		
	}
	

	@Override
	public void availableRoom() {
		System.out.println("============Available Rooms===========");
		System.out.println("========Classic Rooms==========");
		checkRoom(cm);
		System.out.println("===========Standard Rooms========");
		checkRoom(sm);
		System.out.println("==========Deluxe Rooms========");
		checkRoom(dm);
		
	}
	
	Customer createCustomer() {
		System.out.println("Enter Customer Details");
		
		System.out.println("Enter Customer name");
		String cname = sc.next();
		System.out.println("Enter Customer Id:-");
		int cid = sc.nextInt();
		System.out.println("Enter Customer Phono");
		long cphno = sc.nextLong();
		System.out.println("Enter Customer Email");
		String cemail = sc.next();
		System.out.println("Enter Customer pan");
		String cpan = sc.next();
		System.out.println("Enter DoorNo");
		int doorno = sc.nextInt();
		System.out.println("Enter Street");
		String street = sc.next();
		System.out.println("Enter Dist");
		String dist =sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter Country");
		String country = sc.next();
		System.out.println("Enter PinCode:-");
		int pin = sc.nextInt();
			
		Address a = new Address(doorno, street, dist, state, country, pin);
		return new Customer(cname, cid , cphno, cemail, cpan, cphno, a);
	}
	
	public void mapRoom(LinkedHashMap<Integer,Customer> l1, int roomno, double amt) {
		if(l1.get(roomno)==null) {
			Customer c = createCustomer();
			a1.add(c);
			l1.put(roomno, c);
			c.setCamt(amt);
			System.out.println("Room No:"+roomno+" had been allocated for"+c.getcName());
			System.out.println("=====================================");
		}
		else {
			System.out.println("Room is not available....!!");
		}
		
	}

	@Override
	public void allocateRoom() {
		System.out.println("++++++Room Types+++++");
		System.out.println("1.Classic Rooms\n2.Standard Room\n3.Deluxe Rooms");
		System.out.println("Enter the Room type:-");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("-+-+Classic Rooms-+-+");
			System.out.println("Enter Room No:-");
			int roomno1 = sc.nextInt();
			if(roomno1>=1&&roomno1<=10) {
				mapRoom(cm,roomno1,2000);
			}else {
				System.out.println("Enter Correct Room No");
			}
		case 2:
			System.out.println("-+-+Strandard Room-+-+");
			System.out.println("Enter Room No:-");
			int roomno2 = sc.nextInt();
			if(roomno2>=1&&roomno2<=10) {
				mapRoom(sm,roomno2,2500);
			}else {
				System.out.println("Enter Correct Room No");
			}
		case 3:	
			System.out.println("-+-+Deluxe Room-+-+");
			System.out.println("Enter Room No:-");
			int roomno3 = sc.nextInt();
			if(roomno3>=1&&roomno3<=10) {
				mapRoom(dm,roomno3,3500);
			}else {
				System.out.println("Enter Correct Room No");
			}
			default : 
				System.out.println("");
		}
		
	}
	
	public void unmapRoom(LinkedHashMap<Integer, Customer>l1, int RoomNo) {
		if(l1.get(RoomNo)!=null) {
			Customer c1 = l1.get(RoomNo);
			System.out.println(c1);
			System.out.println(c1.getcName()+" need to pay"+ c1.getCamt()+" RS");
			l1.put(RoomNo, null);
		}else {
			System.out.println("Invalid RoomNo....!!!");
		}
		
	}

	@Override
	public void checkout() {
		System.out.println("1.Classic Rooms\n2.Standard Room\n3.Deluxe Rooms");
		System.out.println("Enter the Room type:-");
		int op1 = sc.nextInt();
		System.out.println("Enter the Room No:-");
		int roomno = sc.nextInt();
		switch(op1) {
		case 1:
			if(roomno>=1&&roomno<=10) {
				unmapRoom(cm,roomno);
				
			}else {
				System.out.println("Invalid RoomNo");
			}
			break;
		case 2:
			if(roomno>=1&&roomno<=8) {
				unmapRoom(sm,roomno);
				
			}else {
				System.out.println("Invalid RoomNo");
			}
			break;
		case 3:
			if(roomno>=1&&roomno<=5) {
				unmapRoom(dm,roomno);
				
			}else {
				System.out.println("Invalid RoomNo");
			}
			break;
		default:
			System.out.println("Invalid Option...");
		}
		
		
	}

	@Override
	public void findAllCustomer() {
		if(a1.size()==0) {
			System.out.println("Database is Empty...!!!!");
		}else {
			for(Customer ele: a1) {
				System.out.println(ele);
			}
		}
		
	}

	@Override
	public void getCustomerById() {
		boolean flag = false;
		System.out.println("Enter the Customer Id:-");
		int cid = sc.nextInt();
		for(Customer ele: a1) {
			if(ele.getCid()==cid) {
				System.out.println(ele);
				flag = true;
				break;
			}if(flag==false) {
				System.out.println("Invalid Customer ID");
			}
		}
		
	}

	

}
