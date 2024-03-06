package com.thenxprogrammer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thenxprogrammer.demo.domain.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

	Registration findByEmail(String email);

	Registration findByUserName(String userName);

	
	
}
