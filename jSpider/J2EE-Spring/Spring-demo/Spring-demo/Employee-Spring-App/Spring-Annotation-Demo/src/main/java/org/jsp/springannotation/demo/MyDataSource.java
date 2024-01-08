package org.jsp.springannotation.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {

	@Value(value = "jdbc:mysql//localhost:3306/Test_DB")
	private String url;
	@Value(value = "root")
	private String usename;
	@Value(value = "tiger")
	private String password;
	@Value(value = "com.mysql.cj.jdbc.Driver")
	private String driverclass;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsename() {
		return usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverclass() {
		return driverclass;
	}

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}

}
