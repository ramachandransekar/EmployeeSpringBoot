/**
 * <p>
 * This is the package for TrainerServiceImpl class
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.employee.dao.TrainerDAO;
import com.ideas2it.employee.model.Trainer;
import com.ideas2it.employee.service.TrainerService;

/**
 * <p>
 * This class TrainerServiceImpl implements TrainerService
 * with help retrieving and passing the details to the dao
 * interface
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
@Service
@Transactional
public class TrainerServiceImpl implements TrainerService{

	@Autowired TrainerDAO trainerDAO;
	
	/**
     * <p>
     * This method is used to add trainer details into 
     * database with help of getting inputs from the
     * user
     * </p>
     * 
     * @param trainee
     */
	@Override
	public void addTrainer(Trainer trainer) {
		trainerDAO.save(trainer);		
	}

	/**
     * <p>
     * This method is used to get trainers details from 
     * database and also if is_active is true 
     * and the method get all the trainee details.
     * </p>
     */
	@Override
	public List<Trainer> getTrainers() {		
		return trainerDAO.getTrainers();
	}

	/**
     * <p>
     * This method is used to get trainer details from 
     * database with help of getting trainer id
     * from the user
     * </p>
     */
	@Override
	public Trainer getTrainer(Integer id) {
		return trainerDAO.getTrainerById(id);
	}

}
