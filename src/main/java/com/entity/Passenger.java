package com.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Date dob;
	private String passportNumber;
	private String nationality;
	private String address;
	
	@OneToMany(targetEntity=Reservation.class, cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"passenger", "price","flights"})
	private List<Reservation> reservations;
}
