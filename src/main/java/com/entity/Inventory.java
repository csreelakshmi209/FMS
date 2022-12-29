package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inventoryId;
	private int remainingEconomySeats;
	private int remainingPremiumSeats;
	private int remainingBusinessSeats;
}
