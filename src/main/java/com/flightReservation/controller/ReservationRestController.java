package com.flightReservation.controller;

import java.util.Optional;

import com.flightReservation.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightReservation.entities.Reservation;


@RestController
public class ReservationRestController {
	
	@Autowired
    ReservationRepository reservationRepo;
	private Optional<Reservation> findById;
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	
	
}
