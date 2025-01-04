package com.example.demo.management.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.management.model.TaskEntity;

/**
 * The Interface TaskMapper.
 */
@Mapper
public interface Repository {

	/**
	 * Gets the task by id.
	 *
	 * @param Id the id
	 * @return the task by id
	 */
	TaskEntity getTaskById(Integer Id);
	
	/**
	 * Gets the all tasks.
	 *
	 * @return the all tasks
	 */
	List<TaskEntity> getAllTasks();
	
	/**
	 * Gets the sub tasks by id.
	 *
	 * @param Id the id
	 * @return the sub tasks by id
	 */
	Integer getSubTasksById(Integer Id);
	

	/**
	 * Creates the task.
	 */
	void createTask(TaskEntity entity);
	
	/**
	 * Complete task.
	 *
	 * @param Id the id
	 */
	void completeTask(Integer Id);
	
	/**
	 * Delete task.
	 *
	 * @param Id the id
	 */
	void deleteTask(Integer Id);
	
}
