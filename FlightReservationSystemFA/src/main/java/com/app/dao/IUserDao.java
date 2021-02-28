package com.app.dao;

import com.app.pojos.FlightAppUsers;

public interface IUserDao {
	void userRegister(String name, String email, String password);
	FlightAppUsers authenticateUser(String email, String password);
}
