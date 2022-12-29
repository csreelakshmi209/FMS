package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Reservation;

@Repository
public interface IReservationRepo extends JpaRepositoryImplementation<Reservation, Integer> {

}
