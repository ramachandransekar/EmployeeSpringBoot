/**
 * <p>
 * This is the package for TraineeService interface
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.service;

import java.util.List;

import com.ideas2it.employee.model.Trainee;

/**
 * <p>
 * Interface Traineeservice used to implements Traineeserviceimpl
 * and it contains the methods with helps of passing object to
 * trainee dao class
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
public interface TraineeService {

	/**  
     * <p>
     * This abstract method is uesd to add trainee detail
     * into database
     * </p>
     * 
     * @param trainee
     * 
     * @return void 
     */
	public void addTrainee(Trainee trainee);
	
	/**  
     * <p>
     * This abstract method is uesd to get trainees details
     * from database
     * </p>
     */
	public List<Trainee> getTrainees();

	/**  
     * <p>
     * This abstract method is uesd to get trainee detail
     * from database with help of using trainee id 
     * </p>
     *
     * @param id - id of the employee
     */
	public Trainee getTrainee(Integer id);
}
