package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.Payment;

@Repository
public interface IPaymentRepo extends JpaRepositoryImplementation<Payment, Integer> {

}
