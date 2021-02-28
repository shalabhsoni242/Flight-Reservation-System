package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Flight_App_Users")
public class FlightAppUsers extends BaseEntity  {
	
	//name,email,password,phoneNO
	
	@Column(length = 20)
	@NotBlank(message = "Name is required")
	@Length(min = 3,max=15,message = "Invalid len of Name")
	private String name;
	
	@Column(length = 20,unique =true)
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;
	
	@Column(length = 20,nullable = false)
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message = "Blank or Invalid password")
	private String password;
	
	public FlightAppUsers() {
		System.out.println("in ctor of : "+getClass().getName());
	}	
	
	public FlightAppUsers(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

//	public List<String> getPhoneNos() {
//		return phoneNos;
//	}

//	public void setPhoneNos(List<String> phoneNos) {
//		this.phoneNos = phoneNos;
//	}

	@Override
	public String toString() {
		return "FlightAppUsers [name=" + name + ", email=" + email + ", password=" + password +"]";
	}
	
	
	
}
