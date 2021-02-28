package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Flights;
import com.app.pojos.Passenger;
import com.app.pojos.Reservation;
import com.app.service.IFlightService;
import com.app.service.IPassengerService;
import com.app.service.IReservationService;

@Controller
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	private IFlightService fService;

	@Autowired
	private IPassengerService pService;

	@Autowired
	private IReservationService rService;

	@GetMapping("/details")
	public String showPassengerDetailsPage(@RequestParam int fid, Model map, HttpSession hs) {
		Flights f = fService.getFlightDetailsByID(fid);
		hs.setAttribute("flight_http",f);
		map.addAttribute("selected_details", f.getFlightName() + " " + f.getDepCity() + " " + f.getArrivalCity());
		return "/passenger/details";
	}

	@PostMapping("/details")
	public String processPassengerDetailPage(/*@RequestParam int fid,*/ @RequestParam String name,@RequestParam String email,@RequestParam String pno, Model map, HttpSession hs) {
		pService.registerPssenger(name, email, pno);
		Passenger p = pService.getPassengerByEmail(email);
		hs.setAttribute("passengerD", p);
		return "redirect:/passenger/card_details";
	}

	@GetMapping("/card_details")
	public String showCardDetails() {
		return "/passenger/card_details";
	}

	@PostMapping("/card_details")
	public String processCardDetails(RedirectAttributes flashMap,  Model map, HttpSession hs) {
		Flights f = (Flights)hs.getAttribute("flight_http");
		Passenger p = (Passenger)hs.getAttribute("passengerD");
		System.out.println(p);
		System.out.println(f);
		Reservation r = new Reservation(p, f);
		rService.register(r);
		Reservation r1 = rService.getReservationByPassenger(p);
		System.out.println(r1);		
		 map.addAttribute("reservation_details", "Reservation Done with :"+r1);
		map.addAttribute("status", "Reservation Status : Succesfull");		
		hs.invalidate();
		return "/passenger/status";
	}

	@GetMapping("/status")
	public String showStatusPage() {
		return "/passenger/status";
	}

}
