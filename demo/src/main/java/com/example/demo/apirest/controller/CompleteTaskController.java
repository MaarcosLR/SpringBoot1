package com.example.demo.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import com.example.api.TaskApi;
import com.example.demo.domain.usecase.TaskManagementCompleteUseCase;

@Validated
@RestController
public class CompleteTaskController implements TaskApi {
	
	@Autowired
	private TaskManagementCompleteUseCase taskManagementCompleteUseCase;
	
	@Override
	public ResponseEntity<Void> completeTask (Integer id){
		
		this.taskManagementCompleteUseCase.completeTask(id);
		
		return new ResponseEntity<Void>(HttpStatusCode.valueOf(201));
		
	}
}
