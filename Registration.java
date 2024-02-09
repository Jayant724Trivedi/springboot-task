package com.model;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="registration")
public class Registration {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@NotBlank
    private String fullName;
	
	@NotBlank
    private String gender;
	
	@NotBlank
    private String address;
	
	@NotBlank
    private String city;

    @Pattern(regexp = "\\d{6}", message = "Pin must be a 6-digit number")
    private int pin;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

    @Email
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Contact must be a 10-digit number")
    private int contact;
    
    @NotBlank
    private String educationQualification;
    
    @NotBlank
    private String designation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getContact() {
		return contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", address=" + address
				+ ", city=" + city + ", pin=" + pin + ", state=" + state + ", country=" + country + ", email=" + email
				+ ", contact=" + contact + ", educationQualification=" + educationQualification + ", designation="
				+ designation + "]";
	}
}
