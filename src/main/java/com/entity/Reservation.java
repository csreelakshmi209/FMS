package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String reservationNumber;
	private String origin;
	private String destination;
	private double price;
	
	@ManyToOne(targetEntity=Passenger.class, cascade=CascadeType.DETACH)
	@JsonIgnoreProperties({"age", "gender","phone","reservations","flight"})
	private Passenger passenger;
	
	@ManyToMany(targetEntity=Flight.class)
	@JsonIgnoreProperties({"price","seatsLeft","description","plane","passengers"})
	private List<Flight> flight;
}
