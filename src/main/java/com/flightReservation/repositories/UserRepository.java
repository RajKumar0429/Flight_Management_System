package com.flightReservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
