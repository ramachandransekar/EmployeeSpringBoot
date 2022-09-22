/**
 * <p>
 * This is the base package for all the model classes
 * which are employee and trainer and trainee class
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * This Trainee class contains getter and setter methods and extends employee
 * the getter and setter methods used for getting and setting the details into
 * database 
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
@Entity
@Table(name="trainer")
public class Trainer extends Employee {

	@Column(name = "project_count")
    private int projectCount;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "is_active")
	private int isActive = 1;
    
    /**
     * <p>
     * This method used to get project count  of trainer 
     * </p>
     *
     * @return projectCount 
     */
	public int getProjectCount() {
		return projectCount;
	}
	
	/**
     * <p>
     * This method used to set project count of trainer 
     * </p>
     *
     * @param projectCount - trainer projectCount
     *
     * @return void
     */
	public void setProjectCount(int projectCount) {
		this.projectCount = projectCount;
	}
	
	/**
     * <p>
     * This method used to get project name  of trainer 
     * </p>
     *
     * @return projectName 
     */
	public String getProjectName() {
		return projectName;
	}
	
	/**
     * <p>
     * This method used to set project name of trainer 
     * </p>
     *
     * @param projectName - trainer projectName
     *
     * @return void
     */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
