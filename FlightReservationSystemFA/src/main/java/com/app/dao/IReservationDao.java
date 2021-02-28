package com.app.dao;

import com.app.pojos.Passenger;
import com.app.pojos.Reservation;

public interface IReservationDao {
	
	public Reservation getReservationByPassenger(Passenger p);
	public void register(Reservation r);
}
