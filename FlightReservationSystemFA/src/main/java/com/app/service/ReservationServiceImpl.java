package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IReservationDao;
import com.app.pojos.Passenger;
import com.app.pojos.Reservation;

@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	private IReservationDao rDao;
	
	@Override
	public void register(Reservation r) {
		rDao.register(r);
	}

	@Override
	public Reservation getReservationByPassenger(Passenger p) {
		// TODO Auto-generated method stub
		return rDao.getReservationByPassenger(p);
	}

}
