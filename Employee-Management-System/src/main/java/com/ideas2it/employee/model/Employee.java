/**
 * <p>
 * This is the base package for all the model classes
 * which are employee and trainer and trainee class
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * <p>
 * This employee class contains getter and setter methods for
 * inserting and retrieving details from database
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */

@MappedSuperclass
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	@Column(name="email")
	private String email;
	@Column(name="contact_number")
	private long contactNumber;
	@Column(name="alternate_contact_number")
	private long alternateContactNumber;
	@Column(name="address")
	private String address;
	@Column(name="year_of_graduation")
	private int yearOfGraduation;
	@Column(name="primary_language")
	private String primaryLanguage;
	@Column(name="aadharcard_number")
	private long aadharcardNumber; 
	@Column(name="pancard_number")
	private String pancardNumber;
	@Transient
    private static String companyname = "ideas2it";
	
	/**
     * <p>
     * This method used to get employee id
     * </p>
     * 
     * @return the employee id
     */	
	public int getId() {
		return id;
	}
	
	/**
     * <p>
     * This method used to set employee id
     * </p>
     *
     * @param id - employee id
     *
     * @return void
     */	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
     * <p>
     * This method used to get employee name
     * </p>
     * 
     * @return the employee name
     */	
	public String getName() {
		return name;
	}
	
	/**
     * <p>
     * This method used to set employee name
     * </p>
     *
     * @param name - employee name
     *
     * @return void
     */	
	public void setName(String name) {
		this.name = name;
	}
		
	/**
     * <p>
     * This method used to set employee date of birth
     * </p>
     *
     * @param date of birth - employee date of birth
     *
     * @return void
     */	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
     * <p>
     * This method used to get employee dateOfBirth
     * </p>
     *
     * @return the employee dateOfBirth
     */			
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * <p>
     * This method used to get email
     * </p>
     *
     * @return email
     */	
	public String getEmail() {
		return email;
	}
	
	/**
     * <p>
     * This method used to set employee email
     * </p>
     *
     * @param email - employee email
     *
     * @return void
     */	
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
     * <p>
     * This method used to get employee contact number
     * </p>
     *
     * @return contactNumber
     */	
	public long getContactNumber() {
		return contactNumber;
	}
	
	/**
     * <p>
     * This method used to set employee contact number
     * </p>
     *
     * @param contactNumber - employee contact number
     *
     * @return void
     */	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	/**
     * <p>
     * This method used to get employee alternate contact number
     * </p>
     *
     * @return alternateContactNumber
     */	
	public long getAlternateContactNumber() {
		return alternateContactNumber;
	}
	
	/**
     * <p>
     * This method used to set employee alternate contact number
     * </p>
     *
     * @param alternateContactNumber - employee alternate contact number
     *
     * @return void
     */	
	public void setAlternateContactNumber(long alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}
	
	/**
     * <p>
     * This method used to get employee address
     * </p>
     *
     * @return address
     */	
	public String getAddress() {
		return address;
	}
	
	/**
     * <p>
     * This method used to set employee address
     * </p>
     *
     * @param address - employee address
     *
     * @return void
     */	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
     * <p>
     * This method used to get employee year of graduation
     * </p>
     *
     * @return yearOfGraduation
     */
	public int getYearOfGraduation() {
		return yearOfGraduation;
	}
	
	/**
     * <p>
     * This method used to set employee year of graduation
     * </p>
     *
     * @param yearOfGraduation - employee year of graduation
     *
     * @return void
     */	
	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}
	
	/**
     * <p>
     * This method used to get employee primary language
     * </p>
     *
     * @return yearOfGraduation
     */
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}
	
	/**
     * <p>
     * This method used to set employee primary language
     * </p>
     *
     * @param primaryLanguage - employee primary language
     *
     * @return void
     */	
	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}
	
	/**
     * <p>
     * This method used to get employee aadharNumber
     * </p>
     *
     * @return the employee aadharNumber
     */	
	public long getAadharcardNumber() {
		return aadharcardNumber;
	}
	
	/**
     * <p>
     * This method used to set employee aadharNumber
     * </p>
     *
     * @param aadharNumber - employee aadharNumber 
     *
     * @return void
     */	
	public void setAadharcardNumber(long aadharcardNumber) {
		this.aadharcardNumber = aadharcardNumber;
	}
	
	 /**
     * <p>
     * This method used to get employee pancardNumber
     * </p>
     *
     * @return the employee pancardNumber
     */	
	public String getPancardNumber() {
		return pancardNumber;
	}
	
	/**
     * <p>
     * This method used to set employee pancardNumber
     * </p>
     *
     * @param pancardNumber - employee pancardNumber 
     *
     * @return void
     */
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
			
}
