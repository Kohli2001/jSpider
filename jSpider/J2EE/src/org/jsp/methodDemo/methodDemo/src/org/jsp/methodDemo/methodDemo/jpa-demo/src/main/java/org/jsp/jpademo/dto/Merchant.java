package org.jsp.jpademo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQuery(name="findbyname", query="select m from Merchant m  where m.name=?1")
@NamedQueries(value = {
		@NamedQuery(name = "findbyphone", query="select m from Merchant m where m.phone=?1 and m.password=?2"),
		@NamedQuery(name = "findbyemail", query="select m from Merchant m where m.email=?1 and m.password=?2"),
		@NamedQuery(name = "findbyid", query="select m from Merchant m where m.id=?1 and m.password=?2")
})
@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false, unique = true)
	private long phone;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, unique = true)
	private String gt_number;
	@Column(nullable = false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGt_number() {
		return gt_number;
	}
	public void setGt_number(String gt_number) {
		this.gt_number = gt_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
