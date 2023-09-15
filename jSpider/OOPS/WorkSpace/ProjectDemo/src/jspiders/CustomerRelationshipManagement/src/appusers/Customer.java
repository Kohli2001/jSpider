package appusers;



public class Customer {
	
  private String customer_name;
  private int customer_Id;
  private long customer_Phone;
  
  private Address a1;

public Customer(String customer_name, int customer_Id, long customer_Phone,String houseNo,
		int pincode, String street, String city, String state) {
	
	this.customer_name = customer_name;
	this.customer_Id = customer_Id;
	this.customer_Phone = customer_Phone;
	
	this.a1=new Address(houseNo,pincode,street,city,state);
	
}

public String getCustomer_name() {
	return customer_name;
}

public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}

public int getCustomer_Id() {
	return customer_Id;
}

public void setCustomer_Id(int customer_Id) {
	this.customer_Id = customer_Id;
}

public long getCustomer_Phone() {
	return customer_Phone;
}

public void setCustomer_Phone(long customer_Phone) {
	this.customer_Phone = customer_Phone;
}

public Address getA1() {
	return a1;
}

public void setA1(Address a1) {
	this.a1 = a1;
}


public void displayAddress( ) {
	
}


  
 
  
  
 
	

}
