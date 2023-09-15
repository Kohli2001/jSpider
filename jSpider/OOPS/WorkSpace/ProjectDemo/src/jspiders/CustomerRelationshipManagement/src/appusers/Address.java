package appusers;

public class Address {
	private String houseNo;
	private int pincode;
	private String street;
	private String city;
	private String state;
	
	public Address(String houseNo, int pincode, String street, String city, String state) {
		
		this.houseNo = houseNo;
		this.pincode = pincode;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	

}
