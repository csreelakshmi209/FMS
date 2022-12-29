package com.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface IUserRepo extends JpaRepositoryImplementation<User, Integer> {

}
