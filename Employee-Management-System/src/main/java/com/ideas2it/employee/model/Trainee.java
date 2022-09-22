/**
 * <p>
 * This is the base package for all the model classes
 * which are employee and trainer and trainee class
 * </p>
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * This Trainee class contains getter and setter methods and extends employee
 * and the getter and setter method used for retrieving details and 
 * inserting details into database
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
@Entity
@Table(name="trainee")
public class Trainee extends Employee {
	
	@Column(name ="skill")    	
    private String skill;
	@Column(name = "degree")
    private String degree; 
	@Column(name = "is_active")
	private int isActive = 1;
	
	/**
     * <p>
     * This method used to get skill of trainee 
     * </p>
     *
     * @return skill
     */
    public String getSkill() {
		return skill;
	}
    
    /**
     * <p>
     * This method used to set skill of trainee 
     * </p>
     *
     * @param skill - trainee skill
     *
     * @return void
     */
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	/**
     * <p>
     * This method used to get degree of trainee
     * </p>
     *
     * @return degree
     */
	public String getDegree() {
		return degree;
	}
	
	 /**
     * <p>
     * This method used to set degree of trainee
     * </p>
     *
     * @param degree - trainee degree 
     *
     * @return void
     */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	/**
     * <p>
     * This method used to set isActive of trainee 
     * </p>
     *
     * @param isActive - trainee isActive
     *
     * @return void
     */
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    

}
