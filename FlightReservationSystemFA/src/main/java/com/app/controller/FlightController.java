package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Flights;
import com.app.service.IFlightService;

@Controller
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private IFlightService fService;
	
	@GetMapping("/search")
	public String showSearchPage(Model modelMap) {
		modelMap.addAttribute("all_flightD", fService.getAllFlightDetails());
		return "/flight/search";
	}
	
	@PostMapping("/search")
	public String processSearchPage(@RequestParam String depCity, @RequestParam String arrivalCity, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate depDate, Model modelMap, RedirectAttributes flashMap) {
		try {
			List<Flights> flightList = fService.getFlightByPlaceNDate(depCity, arrivalCity, depDate);
			flightList.forEach(System.out :: println);
			System.out.println("in process Search Page");
			flashMap.addFlashAttribute("flight_details", flightList);
			return "redirect:/flight/display";
		}catch(RuntimeException e) {
			System.out.println("error in "+e);
			modelMap.addAttribute("message", "No Flights Found !!!!");
			return "/flight/search";
		}	
	}
	
	@GetMapping("/display")
	public String showDisplayPage(Model modelMap) {
		return "/flight/display";
	}
	
	
}





















