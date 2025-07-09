package com.first.FirstStep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.FirstStep.model.UserDetails;

@Repository
public interface userRepository extends JpaRepository<Integer, UserDetails> {

}
