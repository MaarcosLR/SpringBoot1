package com.example.demo.apirest.mapper;

import org.mapstruct.Mapper;

import com.example.demo.management.model.TaskEntity;
import com.example.model.CreateTaskRequestDTO;
import com.example.model.TaskDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface TaskManagementDTOMapper.
 */
@Mapper(componentModel = "spring", uses = {TaskManagementMapper.class})

public interface TaskManagementDTOMapper {

	/**
	 * To task entity.
	 *
	 * @param request the request
	 * @return the task entity
	 */
	TaskEntity toTaskEntity(CreateTaskRequestDTO request);
	
	/**
	 * To task DTO.
	 *
	 * @param entity the entity
	 * @return the task DTO
	 */
	TaskDTO toTaskDTO(TaskEntity entity);
	
}
