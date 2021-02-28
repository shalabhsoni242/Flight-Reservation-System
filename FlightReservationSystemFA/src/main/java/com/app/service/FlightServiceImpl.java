package com.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IFlightDao;
import com.app.pojos.Flights;


@Service
@Transactional
public class FlightServiceImpl implements IFlightService {

	@Autowired
	private IFlightDao fDao;
	
	@Override
	public List<Flights> getFlightByPlaceNDate(String depCity, String arrivalCity, LocalDate depDate) {
		System.out.println("in Fservice");
		return fDao.getFlightByPlaceNDate(depCity, arrivalCity, depDate);
	}
	
	@Override
	public List<Flights> getAllFlightDetails(){
		return fDao.getAllFightDetails();
	}
	
	@Override
	public Flights getFlightDetailsByID(int id) {
		return fDao.getFlightDetailsByID(id);
	}

}
