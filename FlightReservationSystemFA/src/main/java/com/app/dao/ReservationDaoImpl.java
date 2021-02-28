package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Passenger;
import com.app.pojos.Reservation;

@Repository
public class ReservationDaoImpl implements IReservationDao {

	@Autowired
	private EntityManager mgr;
	
	@Override
	public void register(Reservation r) {
		mgr.persist(r);
	}

	@Override
	public Reservation getReservationByPassenger(Passenger p) {
		String jpql = "select r from Reservation r where r.pId=:p";
		
		return mgr.createQuery(jpql, Reservation.class).setParameter("p",p).getSingleResult();
	}

}
