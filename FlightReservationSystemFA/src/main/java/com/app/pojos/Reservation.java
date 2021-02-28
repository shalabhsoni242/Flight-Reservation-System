package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends BaseEntity  {
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "p_id")
	private Passenger pId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "f_id")
	private Flights fId;
	
	public Reservation() {
		System.out.println("in ctor of "+getClass().getName());
	}
	
	

	public Reservation(Passenger pId, Flights fId) {
		super();
		this.pId = pId;
		this.fId = fId;
	}



	public Passenger getpId() {
		return pId;
	}



	public void setpId(Passenger pId) {
		this.pId = pId;
	}



	public Flights getfId() {
		return fId;
	}



	public void setfId(Flights fId) {
		this.fId = fId;
	}



	@Override
	public String toString() {
		return "Reservation : id : "+getId();
	}
	
	
	
}
