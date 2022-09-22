/**
 * <p>
 * This is the package for TrainerDAO interface
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ideas2it.employee.model.Trainer;

/**
 * <p>
 * Interface TrainerDAO used to implements JpaRepository
 * and used to retrieve and delete and update  
 * trainers data
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
@Repository
public interface TrainerDAO extends JpaRepository<Trainer,Integer>{

	/**  
     * <p>
     * This abstract method is used to retrieve trainers
     * details from database 
     * detail
     * </p>
     * 
     * @return List<Trainee> - list of the trainer
     */
	@Query("from Trainer where is_active = 1")
	List<Trainer> getTrainers();
    
	/**  
     * <p>
     * This abstract method is used for retrive trainer
     * details from database using id
     * </p>
     *
     * @param id - id of the trainee
     *
     * @return trainee 
     */
	@Query("from Trainer where id IN ?1 and is_active = 1")
	Trainer getTrainerById(Integer id);

	

}
