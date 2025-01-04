package com.example.demo.apirest.mapper;

import org.mapstruct.Mapper;

import com.example.demo.management.model.TaskStatusEnum;
import com.example.model.CreateTaskRequestDTO.StatusEnum;

@Mapper(componentModel = "spring")
public interface TaskManagementMapper {

	TaskStatusEnum toTaskStatusEnum(StatusEnum statusEnum);
}
