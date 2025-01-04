package com.example.demo.application.usecase;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.usecase.TaskManagementCompleteUseCase;
import com.example.demo.management.mappers.Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskManagementCompleteUseCaseImpl implements TaskManagementCompleteUseCase{

	@Autowired
	private Repository repository;
	
	@Override
	public void completeTask(Integer id) {

		if(Objects.isNull(id)) {
			
			throw new IllegalArgumentException("Invalid Parameter");
			
		}
		
		this.repository.completeTask(id);
		
	}

}
