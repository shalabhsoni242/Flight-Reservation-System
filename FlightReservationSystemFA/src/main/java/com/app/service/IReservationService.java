package com.app.service;

import com.app.pojos.Passenger;
import com.app.pojos.Reservation;

public interface IReservationService {
	public void register(Reservation r);
	public Reservation getReservationByPassenger(Passenger p);
}
