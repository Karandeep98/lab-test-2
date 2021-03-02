package com.question3.customer.dao;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phone_number;
	private Date dob;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Customer() {}
	
	public Customer(int id, String name, String address, String phone_number, Date dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.dob = dob;
	}
	public Customer(String name, String address, String phone_number, Date dob) {
		
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.dob = dob;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", name=").append(name).append(", address=").append(address)
				.append(", phone_number=").append(phone_number).append(", dob=").append(dob).append("]");
		return builder.toString();
	}
	
}
