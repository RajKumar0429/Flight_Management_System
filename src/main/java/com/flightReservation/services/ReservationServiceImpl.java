package com.flightReservation.services;

import java.util.Optional;

import com.flightReservation.repositories.FlightRepository;
import com.flightReservation.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightReservation.dto.ReservationRequest;
import com.flightReservation.entities.Flight;
import com.flightReservation.entities.Passenger;
import com.flightReservation.entities.Reservation;
import com.flightReservation.repositories.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
    FlightRepository flightRepo;
	
	@Autowired
    PassengerRepository PassengerRepo;
	
	@Autowired
	ReservationRepository reservationRepo;

	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		
		Passenger p = new Passenger();
		p.setFirstName(request.getPassengerFirstName());
		p.setLastName(request.getPassengerLastName());
		p.setEmail(request.getPassengerEmail());
		p.setPhone(request.getPassengerMobile());
		Passenger savedPassenger = PassengerRepo.save(p);
		
		Reservation r = new Reservation();
		r.setFlight(flight);
		r.setPassenger(savedPassenger);
		r.setCheckedIn(false);
		Reservation savedReservation = reservationRepo.save(r);
		
		return savedReservation ;
	}

}
