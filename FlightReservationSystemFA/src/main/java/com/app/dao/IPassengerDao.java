package com.app.dao;

import com.app.pojos.Passenger;

public interface IPassengerDao {
	public void registerPssenger(String name, String email, String pno);

	public Passenger getPassengerByEmail(String email);
}
