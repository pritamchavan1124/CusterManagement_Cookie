package com.pojo;

public class User {
	
	private int userid;
	private String custFName;
	private String custLName;
	private String city;
	private String email;
	private String password;
	
	public User(int userid, String custFName, String custLName, String city, String email, String password) {
		super();
		this.userid = userid;
		this.custFName = custFName;
		this.custLName = custLName;
		this.city = city;
		this.email = email;
		this.password = password;
	}

	public User() {
		
	}

	@Override
	public String toString() {
		return "User [userid =" + userid + ", custFName =" + custFName + ", custLName =" + custLName + ", city =" + city
				+ ", email =" + email + ", password =" + password + "]";
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCustFName() {
		return custFName;
	}

	public void setCustFName(String custFName) {
		this.custFName = custFName;
	}

	public String getCustLName() {
		return custLName;
	}

	public void setCustLName(String custLName) {
		this.custLName = custLName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
	
	
	
	
	
	

}
