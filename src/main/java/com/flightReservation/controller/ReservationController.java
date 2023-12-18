package com.flightReservation.controller;

import java.util.Optional;

import com.flightReservation.repositories.FlightRepository;
import com.flightReservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightReservation.dto.ReservationRequest;
import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Reservation;


@Controller
public class ReservationController {
	@Autowired
    FlightRepository flightRepo;
	
	@Autowired
    ReservationService reservationService;

	@RequestMapping("showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId,ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping("/confirmRegistration")
	public String confirmRegistration(ReservationRequest request,ModelMap modelMap) {
		Reservation savedReservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "You reservationis confirmed.You Reservation id is "+savedReservation.getId());
		return "finalConfirmation";
	}
	
	

}
