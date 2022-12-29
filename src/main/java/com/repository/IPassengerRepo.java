package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Passenger;

@Repository
public interface IPassengerRepo extends JpaRepositoryImplementation<Passenger, Integer> {

}
