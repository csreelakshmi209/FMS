package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private Date bookingDate;
	private Date travelDate;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Flight flight;
	
//	@OneToOne(fetch = FetchType.EAGER)
//	private Inventory inventory;
}
