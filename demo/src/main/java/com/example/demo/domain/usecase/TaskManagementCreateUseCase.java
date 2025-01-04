package com.example.demo.domain.usecase;

import com.example.demo.management.model.TaskEntity;
import com.example.model.TaskDTO;

import lombok.NonNull;

public interface TaskManagementCreateUseCase {

	TaskDTO createTask(@NonNull TaskEntity entity);
}
