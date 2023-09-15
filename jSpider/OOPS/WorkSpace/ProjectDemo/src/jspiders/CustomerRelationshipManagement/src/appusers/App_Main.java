package appusers;

public class App_Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Kamlesh",123,123456788l,"304",851131,"SH-55","Begusarai","Bihar");
		
		System.out.println("Customer name: "+c1.getCustomer_name());
		System.out.println("Customer State: " +c1.getA1().getState());
		System.out.println("Pincode: " +c1.getA1().getPincode());
		System.out.println("City "+c1.getA1().getCity() );
		
		
		System.out.println("changing houseno ");
		
		c1.getA1().setHouseNo("999");
		
		System.out.println("new house number is " +c1.getA1().getHouseNo());
		
		System.out.println("changing Complete Address");
		
		Address newA1 = new Address("1000" , 56007, "NH-31" ,"JP Nagar" ,"Karnatka");
		
		c1.setA1(newA1);
		System.out.println("===========================New Address====================== ");
		
		System.out.println("Customer name: "+c1.getCustomer_name());
		System.out.println("Customer State: " +c1.getA1().getState());
		System.out.println("Pincode: " +c1.getA1().getPincode());
		System.out.println("City "+c1.getA1().getCity() );

}
}
