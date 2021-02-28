package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
public class Passenger extends BaseEntity {
	
	@Column(length = 20)
	@NotBlank(message = "Name is required")
	@Length(min = 3,max=15,message = "Invalid len of Name")
	private String name;
	
	@Column(length = 20,unique =true)
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;
	
	
	@Column(name = "phone_no", length = 10)
	private String phoneNo;
	
	public Passenger() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Passenger(String name, String email, String phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
