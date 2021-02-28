package com.app.service;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.Flights;

public interface IFlightService {
	public List<Flights> getFlightByPlaceNDate(String depCity, String arrivalCity, LocalDate depDate);

	List<Flights> getAllFlightDetails();

	Flights getFlightDetailsByID(int id);
}
