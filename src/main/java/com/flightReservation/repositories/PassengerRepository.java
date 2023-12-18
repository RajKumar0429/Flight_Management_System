package com.flightReservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
