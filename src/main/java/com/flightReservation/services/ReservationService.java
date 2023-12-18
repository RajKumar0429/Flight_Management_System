package com.flightReservation.services;

import com.flightReservation.dto.ReservationRequest;
import com.flightReservation.entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);

}
