package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Flight;

@Repository
public interface IFlightRepo extends JpaRepositoryImplementation<Flight, Integer> {

}
