package com.app.service;

import com.app.pojos.Passenger;

public interface IPassengerService {
	public void registerPssenger(String name, String email, String pno);
	Passenger getPassengerByEmail(String email);
}
