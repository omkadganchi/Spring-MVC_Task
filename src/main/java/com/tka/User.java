package com.tka;

public class User {

	String name;
	String password;
	String mobile;
	
	public User(String name, String password, String mobile) {
		super();
		this.name = name;
		this.password = password;
		this.mobile = mobile;
	}

	public User(String password, String mobile) {
		super();
		this.password = password;
		this.mobile = mobile;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return  "[name=" + name + ", password=" + password + ", mobile=" + mobile + "]";
	}
	
	
}
