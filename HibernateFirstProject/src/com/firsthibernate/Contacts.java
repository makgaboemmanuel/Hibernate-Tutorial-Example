package com.firsthibernate;
// Generated 02 Sep 2020 10:42:48 AM by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * Contacts generated by hbm2java
 */
public class Contacts implements java.io.Serializable {

	private Long id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String address;
	private long companyId;
	private Date createdAt;
	private Date updatedAt;

	public Contacts() {
	}

	public Contacts(String firstName, String lastName, String phone, String email, String address, long companyId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.companyId = companyId;
	}

	public Contacts(String firstName, String lastName, String phone, String email, String address, long companyId,
			Date createdAt, Date updatedAt) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.companyId = companyId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		/*
		 * 	private Long id;
			private String firstName;
			private String lastName;
			private String phone;
			private String email;
			private String address;
			private long companyId;
			private Date createdAt;
			private Date updatedAt; */
		
		// TODO Auto-generated method stub
		return "id:" + id + ", firstName: " + firstName + ", lastName: " +  lastName  + ", phone: " + 
				phone + ", email: " + email + ", address: " + address + ", companyId: " + ", createdAt: " + 
				"updatedAt: " + updatedAt;
	}
}
