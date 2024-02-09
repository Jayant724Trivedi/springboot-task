package com.services;
import com.model.Registration;
import com.repo.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistService implements RegistrationService{
    @Autowired
    private RegistrationRepository registrationRepository;



    @Override
    public Iterable<Registration> listAllRegistration() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration getRegistrationById(Integer id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Integer id) {
        registrationRepository.deleteById(id);
    }
}
