package com.example.demo.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.apirest.mapper.TaskManagementDTOMapper;
import com.example.demo.domain.usecase.TaskManagementCreateUseCase;
import com.example.demo.management.mappers.Repository;
import com.example.demo.management.model.TaskEntity;
import com.example.model.TaskDTO;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * The Class TaskManagementCreateUseCaseImpl.
 */
@Service
@RequiredArgsConstructor
public class TaskManagementCreateUseCaseImpl implements TaskManagementCreateUseCase{

	/** The repository. */
	@Autowired
	private Repository repository;
	
	/** The mapper. */
	@Autowired
	private TaskManagementDTOMapper mapper;
	
	/**
	 * Creates the task.
	 *
	 * @param entity the entity
	 * @return the task DTO
	 */
	@Override
	public TaskDTO createTask(@NonNull TaskEntity entity) {
		
		this.repository.createTask(entity);
		
		return this.mapper.toTaskDTO(this.repository.getTaskById(entity.getId()));
	}

}
