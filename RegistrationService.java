package com.services;
import com.model.Registration;
public interface RegistrationService {

    Iterable<Registration> listAllRegistration();

    Registration getRegistrationById(Integer id);

    Registration saveRegistration(Registration registration);
    void deleteRegistration(Integer id);
}