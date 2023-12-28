package org.jsp.timestamp.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {

	@EmbeddedId
	private UserId id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String password;
	public UserId getId() {
		return id;
	}
	public void setId(UserId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
