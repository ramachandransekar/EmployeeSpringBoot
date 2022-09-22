/**
 * <p>
 * This is the package for TrainerService interface
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.service;

import java.util.List;

import com.ideas2it.employee.model.Trainer;

/**
 * <p>
 * Interface Trainerservice used to implements Trainerserviceimpl
 * and it contains the methods with helps of passing object to
 * trainer dao class
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
public interface TrainerService {

	/**  
     * <p>
     * This abstract method is uesd to add trainer detail
     * into database
     * </p>
     * 
     * @param trainer
     * 
     * @return void 
     */
	public void addTrainer(Trainer trainer);

	/**  
     * <p>
     * This abstract method is uesd to get trainers details
     * from the database
     * </p>
     */
	public List<Trainer> getTrainers();

	/**  
     * <p>
     * This abstract method is uesd to get trainer detail
     * from database with help of using trainer id 
     * </p>
     *
     * @param id - id of the employee
     */
	public Trainer getTrainer(Integer id);

}
