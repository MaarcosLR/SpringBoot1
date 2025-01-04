package com.example.demo.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.TaskApi;
import com.example.demo.domain.usecase.TaskManagementDeleteUseCase;

@Validated
@RestController
public class DeleteTaskController implements TaskApi{
	
	@Autowired
	private TaskManagementDeleteUseCase taskManagementDeleteUseCase;
	
	@Override
	public ResponseEntity<Void> deleteTask (Integer id){
		
		this.taskManagementDeleteUseCase.deleteTask(id);
		
		return new ResponseEntity<Void>(HttpStatusCode.valueOf(204));
		
	}

}
