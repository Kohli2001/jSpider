package cabPackage;

public class Cab {
	
	private String cab_Number;
	private String cab_DriverPhone;
	private String cab_model;
	private String cab_color;
	private String cab_Type;
	private Location pickup;
	private Location drop;
	
	
	public Cab(String cab_Number, String cab_DriverPhone, String cab_model, String cab_color, String cab_Type,
			String longitude, String direction, String latitude) {
		
		this.cab_Number = cab_Number;
		this.cab_DriverPhone = cab_DriverPhone;
		this.cab_model = cab_model;
		this.cab_color = cab_color;
		this.cab_Type = cab_Type;
		this.pickup = new Location(longitude,direction,latitude);
		this.drop= new Location(longitude,direction,latitude);
	}


	public String getCab_Number() {
		return cab_Number;
	}


	public void setCab_Number(String cab_Number) {
		this.cab_Number = cab_Number;
	}


	public String getCab_DriverPhone() {
		return cab_DriverPhone;
	}


	public void setCab_DriverPhone(String cab_DriverPhone) {
		this.cab_DriverPhone = cab_DriverPhone;
	}


	public String getCab_model() {
		return cab_model;
	}


	public void setCab_model(String cab_model) {
		this.cab_model = cab_model;
	}


	public String getCab_color() {
		return cab_color;
	}


	public void setCab_color(String cab_color) {
		this.cab_color = cab_color;
	}


	public String getCab_Type() {
		return cab_Type;
	}


	public void setCab_Type(String cab_Type) {
		this.cab_Type = cab_Type;
	}


	public Location getPickup() {
		return pickup;
	}


	public void setPickup(Location pickup) {
		this.pickup = pickup;
	}


	public Location getDrop() {
		return drop;
	}


	public void setDrop(Location drop) {
		this.drop = drop;
	}
	
	
	
	
	
		
	

}
