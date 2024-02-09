package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
