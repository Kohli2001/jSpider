package jspider.client;


//OTT Platform 
//use java bean class

public class User {
	private String name;
	private long phonenum;
	private String email;
	private String password;
	private int age;
	
	
	public User(String name, long phonenum, String email, String password, int age) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.password = password;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhonenum() {
		return phonenum;
	}


	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
