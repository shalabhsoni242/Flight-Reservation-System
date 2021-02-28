package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Passenger;

@Repository
public class PassengerDaoImpl implements IPassengerDao {

	@Autowired
	EntityManager mgr;
	
	@Override
	public void registerPssenger(String name, String email, String pno) {
		mgr.persist(new Passenger(name, email, pno));
	}
	
	@Override
	public Passenger getPassengerByEmail(String email) {
		String jpql = "select p from Passenger p where p.email=:email";
		return mgr.createQuery(jpql, Passenger.class).setParameter("email", email).getSingleResult();
	}
}
