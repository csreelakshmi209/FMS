package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String cardNumber;
	private String cardHolderName;
	private String cvv;
	private String month;
	private String year;
}
