package com.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.entity.FlightBooking;
import com.flightbooking.repository.FlightBookingRepository;

@RestController
@RequestMapping("/bookings/flights")
public class FlightBookingController {
    @Autowired
    private FlightBookingRepository flightBookingRepository;

    @GetMapping
    public List<FlightBooking> getAll() {
    	List<FlightBooking> flightBookingList=flightBookingRepository.findAll();
        return flightBookingList;
    }

    @GetMapping("/{id}")
    public FlightBooking getFlightBookingById(@PathVariable Long id) {
        FlightBooking flightBooking= flightBookingRepository.findById(id).get();
        return flightBooking;
    }

    @PostMapping
    public String bookFlight(@RequestBody FlightBooking flightBooking) {
         flightBookingRepository.save(flightBooking);
         return "Flight Book successfully";
    }

    @PutMapping("/{id}")
    public String updateFlightBooking(@PathVariable Long id, @RequestBody FlightBooking flightBooking) {
        flightBookingRepository.save(flightBooking);
        return "Updated flight booking successfully";
    }

    @DeleteMapping("/{id}")
    public String cancelFlightBooking(@PathVariable Long id) {
        flightBookingRepository.deleteById(id);
        return "Canceled Flight Successfully";
    }
}
