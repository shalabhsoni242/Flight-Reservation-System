package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Flights;

@Repository
public class FlightDaoImpl implements IFlightDao {

	@Autowired
	private EntityManager mgr;

	
	@Override
	public List<Flights> getFlightByPlaceNDate(String depCity1, String arrivalCity1, LocalDate depDate1) {
		System.out.println("in getFlightByPlaceNDate method "+depCity1+" "+arrivalCity1+" "+depDate1);		
		String jpql = "select f from Flights f where f.depCity=:depCity and f.arrivalCity=:arrivalCity and f.depDate=:depDate";
		return mgr.createQuery(jpql, Flights.class).setParameter("depCity", depCity1).setParameter("arrivalCity", arrivalCity1).setParameter("depDate", depDate1).getResultList();
	}
	
	@Override
	public List<Flights> getAllFightDetails(){
		String jpql = "select f from Flights f";
		return mgr.createQuery(jpql, Flights.class).getResultList();
	}
	
	@Override
	public Flights getFlightDetailsByID(int id) {
		String jpql = "select f from Flights f where f.id=:id";
		return mgr.createQuery(jpql, Flights.class).setParameter("id", id).getSingleResult();
	}

}
