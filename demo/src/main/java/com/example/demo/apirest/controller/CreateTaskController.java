package com.example.demo.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.TaskApi;
import com.example.demo.apirest.mapper.TaskManagementDTOMapper;
import com.example.demo.domain.usecase.TaskManagementCreateUseCase;
import com.example.model.CreateTaskRequestDTO;
import com.example.model.TaskDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateTaskController.
 */
@Validated
@RestController
public class CreateTaskController implements TaskApi{


	/** The task management create use case. */
	@Autowired
	private TaskManagementCreateUseCase taskManagementCreateUseCase;
	
	/** The mapper. */
	@Autowired
	private TaskManagementDTOMapper mapper;
	
	/**
	 * Creates the task.
	 *
	 * @param createTaskRequestDTO the create task request DTO
	 * @return the response entity
	 */
	@Override
	public ResponseEntity<TaskDTO> createTask(CreateTaskRequestDTO createTaskRequestDTO){
	
		final TaskDTO result = taskManagementCreateUseCase.createTask((this.mapper.toTaskEntity(createTaskRequestDTO)));
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
