package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fare {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
}
