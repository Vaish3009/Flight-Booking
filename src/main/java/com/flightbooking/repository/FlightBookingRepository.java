package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.entity.FlightBooking;
@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long>{

}
