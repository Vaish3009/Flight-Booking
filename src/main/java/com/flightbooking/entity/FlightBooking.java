package com.flightbooking.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flightBooking")
public class FlightBooking {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String passengerName;
	    private String flightNumber;
	    private String origin;
	    private String destination;
	    private LocalDateTime departureDateTime;
	    private LocalDateTime arrivalDateTime;
	    // Constructors, getters, and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public LocalDateTime getDepartureDateTime() {
			return departureDateTime;
		}
		public void setDepartureDateTime(LocalDateTime departureDateTime) {
			this.departureDateTime = departureDateTime;
		}
		public LocalDateTime getArrivalDateTime() {
			return arrivalDateTime;
		}
		public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
			this.arrivalDateTime = arrivalDateTime;
		}
		
		@Override
		public String toString() {
			return "FlightBooking [id=" + id + ", passengerName=" + passengerName + ", flightNumber=" + flightNumber
					+ ", origin=" + origin + ", destination=" + destination + ", departureDateTime=" + departureDateTime
					+ ", arrivalDateTime=" + arrivalDateTime + "]";
		}
	   

}
