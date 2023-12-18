package com.flightReservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightReservation.entities.Reservation;
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
