/**
 * <p>
 * This is the package for TraineeServiceImpl class
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.employee.dao.TraineeDAO;
import com.ideas2it.employee.model.Trainee;
import com.ideas2it.employee.service.TraineeService;

/**
 * <p>
 * This class TraineeServiceImpl implements TraineeService
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
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	private TraineeDAO traineeDAO;
	
	/**
     * <p>
     * This method is used to add trainee details into 
     * database with help of getting inputs from the
     * user
     * </p>
     * 
     * @param trainee
     */
	public void addTrainee(Trainee trainee) {
		traineeDAO.save(trainee);					
	}
	
	/**
     * <p>
     * This method is used to get trainees details from 
     * database and also if is_active is true 
     * and the method get all the trainee details.
     * </p>
     */
	public List<Trainee> getTrainees() {		
		return traineeDAO.getTrainees();
	}
	
	/**
     * <p>
     * This method is used to get trainee details from 
     * database with help of getting trainee id
     * from the user
     * </p>
     */
	public Trainee getTrainee(Integer id) {			
		return traineeDAO.getTraineeById(id);	
	}		
}

	
