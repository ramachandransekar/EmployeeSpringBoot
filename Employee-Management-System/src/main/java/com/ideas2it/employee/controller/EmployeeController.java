/**
 * <p>
 * This is the package for employeecontroller class
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ideas2it.employee.model.Trainee;
import com.ideas2it.employee.model.Trainer;
import com.ideas2it.employee.service.TraineeService;
import com.ideas2it.employee.service.TrainerService;

/**             
 * <p>
 * EmployeeController class with the helps of getting inputs 
 * from user and passing to employeeservice to store the datas
 * into the database and it help to do CRUD operation
 * </p>
 *
 * @author Ramachandran
 *
 * @version 1
 *
 * @since 2022-07-18
 */
@RestController
public class EmployeeController {
	
	@Autowired 
	private TraineeService traineeService;
	
	@Autowired 
	private TrainerService trainerService;
	
	/**
     * <p>
     * This method used to add trainee details
     * by getting inputs from the user 
     * </p>
     *
     * @return void
     */
	@PostMapping("/addTrainee")
	public void addTrainee(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);	
	}
	
	/**
     * <p>
     * This method used to add trainer details
     * by getting inputs from the user 
     * </p>
     *
     * @return void
     */
	@PostMapping("/addTrainer")
	public void addTrainer(@RequestBody Trainer trainer) {
		trainerService.addTrainer(trainer);
	}
	
	/**
     * <p>
     * This method used to delete trainee details
     * by getting trainee id  from the user 
     * </p>
     *
     * @return void
     */
	@PostMapping("/deleteTrainee/{id}")
	public void deleteTrainee(@PathVariable Integer id) {
		Trainee existTrainee = traineeService.getTrainee(id); //trainee
		existTrainee.setIsActive(0);	
		traineeService.addTrainee(existTrainee);
	}
	
	/**
     * <p>
     * This method used to delete trainer details
     * by getting trainee id  from the user 
     * </p>
     *
     * @return void
     */
	@PostMapping("/deleteTrainer/{id}")
	public void deleteTrainer(@PathVariable Integer id) {
		Trainer existTrainer =trainerService.getTrainer(id);
		existTrainer.setIsActive(0);	
		trainerService.addTrainer(existTrainer);
	}
	
	/**
     * <p>
     * This method used to get trainees details
     * form the database
     * by 
     * </p>
     *
     * @return List<Trainee> - list of trainee
     */
	@GetMapping("/getTrainees")
	public List<Trainee> getTrainees() {
		return traineeService.getTrainees();		
	}
	
	/**
     * <p>
     * This method used to get trainers details
     * form the database
     * by 
     * </p>
     *
     * @return List<Trainer> - list of trainer
     */
	@GetMapping("/getTrainers")
	public List<Trainer> getTrainers() {
		return trainerService.getTrainers();		
	}
	
	/**
     * <p>
     * This method used to get trainee details
     * form the database
     * by 
     * </p>
     *
     * @return Trainer    
     */
	@GetMapping("/getTrainee/{id}")
	public Trainee getTrainee(@PathVariable Integer id) {		
		return traineeService.getTrainee(id);
	}
	
	/**
     * <p>
     * This method used to get trainer details
     * form the database
     * by 
     * </p>
     *
     * @return Trainer    
     */
	@GetMapping("/getTrainer/{id}")
	public Trainer getTrainer(@PathVariable Integer id) {
		return trainerService.getTrainer(id);
	}	
}
