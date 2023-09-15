package cabPackage;

public class Location {
	
	private String longitude;
	private String direction;
	private String latitude;
	
	
	
	public Location(String longitude, String direction, String latitude) {
		
		this.longitude = longitude;
		this.direction = direction;
		this.latitude = latitude;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public String getDirection() {
		return direction;
	}



	public void setDirection(String direction) {
		this.direction = direction;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	

	
	
	
	

}
