package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.FlightAppUsers;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao uDao;
	
	@Override
	public FlightAppUsers validateUser(String email, String password) {
		System.out.println("in validate service");
		return uDao.authenticateUser(email, password);
	}

	@Override
	public void userRegister(String name, String email, String password) {
		uDao.userRegister(name, email, password);
		
	}

}
