package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Booking;

@Repository
public interface IBookingRepo extends JpaRepositoryImplementation<Booking, Integer> {

}
