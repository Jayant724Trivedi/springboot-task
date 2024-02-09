package com.controller;
import com.model.Registration;
import com.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController("/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("registrations", registrationService.listAllRegistration());
        System.out.println("Returning registrations:");
        return "registrations";
    }

    @GetMapping("/{id}")
    public String showRegistration(@PathVariable Integer id, Model model) {
        model.addAttribute("registration", registrationService.getRegistrationById(id));
        return "registrationshow";
    }

    @PutMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("registration", registrationService.getRegistrationById(id));
        return "registrationform";
    }

    @RequestMapping("registration/new")
    public String newProduct(Model model) {
        model.addAttribute("registration", new Registration());
        return "registrationform";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String saveRegistration(Registration registration) {
        registrationService.saveRegistration(registration);
        return "redirect:/registration/" + registration.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        registrationService.deleteRegistration(id);
        return "redirect:/registrations";
    }
}