package org.jsp.springdemo;

public class JdbcProperties {

	String driver, url, user, password;

	public JdbcProperties() {

	}

	public JdbcProperties(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void displayProperties() {
		System.out.println("driver Class: " + driver);
		System.out.println("url: " + url);
		System.out.println("User: " + user);
		System.out.println("Passowrd: " + password);

	}

}
