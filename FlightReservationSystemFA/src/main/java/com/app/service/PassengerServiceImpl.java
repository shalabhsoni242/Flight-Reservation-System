package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IPassengerDao;
import com.app.pojos.Passenger;

@Service
@Transactional
public class PassengerServiceImpl implements IPassengerService {

	@Autowired
	private IPassengerDao pDao;
	
	@Override
	public void registerPssenger(String name, String email, String pno) {
		pDao.registerPssenger(name, email, pno);

	}

	@Override
	public Passenger getPassengerByEmail(String email) {
		return pDao.getPassengerByEmail(email);
	}

}
