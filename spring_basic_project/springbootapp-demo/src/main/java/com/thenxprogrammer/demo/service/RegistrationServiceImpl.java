package com.thenxprogrammer.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.thenxprogrammer.demo.dao.RegistrationDAO;
import com.thenxprogrammer.demo.domain.Registration;
import com.thenxprogrammer.demo.dto.RegistrationDto;
import com.thenxprogrammer.demo.dto.ResponseDto;
import com.thenxprogrammer.demo.exception.DuplicateEmailException;
import com.thenxprogrammer.demo.exception.DuplicateUserNameException;
import com.thenxprogrammer.demo.exception.UserNameExistException;
import com.thenxprogrammer.demo.repository.RegistrationRepository;
import com.thenxprogrammer.demo.util.SpringBootAppUtil;

@Service("register")
@Primary
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	@Autowired
	private SpringBootAppUtil springBootAppUtil;

	public ResponseEntity<String> registerUser(RegistrationDto registrationDto) {

		Registration reg = registrationRepository.findByEmail(registrationDto.getEmail());
		if (reg != null) {
			throw new DuplicateEmailException("Email Alredy exist");
		}

		reg = registrationRepository.findByUserName(registrationDto.getUserName());

		if (reg != null) {
			throw new DuplicateUserNameException("User Alredy exist");
		}
		// insert a record
		try {
			Registration registration = new Registration();
			registration.setCity(registrationDto.getCity());
			registration.setLastName(registrationDto.getFirstName());
			registration.setUserName(registrationDto.getUserName());
			registration.setEmail(registrationDto.getEmail());
			registration.setMobNo(registrationDto.getMobNo());
			registration.setState(registrationDto.getState());
			registration.setFirstName(registrationDto.getFirstName());

			registrationRepository.save(registration);// here spring jpa fire insert query for me

			return new ResponseEntity<String>("Regitration Sucessful", HttpStatus.CREATED);
			// return springBootAppUtil.response("Regsitration Sucessful",
			// Integer.valueOf(HttpStatus.CREATED.toString()));

		} catch (DuplicateEmailException e) {
			// throw new UserNameExistException("User Name Already Exist");
			throw e;
		} catch (DuplicateUserNameException e) {
			throw e;
		} catch (DataAccessException e) {
			// log
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
