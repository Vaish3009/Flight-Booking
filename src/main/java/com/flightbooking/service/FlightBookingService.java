package com.flightbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.entity.FlightBooking;
import com.flightbooking.repository.FlightBookingRepository;

@Service
public class FlightBookingService {
    @Autowired
    private FlightBookingRepository flightBookingRepository;

    public List<FlightBooking> getAllFlightBookings() {
        return flightBookingRepository.findAll();
    }

    public FlightBooking getFlightBookingById(Long id) {
        return flightBookingRepository.findById(id).get();
    }

    public FlightBooking bookFlight(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }

    public FlightBooking updateFlightBooking(Long id, FlightBooking flightBooking) {
        return flightBookingRepository.findById(id).get();
    }

    public void cancelFlightBooking(Long id) {
        flightBookingRepository.deleteById(id);
    }
}

