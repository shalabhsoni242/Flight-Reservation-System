package com.app.service;

import com.app.pojos.FlightAppUsers;

public interface IUserService {
	FlightAppUsers validateUser(String email, String password);
	public void userRegister(String name, String email, String password);
}
