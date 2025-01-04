package com.example.demo.apirest.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.management.model.TaskEntity;
import com.example.model.TaskDTO;

@Mapper(componentModel = "spring", uses = {TaskManagementDTOMapper.class})
public interface TaskManagementDTOListMapper {

	List<TaskDTO> toTaskDTOList(List<TaskEntity> entity);
}
