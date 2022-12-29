package com.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String flightName;
	private String flightModel;
	private int flightPrice;
	private String origin;
	private String destination;
	private Date departureDate;
	private Date arrivalDate;
	
	private int totalEconomySeats;
	private int totalPremiumSeats;
	private int totalBusinessSeats;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Inventory inventory;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Fare fare;
	
	@ManyToMany(targetEntity=Passenger.class)
	@JsonIgnoreProperties({"age", "gender","phone","reservations","flight"})
	private List<Passenger> passengers;
}
