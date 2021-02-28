package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.Flights;

public interface IFlightDao {
	public List<Flights> getFlightByPlaceNDate(String depCity, String arrivalCity, LocalDate depDate);

	List<Flights> getAllFightDetails();

	Flights getFlightDetailsByID(int id);
}
