package com.app.pojos;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="airlines")
public class Flights extends BaseEntity {
	//AirlineName, Departure City, Dep time , arrival city, departure date
	
	@Column(name = "flight_name", length = 20)
	private String flightName;
	
	@Column(name = "departure_city", length = 20)
	private String depCity;
	
	@Column(name = "arrival_city", length = 20)
	private String arrivalCity;
	
	@Column(name = "departure_time")
	private Time depTime;
	
	@Column(name = "departure_date" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate depDate;

	public Flights() {
		System.out.println("in ctor of "+getClass().getName());
	}

	public Flights(String flightName, String depCity, String arrivalCity, Time depTime, LocalDate depDate) {
		super();
		this.flightName = flightName;
		this.depCity = depCity;
		this.arrivalCity = arrivalCity;
		this.depTime = depTime;
		this.depDate = depDate;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Time getDepTime() {
		return depTime;
	}

	public void setDepTime(Time depTime) {
		this.depTime = depTime;
	}
	
	public LocalDate getDepDate() {
		return depDate;
	}

	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}
	

	@Override
	public String toString() {
		return "Flights [flightName=" + flightName + ", depCity=" + depCity + ", arrivalCity=" + arrivalCity
				+ ", depTime=" + depTime +", depDate=" + depDate+ "id = "+getId()+"]";
	}

	
	
	
	
	
}
