/**
 * <p>
 * This is the package for TraineeDAO interface
 * </p>
 *
 * Copyright 2022 - Ideas2it
 */
package com.ideas2it.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ideas2it.employee.model.Trainee;

/**
 * <p>
 * Interface TraineeDAO used to implements JpaRepository
 * and used to retrieve and delete and update  
 * trainees data
 * </p>
 *
 * @author  Ramachandran
 *
 * @version 1
 *
 * @since   2022-07-18
 */
@Repository
public interface TraineeDAO extends JpaRepository<Trainee, Integer>{

	/**  
     * <p>
     * This abstract method is used to retrieve trainees
     * details from database 
     * detail
     * </p>
     * 
     * @return List<Trainee> - list of the trainer
     */
	@Query("from Trainee where is_active = 1")
	public List<Trainee> getTrainees();

	/**  
     * <p>
     * This abstract method is used for retrive trainee
     * details from database using id
     * </p>
     *
     * @param id - id of the trainee
     *
     * @return trainee 
     */
	@Query("from Trainee where id IN ?1 and is_active = 1")
	public Trainee getTraineeById(Integer id);
	

}
